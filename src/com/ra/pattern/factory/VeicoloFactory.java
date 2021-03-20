package com.ra.pattern.factory;

import com.ra.pattern.factory.product.Veicolo;
import com.ra.pattern.factory.product.VeicoloEnum;

public interface VeicoloFactory {
	
	public Veicolo getVeicolo(VeicoloEnum tipoVeicolo);
}
