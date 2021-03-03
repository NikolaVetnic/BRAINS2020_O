package zadaci.s152.osobe;

import java.util.Comparator;

abstract class Osoba implements Comparable<Osoba> {

	
	protected String ime;
	protected String prezime;
	protected String jmbg;
	
	
	public Osoba() { }
	
	
	public Osoba(String ime, String prezime, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}
	
	
	public String ime() 	{ return ime; 		}
	public String prezime() { return prezime; 	}
	public String jmbg() 	{ return jmbg; 		}
	
	
	public String toString() {
		return String.format("%s %s [%s]", prezime(), ime(), jmbg());
	}
	

	@Override
	public int compareTo(Osoba o) {
		int res = prezime().compareTo(o.prezime());
		
		if (res != 0) 	return res;
		else 			return ime().compareTo(o.ime());
	}
	
	
	private class JMBGComp implements Comparator<Osoba> {

		@Override
		public int compare(Osoba o1, Osoba o2) {
			return (o1.compareTo(o2));
		}
	}
}
