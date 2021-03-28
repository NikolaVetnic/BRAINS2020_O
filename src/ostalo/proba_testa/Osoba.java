package ostalo.proba_testa;

import java.util.Comparator;

class Osoba implements Comparable<Osoba> {

	
	protected String ime;
	protected String prezime;
	protected int starost;
	
	
	public Osoba() { }
	
	
	public Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	
	public String ime() 	{ return ime; 		}
	public String prezime() { return prezime; 	}
	public int starost() 	{ return starost; 	}
	
	
	public String toString() {
		return String.format("%s %s [%s]", prezime(), ime(), starost());
	}
	

	@Override
	public int compareTo(Osoba o) {
		int res = prezime().compareTo(o.prezime());
		
		if (res != 0) 	return res;
		else 			return ime().compareTo(o.ime());
	}
	
	
	static class LeksiComp implements Comparator<Osoba> {
		
		@Override
		public int compare(Osoba o1, Osoba o2) {
			int res = o1.prezime().compareTo(o2.prezime());
			
			if (res != 0) 	return res;
			else 			return o1.ime().compareTo(o2.ime());
		}
	}
}
