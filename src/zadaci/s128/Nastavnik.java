package zadaci.s128;

public class Nastavnik extends Zaposleni {
	
	
	private int brojSCIRadova;

	
	public Nastavnik(String ime, String prezime, int starost, double koefRadnogMesta, int brojSCIRadova) {
		super(ime, prezime, starost, koefRadnogMesta);
		this.brojSCIRadova = brojSCIRadova;
	}
	
	
	public int racunajPlatu() { return 60000 + brojSCIRadova * 3000; }
	
	
	public int brojSCIRadova() 						{ return brojSCIRadova; 				}
	public void setBrojSCIRadova(int brojSCIRadova) { this.brojSCIRadova = brojSCIRadova; 	}
	
	
	@Override
	public String toString() {
		return "Ime: " + this.ime + " Prezime: " + this.prezime + " Starost: " 
					   + this.starost + " godina, "  + this.brojSCIRadova + " SCI radova.";
	}
}
