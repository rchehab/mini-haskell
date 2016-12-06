package br.unb.poo.mh;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import br.unb.poo.mh.grammar.HaskellLexer;
import br.unb.poo.mh.grammar.HaskellParser;

public class ParserInterface {
	
	public static String parse(String str) {
		HaskellLexer lexer = new HaskellLexer(new ANTLRInputStream(str));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HaskellParser parser = new HaskellParser(tokens);
		ParseTree tree = parser.start(); // creates the parse tree from the called rule
		
		String t = tree.toStringTree();
		
		String resul = new String();
		
		boolean insere = true;
		
		for (int i = 0; i < t.length(); i++) {
			if (insere == true) {
				if (t.charAt(i) == '[') {
					insere = false;
				} else {
					resul = resul + t.charAt(i);
				}
			} else if (t.charAt(i) == ']') {
				insere = true;
			}
		}
		
		return resul;
	}
	
	public static void parse(File file) throws IOException {
		byte[] bit = Files.readAllBytes(file.toPath());
		String str = new String(bit, Charset.forName("UTF-8"));
		
		parse(str);
	}
	
}
