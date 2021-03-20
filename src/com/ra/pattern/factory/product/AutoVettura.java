package com.ra.pattern.factory.product;

public class AutoVettura extends Veicolo {
	
	public AutoVettura() {
		super();
	}

	@Override
	public String toString() {
		return "AutoVettura [telaio=" + super.getNumeroTelaio() + "]";
	}
}
