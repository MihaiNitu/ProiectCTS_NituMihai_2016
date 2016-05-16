package Clase;

import Interfete.IPrintabil;

public class StareNormal implements IPrintabil {

	@Override
	public void print(String text) {
		System.out.println("Stoc normal: "+text);
	}

}
