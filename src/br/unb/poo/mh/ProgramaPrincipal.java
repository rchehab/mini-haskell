package br.unb.poo.mh;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String [] args) throws IOException
	{
		String s;
		Scanner ler = new Scanner(System.in);
		
		boolean verifica_tipo = false;
		
		
		while (true) {
			System.out.println("\tImprima quit\t para sair");
			System.out.println("\tImprima load(example.hs)\t para executar a funcao contido no arquivo example.hs");
			System.out.println("Esse arquivo deve conter somente uma funcao");
			System.out.println("\tImprima set\t para ativar a verificacao de tipos");
			System.out.println("\tImprima reset\t para desativar a verificacao de tipo");
			System.out.println("Aviso: Se for utilizada uma função recursiva a verificacao de tipos deve estar desativada,");
			System.out.println("caso contrario pode ocorrer um problema de execucao\n");
			System.out.println("Verificacao de tipos " + (verifica_tipo ? "" : "des") + "ativada\n");
			
			System.out.print("Haskell> ");
			
			s = ler.nextLine();
			
			if (s.contentEquals("quit")) {
				return;
			}
			if (s.contentEquals("set")) {
				verifica_tipo = true;
				continue;
			}
			if (s.contentEquals("reset")) {
				verifica_tipo = false;
				continue;
			}
			String tree;
			if (s.substring(0, 4).contentEquals("load")) {
				String fn = s.substring(5, s.length() - 1);
				File fp = new File(fn);
				tree = ParserTranslator.parse(fp);
			} else {
				tree = ParserTranslator.parse(s);
			}
			String dec = tree.split("\\(")[0];
			
			CreateExpressao ce = new CreateExpressao();
			
			switch(dec) {
			case "DeclaracaoFuncao":
				DeclaracaoFuncao decla = ce.choose2(tree);

				Ambiente.instance().declaraFuncao(decla);
				
				if (verifica_tipo) {
					if (decla.tipo(Tipo.Indefinido) == Tipo.Error) {
						System.out.println("Expressao dada contêm erro de tipos\n");
						Ambiente.instance().desdeclaraFuncao(decla);
						break;
					}
					System.out.print(":: ");
					System.out.println(decla.tipo(Tipo.Indefinido));
				}
				break;
			default:
				Expressao e = ce.choose(tree);

				if (verifica_tipo) {
				if (e.tipo(Tipo.Indefinido) == Tipo.Error) {
					System.out.println("Expressao dada contêm erro de tipos\n");
					break;
				}
				System.out.print(":: ");
				System.out.println(e.tipo(Tipo.Indefinido));
				}
				
				Valor a = e.avaliar();
				
				PrettyPrinter pp = new PrettyPrinter();
				
				a.aceitar(pp);
				
				System.out.println(pp.getStr());
				
				break;
			}
		}
	}
}
