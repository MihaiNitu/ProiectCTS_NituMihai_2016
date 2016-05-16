package Clase;

import Interfete.IPrintabil;

public class Editor {
	//starea curenta a editorului
	IPrintabil stareCurenta;
	
	public Editor(){
		stareCurenta = new StareNormal();
	}
	
	public void setStare(Stare stare){
		if(stare == Stare.NORMAL)
			this.stareCurenta = new StareNormal();
		else
			if(stare == Stare.PLIN)
				this.stareCurenta = new StarePlin();
			else
				this.stareCurenta = new StareEpuizat();
	}
	
	public void afisare(String text){
		this.stareCurenta.print(text);
	}
}

