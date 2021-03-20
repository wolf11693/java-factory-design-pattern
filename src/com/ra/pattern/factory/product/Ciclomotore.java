package com.ra.pattern.factory.product;

public class Ciclomotore extends Veicolo {
	
	public Ciclomotore() {
		super();
	}

	public Ciclomotore(String numeroTelaio) {
		super(numeroTelaio);
	}

	@Override
	public String toString() {
		return "Ciclomotore [telaio=" + super.getNumeroTelaio() + "]";
	}
}
