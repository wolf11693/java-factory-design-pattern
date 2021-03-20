package com.ra.pattern.factory.product;

public abstract class Veicolo {

	private String numeroTelaio;

	public Veicolo(String numeroTelaio) {
		super();
		this.numeroTelaio = numeroTelaio;
	}

	public Veicolo() {
		super();
		this.numeroTelaio = this.generaNumeroTelaio();
	}

	private String generaNumeroTelaio() {
		String alfabeto[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O",
			      			  "P", "Q", "R", "S", "T", "U", "V", "Z", "1", "2", "3", "4", "5",
			      			  "6", "7", "8", "9", "0", "X", "Y", "W"} ;                   
                                              
		String telaioRandom = "";                           
		for(int i=0; i<21; i++) {
			int numeroRandom = Integer.valueOf( (int) Math.floor(Math.random()*100) + "") % alfabeto.length;
			telaioRandom += alfabeto[numeroRandom];
		}
		
		return telaioRandom;
	}

	public String getNumeroTelaio() {
		return numeroTelaio;
	}

	public void setNumeroTelaio(String numeroTelaio) {
		this.numeroTelaio = numeroTelaio;
	}

	@Override
	public String toString() {
		return "Veicolo [numeroTelaio=" + numeroTelaio + "]";
	}
}
