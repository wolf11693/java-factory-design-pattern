package com.ra.pattern.factory.product;

public class Barca extends Veicolo {
	
	public Barca() {
		super();
	}

	@Override
	public String toString() {
		return "Barca [telaio=" + super.getNumeroTelaio() + "]";
	}
}
