package br.unb.poo.mh;

public abstract class Lista implements Expressao {
	Tipo tipoBase;
	
	public Lista (Tipo tipoBase) {
		this.tipoBase = tipoBase;
	}
}