package Clase;

public class Model {
	private String tip;
	
	public Model() throws ValoriIncorenteException{
		this.setTip("Lumia");
	}
	
	
	public Model(String model) throws ValoriIncorenteException{
		this.setTip(model);
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) throws ValoriIncorenteException {
		if(tip.length()==3 || tip.length()==5){
			this.tip = tip;
		}else{
		throw new ValoriIncorenteException();
		}
	}
}
