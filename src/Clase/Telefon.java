package Clase;



public class Telefon {
	private final String marca;
	private final String model;
	private String tipProcesor;
	private int megaPixelCamera;
	
	private Telefon(String marca,String model){
		this.marca=marca;
		this.model=model;
	}


	public String getTipProcesor() {
		return tipProcesor;
	}

	public void setTipProcesor(String tipProcesor) {
		this.tipProcesor = tipProcesor;
	}

	public int getMegaPixelCamera() {
		return megaPixelCamera;
	}

	public void setMegaPixelCamera(int megaPixelCamera) {
		this.megaPixelCamera = megaPixelCamera;
	}
	
	public String toString(){
		return "Detalii telefon-> Marca: "+this.marca+" , model: "+this.model+
				" , procesor tip: "+this.tipProcesor+" , camera cu mpx: "+this.megaPixelCamera;
		
	}

	public static class TelefonBuilder{
		private Telefon telefon;
		
		 public TelefonBuilder(String marca, String model){
	        	this.telefon = new Telefon(marca, model);
	        }
	        
	        public TelefonBuilder addTipProcesor(String tipProcesor){
	        	this.telefon.tipProcesor = tipProcesor;
	        	return this;
	        }
	        public TelefonBuilder addMegaPixelCamera(int MegaPixelCamera){
	        	this.telefon.megaPixelCamera = MegaPixelCamera;
	        	return this;
	        	
	        }
	        public Telefon build(){
	        	return this.telefon;
	        }
	}
}
