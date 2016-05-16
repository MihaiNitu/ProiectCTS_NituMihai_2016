package Clase;

import Interfete.IStoc;
import Interfete.ITelefon;

public class PornesteComanda implements ITelefon {
private IStoc stoc;


public PornesteComanda(IStoc stoc) {
this.stoc=stoc;
}

	@Override
	public void execute() {
		stoc.startComanda();		
	}

	@Override
	public void unexecute() {
		stoc.stopComanda();
		
	}

}
