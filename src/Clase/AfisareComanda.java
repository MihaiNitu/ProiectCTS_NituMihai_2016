package Clase;

public abstract class AfisareComanda {
	//pasii din template
	public abstract void definesteModelTelefon();
	public abstract void definesteCuloare();
	public abstract void definesteCardReader();
	public abstract void ruleazaComanda();
	public abstract void afisareRezultat();
	
	//functie template
	public final void testeaza(){
		definesteModelTelefon();
		definesteCuloare();
		definesteCardReader();
		ruleazaComanda();
		afisareRezultat();
	}
}
