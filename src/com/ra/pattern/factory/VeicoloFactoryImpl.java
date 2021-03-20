package com.ra.pattern.factory;

import com.ra.pattern.factory.product.AutoVettura;
import com.ra.pattern.factory.product.Barca;
import com.ra.pattern.factory.product.BarcaAVela;
import com.ra.pattern.factory.product.Camion;
import com.ra.pattern.factory.product.Ciclomotore;
import com.ra.pattern.factory.product.Motociclo;
import com.ra.pattern.factory.product.Trattore;
import com.ra.pattern.factory.product.Veicolo;
import com.ra.pattern.factory.product.VeicoloEnum;

public class VeicoloFactoryImpl implements VeicoloFactory {
	
	@Override
	public Veicolo getVeicolo(VeicoloEnum tipoVeicolo) {
		Veicolo veicoloCreated = null;
		
		switch (tipoVeicolo) {
		case AUTOVETTURA:
			veicoloCreated = new AutoVettura();
			break;
		case BARCA:
			veicoloCreated = new Barca();
			break;
		case BARCA_A_VELA:
			veicoloCreated = new BarcaAVela();
			break;
		case CAMION:
			veicoloCreated = new Camion();
			break;
		case CICLOMOTORE:
			veicoloCreated = new Ciclomotore();
			break;
		case MOTOCICLO:
			veicoloCreated = new Motociclo();
			break;
		case TRATTORE:
			veicoloCreated = new Trattore();
			break;

		default:
			throw new UnsupportedOperationException("impossibile creare " + tipoVeicolo + "!");
		}
		
		return veicoloCreated;
	}

}
