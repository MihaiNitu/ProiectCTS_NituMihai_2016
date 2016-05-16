package Clase;

public class ComandaLumia extends AfisareComanda {

	@Override
	public void definesteModelTelefon() {
		System.out.println("Lumia");
		
	}

	@Override
	public void definesteCuloare() {
		System.out.println("Galben");		
	}

	@Override
	public void definesteCardReader() {
System.out.println("Card Reader pana la 64 GB");		
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
