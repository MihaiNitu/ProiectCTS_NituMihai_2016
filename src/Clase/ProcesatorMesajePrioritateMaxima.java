package Clase;

public class ProcesatorMesajePrioritateMaxima extends Handler {
	public void gestioneazaCerere(Mesaj mesaj)
	{
		if (mesaj.getPrioritate() > 100){
			System.out.println("\n Logare user: "+mesaj.getText());
		}
		else{
			if(this.succesor!=null)
				this.succesor.gestioneazaCerere(mesaj);
		}
	}
}
