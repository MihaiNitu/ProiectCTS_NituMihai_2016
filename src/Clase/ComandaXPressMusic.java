package Clase;

public class ComandaXPressMusic extends AfisareComanda {
	@Override
	public void definesteModelTelefon() {
		System.out.println("XPressMusic");
		
	}

	@Override
	public void definesteCuloare() {
		System.out.println("Negru");		
	}

	@Override
	public void definesteCardReader() {
System.out.println("Card Reader pana la 8 GB");		
	}

	@Override
	public void ruleazaComanda() {
		System.out.println("Ruleaza...");
		
	}

	@Override
	public void afisareRezultat() {
		System.out.println("Felicitari! Ai achizitionat un telefon nou");
		
	}
}
