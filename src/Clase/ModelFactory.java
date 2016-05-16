package Clase;

import java.util.HashMap;

import Interfete.Flyweight;

public class ModelFactory implements Flyweight{
	private HashMap<String, Model> modele = new HashMap<String, Model>();

	@Override
	public Model getModel(String tip) throws ValoriIncorenteException {
		Model model = modele.get(tip);
		if(model==null){
			model = new Model(tip);
		modele.put(tip, model);}
		return model;
		
	}
	public int getSize(){
		return modele.size();
	}
}
