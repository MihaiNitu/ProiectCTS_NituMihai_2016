package Clase;

import Interfete.Telefoane;

public class TelefonFactory {
	public Telefoane createInstance(TipTelefoane tipTelefoane){
		switch(tipTelefoane){
		case Lumia : return new Lumia();
		case XPressMusic : return new XPressMusic();
		case NSeries : return new NSeries();
		}
		return null;
	}
}
