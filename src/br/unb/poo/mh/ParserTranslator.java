package br.unb.poo.mh;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import br.unb.poo.mh.grammar.HaskellLexer;
import br.unb.poo.mh.grammar.HaskellParser;

public class ParserTranslator {
	
	public static String parse(String str) {
		HaskellLexer lexer = new HaskellLexer(new ANTLRInputStream(str));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HaskellParser parser = new HaskellParser(tokens);
		ParseTree tree = parser.start(); // creates the parse tree from the called rule
		
		return expressao(tree.getChild(0), parser, true);
	}
	
	public static String expressao(ParseTree tree, HaskellParser parser, boolean get) {
		
		String resul = new String();
		
		if (tree.getChildCount() > 1) {
			
			if (!tree.getChild(0).getText().contentEquals("[")) {
				
				//Imprimir
				RuleContext rule = (RuleContext) tree.getPayload();
				int a = rule.getRuleIndex();
				String[] st = parser.getRuleNames();
				char b = st[a].charAt(0);
				b = (char) ((int) b - (int) 'a' + (int) 'A');
				
				String te = b + st[a].substring(1, st[a].length());
				//resul = resul + "new " + te;
				resul = resul + te;
				resul = resul + "(";
				//Termina imprimir
			}
			
			for (int i = 0; i < tree.getChildCount(); i++) {
				
				if (i == 0 &&  tree.getChild(i).getText().contentEquals("["))
					continue;
				
				String temp = new String();
				temp = temp + resul;
				resul = resul + expressao(tree.getChild(i), parser, false);
				
				if (!temp.contentEquals(resul)) {
					resul = resul + ", ";
				}
			}
			if (resul.endsWith(", ")) {
				resul = resul.substring(0, resul.length() - 2);
			}

			if (!tree.getChild(0).getText().contentEquals("[")) {
				resul = resul + ")";
			}
			
		} else if(tree.getChildCount() == 0) {
			if (get)
				resul = resul + tree.getText();
		} else {
			if (tree.getChild(0).getChildCount() == 0) {

				RuleContext rule = (RuleContext) tree.getPayload();
				int a = rule.getRuleIndex();
				String[] st = parser.getRuleNames();
				char b = st[a].charAt(0);
				b = (char) ((int) b - (int) 'a' + (int) 'A');
				
				String te = b + st[a].substring(1, st[a].length());
				//resul = resul + "new " + te;
				resul = resul + te;
				resul = resul + "(";
			}
			resul = resul + expressao(tree.getChild(0), parser, true);
			if (tree.getChild(0).getChildCount() == 0) {
				resul = resul + ")";
			}
		}
		
		return resul;
	}
	
	public static String parse(File file) throws IOException {
		byte[] bit = Files.readAllBytes(file.toPath());
		String str = new String(bit, Charset.forName("UTF-8"));
		
		return parse(str);
	}
	
}
