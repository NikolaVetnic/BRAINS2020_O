package zadaci.s128;

abstract class Osoba {

	protected String ime;
	protected String prezime;
	protected int starost;
	
	
	public Osoba() { }
	
	
	public Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	
	public String toString() {
		return "Ime: " + this.ime + " Prezime: " + this.prezime + " Starost: " + this.starost + " godina";
	}
}
