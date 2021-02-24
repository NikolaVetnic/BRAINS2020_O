package zadaci.s087;

public class Osoba {

	protected String ime;
	protected String prezime;
	protected int starost;
	
	Osoba() { }
	
	Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	public String ime() 	{ return this.ime; 		}
	public String prezime() { return this.prezime; 	}
	public int starost() 	{ return this.starost; 	}
	
	public void predstaviSe() {
		System.out.println("Ime: " + this.ime
							+ " Prezime: " + this.prezime
							+ " Starost: " + this.starost
							+ " godina");
	}
}
