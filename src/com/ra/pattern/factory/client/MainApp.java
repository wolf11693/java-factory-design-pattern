package com.ra.pattern.factory.client;

import com.ra.pattern.factory.VeicoloFactory;
import com.ra.pattern.factory.VeicoloFactoryImpl;
import com.ra.pattern.factory.product.Veicolo;
import com.ra.pattern.factory.product.VeicoloEnum;

public class MainApp {

	public static void main(String[] args) {
		VeicoloFactory veicoloFactory = new VeicoloFactoryImpl();
		
		 Veicolo auto1 = veicoloFactory.getVeicolo(VeicoloEnum.AUTOVETTURA);
		 Veicolo auto2 = veicoloFactory.getVeicolo(VeicoloEnum.AUTOVETTURA);
		 Veicolo auto3 = veicoloFactory.getVeicolo(VeicoloEnum.AUTOVETTURA);
		 System.out.println(auto1 + "\n" +  auto2 + "\n" + auto3);
		 
		 Veicolo barca1 = veicoloFactory.getVeicolo(VeicoloEnum.BARCA);
		 Veicolo barca2 = veicoloFactory.getVeicolo(VeicoloEnum.BARCA);
		 System.out.println(barca1 + "\n" +  barca2);
		 
		 Veicolo barcaAVela = veicoloFactory.getVeicolo(VeicoloEnum.BARCA_A_VELA);
		 System.out.println(barcaAVela);

		 Veicolo camion = veicoloFactory.getVeicolo(VeicoloEnum.CAMION);
		 System.out.println(camion);
		 
		 Veicolo ciclomotore1 = veicoloFactory.getVeicolo(VeicoloEnum.CICLOMOTORE);
		 Veicolo ciclomotore2 = veicoloFactory.getVeicolo(VeicoloEnum.CICLOMOTORE);
		 Veicolo ciclomotore3 = veicoloFactory.getVeicolo(VeicoloEnum.CICLOMOTORE);
		 Veicolo ciclomotore4 = veicoloFactory.getVeicolo(VeicoloEnum.CICLOMOTORE);
		 System.out.println(ciclomotore1 + "\n" +  ciclomotore2 + "\n" + ciclomotore3 + "\n" + ciclomotore4);

		 Veicolo motociclo1 = veicoloFactory.getVeicolo(VeicoloEnum.MOTOCICLO);
		 Veicolo motociclo2 = veicoloFactory.getVeicolo(VeicoloEnum.MOTOCICLO);
		 Veicolo motociclo3 = veicoloFactory.getVeicolo(VeicoloEnum.MOTOCICLO);
		 Veicolo motociclo4 = veicoloFactory.getVeicolo(VeicoloEnum.MOTOCICLO);
		 Veicolo motociclo5 = veicoloFactory.getVeicolo(VeicoloEnum.MOTOCICLO);
		 System.out.println(motociclo1 + "\n" +  motociclo2 + "\n" + motociclo3 + "\n" + motociclo4 + "\n" + motociclo5);
	
		 Veicolo trattore1 = veicoloFactory.getVeicolo(VeicoloEnum.TRATTORE);
		 Veicolo trattore2 = veicoloFactory.getVeicolo(VeicoloEnum.TRATTORE);
		 System.out.println(trattore1 + "\n" + trattore2);
	}
}
