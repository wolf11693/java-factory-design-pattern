package com.ra.pattern.factory.product;

public class Camion extends Veicolo {

	public Camion() {
		super();
	}

	public Camion(String numeroTelaio) {
		super(numeroTelaio);
	}

	@Override
	public String toString() {
		return "Camion [telaio=" + super.getNumeroTelaio() + "]";
	}
}
