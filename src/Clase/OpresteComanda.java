package Clase;

import Interfete.IStoc;
import Interfete.ITelefon;

public class OpresteComanda implements ITelefon {
	private IStoc stoc;
	public OpresteComanda(IStoc stoc) {
		this.stoc=stoc;
		}
	@Override
	public void execute() {
		stoc.stopComanda();
	}
	@Override
	public void unexecute() {
		stoc.startComanda();
		
	}
}
