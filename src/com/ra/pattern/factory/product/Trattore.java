package com.ra.pattern.factory.product;

public class Trattore extends Veicolo {

	public Trattore() {
		super();
	}
	
	public Trattore(String numeroTelaio) {
		super(numeroTelaio);
	}

	@Override
	public String toString() {
		return "Trattore [telaio=" + super.getNumeroTelaio() + "]";
	}
}
