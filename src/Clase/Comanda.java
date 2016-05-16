package Clase;

import Interfete.IStoc;

public class Comanda implements IStoc {

	@Override
	public void startComanda() {
		System.out.println("Comanda s-a initializat");
		
	}

	@Override
	public void stopComanda() {
		System.out.println("Comanda s-a terminat");
		
	}

	@Override
	public void pauzaComanda() {
		System.out.println("Comanda s-a blocat");
		
	}

	@Override
	public void reiaComanda() {
		System.out.println("Comanda s-a reluat");
		
	}

}
