package Clase;

import java.util.LinkedList;

import Interfete.ITelefon;

public class Cumparator {
	
	LinkedList<ITelefon> comanda = new LinkedList<ITelefon>();
	
	public void invocaComanda(ITelefon itelefon){
		comanda.add(itelefon);
		itelefon.execute();
	}
	
	public void undo(){
		comanda.pollLast().unexecute();
	}
}
