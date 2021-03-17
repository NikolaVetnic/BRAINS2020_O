package zadaci.s260.osobe;

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
	
	
	@Override
	public int compareTo(Osoba o) {
		int res = prezime().compareTo(o.prezime());
		
		if (res != 0) 	return res;
		else 			return ime().compareTo(o.ime());
	}
	
	
	public abstract String getFileLine();
	
	
	public String toString() {
		return String.format("%s %s [%s]", prezime(), ime(), jmbg());
	}
}
