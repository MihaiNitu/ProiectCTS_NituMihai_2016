package Interfete;

import Clase.Model;
import Clase.ValoriIncorenteException;

public interface Flyweight {
	public Model getModel(String tip) throws ValoriIncorenteException;
}
