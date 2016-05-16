package Clase;

import Interfete.IPrintabil;

public class StarePlin implements IPrintabil {

	@Override
	public void print(String text) {
		System.out.println("Stoc plin: "+text);

	}

}
