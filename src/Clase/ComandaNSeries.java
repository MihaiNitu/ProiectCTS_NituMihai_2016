package Clase;

public class ComandaNSeries extends AfisareComanda {
	@Override
	public void definesteModelTelefon() {
		System.out.println("N-Series");
		
	}

	@Override
	public void definesteCuloare() {
		System.out.println("Rosu");		
	}

	@Override
	public void definesteCardReader() {
System.out.println("Card Reader pana la 16 GB");		
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
