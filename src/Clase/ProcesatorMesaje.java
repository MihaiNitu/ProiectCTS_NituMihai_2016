package Clase;

public class ProcesatorMesaje extends Handler {
	public void gestioneazaCerere(Mesaj mesaj)
	{
		if (mesaj.getPrioritate() <= 50){
			System.out.println("\n Afiseaza oferte: "+mesaj.getText());
		}
	}
}
