package com.ra.pattern.factory.product;

public class BarcaAVela extends Veicolo {
	
	public BarcaAVela() {
		super();
	}

	@Override
	public String toString() {
		return "BarcaAVela [telaio()=" + super.getNumeroTelaio() + "]";
	}
}
