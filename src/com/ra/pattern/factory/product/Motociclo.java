package com.ra.pattern.factory.product;

public class Motociclo extends Veicolo {

	public Motociclo() {
		super();
	}
	
	public Motociclo(String numeroTelaio) {
		super(numeroTelaio);
	}

	@Override
	public String toString() {
		return "Motociclo [telaio=" + super.getNumeroTelaio() + "]";
	}
}
