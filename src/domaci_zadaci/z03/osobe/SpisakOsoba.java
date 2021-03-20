package domaci_zadaci.z03.osobe;

import domaci_zadaci.z03.RadSaFajlovima;
import domaci_zadaci.z03.Spisak;

abstract class SpisakOsoba extends Spisak implements RadSaFajlovima {
	
	
	public Osoba nadji(String ime, String prezime) {
		return (Osoba) nadji(o -> 
						((Osoba) o).ime().equalsIgnoreCase(ime) && 
						((Osoba) o).prezime().equalsIgnoreCase(prezime));
	}
	
	
	public void stampajPoPrezimenu() {
		stampaj(
				(o1, o2) -> ((Osoba) o1).prezime().compareTo(((Osoba) o2).prezime()) != 0 ? 
							((Osoba) o1).prezime().compareTo(((Osoba) o2).prezime()) : 
							((Osoba) o1).ime().compareTo(((Osoba) o2).ime()), 
				o -> System.out.println(o));
	}
}
