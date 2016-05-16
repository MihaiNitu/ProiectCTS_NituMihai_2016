package Clase;

public class Distribuitor {
	
		private String denumire;
		private String adresa;
		private int vechime;
		
		private static Distribuitor instanta;
		private Distribuitor(){
			this.denumire="Microsoft";
			this.adresa="Calea Dorobanti";
			this.vechime=23;
		}
		public static Distribuitor creazaInstanta(){
			if(instanta==null){
				instanta = new Distribuitor();
			}return instanta;
		}
		
		public void afiseazaDetalii(){
			System.out.println("Distribuitorul "+ this.denumire+" are adresa pe "+ this.adresa);
		}


		public String getDenumire() {
			return denumire;
		}


		public void setDenumire(String denumire) throws ValoriIncorenteException {
			if(denumire=="Microsoft"){
			this.denumire = denumire;}
			else{
				throw new ValoriIncorenteException();
			}
		}


		public String getAdresa() {
			return adresa;
		}


		public void setAdresa(String adresa) {
			this.adresa = adresa;
		}
		public int getVechime() {
			return vechime;
		}
		public void setVechime(int vechime) throws ValoriIncorenteException {
			if(vechime==23){
			this.vechime = vechime;
			}else if(vechime<0){
				throw new ValoriIncorenteException();
			}else{
				System.out.println("Nu ai introdus valoarea corecta");
			}
		}
}
