package Clase;

import Interfete.IStoc;
import Interfete.ITelefon;

public class ReiaComanda implements ITelefon{
	private IStoc stoc;
	public ReiaComanda(IStoc stoc) {
		this.stoc=stoc;
		}
	@Override
	public void execute() {
		stoc.reiaComanda();
	}
	@Override
	public void unexecute() {
		stoc.pauzaComanda();
	}
}
