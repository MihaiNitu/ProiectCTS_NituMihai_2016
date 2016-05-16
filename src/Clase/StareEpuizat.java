package Clase;

import Interfete.IPrintabil;

public class StareEpuizat implements IPrintabil {

	@Override
	public void print(String text) {
		System.out.println("Stoc Epuizat: "+text);
	}

}
