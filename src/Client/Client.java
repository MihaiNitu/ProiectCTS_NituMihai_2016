package Client;

import Clase.Comanda;
import Clase.ComandaLumia;
import Clase.ComandaNSeries;
import Clase.ComandaXPressMusic;
import Clase.Cumparator;
import Clase.Distribuitor;
import Clase.Editor;
import Clase.Mesaj;
import Clase.ModelFactory;
import Clase.PauzeazaComanda;
import Clase.PornesteComanda;
import Clase.ProcesatorMesaje;
import Clase.ProcesatorMesajePrioritate;
import Clase.ProcesatorMesajePrioritateMaxima;
import Clase.Stare;
import Clase.Telefon;
import Clase.Telefon.TelefonBuilder;
import Clase.TelefonFactory;
import Clase.TipTelefoane;
import Clase.ValoriIncorenteException;
import Interfete.IStoc;
import Interfete.ITelefon;
import Interfete.Telefoane;


public class Client {

	

	public static void main(String[] args) throws ValoriIncorenteException {
		System.out.println("-----------------Singleton-----------------------");
		// Singleton
		Distribuitor microsoft = Distribuitor.creazaInstanta();
		microsoft.afiseazaDetalii();
		
		System.out.println("----------------Builder----------------------");
		//Builder
		Telefon nokia = new TelefonBuilder("Lumia","640XL").addTipProcesor("Snapdragon 400")
				.addMegaPixelCamera(13).build();
		System.out.println(nokia);
		
		System.out.println("-----------------Factory------------------------");
		//Factory
		Telefoane afisareTelefon;
		TelefonFactory variantaTelefoane = new TelefonFactory();
		afisareTelefon= variantaTelefoane.createInstance(TipTelefoane.XPressMusic);
		System.out.println(afisareTelefon.toString());
		
		System.out.println("--------------------Chain of resp.------------------");
		//Chain of responsibility
		ProcesatorMesaje pm = new ProcesatorMesaje();
		ProcesatorMesajePrioritate pmp = new ProcesatorMesajePrioritate();
		ProcesatorMesajePrioritateMaxima pmpm = new ProcesatorMesajePrioritateMaxima();
		
		pmpm.setSuccessor(pmp);
		pmp.setSuccessor(pm);
		
		Mesaj m1 = new Mesaj("Cu succes",232);
		Mesaj m2 = new Mesaj("Lumia 950XL",50);
		Mesaj m3 = new Mesaj("Mai 2016",77);
		
		pmpm.gestioneazaCerere(m1);
		pmpm.gestioneazaCerere(m2);
		pmpm.gestioneazaCerere(m3);
		
		System.out.println("-----------------Command---------------------");
		//Command
		
		IStoc stoc = new Comanda();
		ITelefon telefon = new PornesteComanda(stoc);
		Cumparator cump = new Cumparator();
		cump.invocaComanda(telefon);
		cump.invocaComanda(telefon);
		cump.invocaComanda(telefon);
		
		telefon = new PauzeazaComanda(stoc);
		cump.invocaComanda(telefon);
		cump.invocaComanda(telefon);
		
		cump.undo();
		cump.undo();
		cump.undo();
		cump.undo();
		cump.undo();
		
		System.out.println("--------------------Flyweight--------------------------");
	
		//Flyweight
		
		ModelFactory modFac = new ModelFactory();
		modFac.getModel("640XL");
		modFac.getModel("640XL");
		modFac.getModel("640XL");
		modFac.getModel("950");
		modFac.getModel("520");
		modFac.getModel("520");
		
		System.out.println("Pana acum comanda numara  "+modFac.getSize()+" dispozitive(Nu se accepta duplicate)");
		System.out.println("--------------------State--------------------------");

		//State
		Editor editor = new Editor();
		
		editor.afisare("Lumia");
		
		editor.setStare(Stare.PLIN);
		
		editor.afisare("N-Series");
		
		editor.setStare(Stare.EPUIZAT);
		
		editor.afisare("XPressMusic");
		System.out.println("-------------------Template------------------------");

		// Template
		ComandaLumia lumia = new ComandaLumia();
		ComandaNSeries nSeries = new ComandaNSeries();
		ComandaXPressMusic xpress = new ComandaXPressMusic();
		lumia.testeaza();
		System.out.println("-------------------------------------------");
		nSeries.testeaza();
		System.out.println("-------------------------------------------");
		xpress.testeaza();
	}
	

}
