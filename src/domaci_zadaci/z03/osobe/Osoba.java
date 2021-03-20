package domaci_zadaci.z03.osobe;

import domaci_zadaci.z03.Element;

abstract class Osoba extends Element implements Comparable<Osoba> {

	
	protected String ime;
	protected String prezime;
	
	
	public Osoba() { }
	
	
	public Osoba(String id, String ime, String prezime) {
		super(id);
		this.ime = ime;
		this.prezime = prezime;
	}
	
	
	public String ime() 	{ return ime; 		}
	public String prezime() { return prezime; 	}
	
	
	@Override
	public int compareTo(Osoba o) {
		return id().compareTo(o.id());
	}
	
	
	public String toString() {
		return String.format("[%s] %s %s", id(), prezime(), ime());
	}
}
