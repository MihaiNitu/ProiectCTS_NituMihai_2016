package Clase;

import Interfete.IStoc;
import Interfete.ITelefon;

public class PauzeazaComanda implements ITelefon {
	private IStoc stoc;
	public PauzeazaComanda(IStoc stoc) {
		this.stoc=stoc;
		}
	@Override
	public void execute() {
		stoc.pauzaComanda();
	}

	@Override
	public void unexecute() {
		stoc.reiaComanda();
		
	}

}
