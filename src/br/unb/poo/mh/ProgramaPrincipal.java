package br.unb.poo.mh;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String [] args) throws IOException
	{
		String s;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Imprima quit para sair");
		
		while (true) {
			System.out.print("Haskell> ");
			s = ler.nextLine();
			
			if (s.contentEquals("quit")) {
				return;
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
				
				/*if (decla.tipo(Tipo.Indefinido) == Tipo.Error) {
					System.out.println("Expressao dada contêm erro de tipos\n");
					Ambiente.instance().desdeclaraFuncao(decla);
					break;
				}
				System.out.print(":: ");
				System.out.println(decla.tipo(Tipo.Indefinido));*/
				break;
			default:
				Expressao e = ce.choose(tree);
				
				/*if (e.tipo(Tipo.Indefinido) == Tipo.Error) {
					System.out.println("Expressao dada contêm erro de tipos\n");
					break;
				}
				System.out.print(":: ");
				System.out.println(e.tipo(Tipo.Indefinido));*/
				
				Valor a = e.avaliar();
				
				if (a instanceof ValorBooleano) {
					System.out.println(((ValorBooleano) a).getValor());	
				} else {
					System.out.println(((ValorInteiro) a).getValor());
				}
				
				break;
			}
		}
	}
}
