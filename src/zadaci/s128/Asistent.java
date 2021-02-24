package zadaci.s128;

public class Asistent extends Zaposleni {
	
	
	private Nastavnik mentor;
	private int godinaDoktorskihStudija;

	
	public Asistent(String ime, String prezime, int starost, double koefRadnogMesta, Nastavnik mentor, int g) {
		super(ime, prezime, starost, koefRadnogMesta);
		this.mentor = mentor;
		this.godinaDoktorskihStudija = g;
	}
	
	
	public int racunajPlatu() { return 40000 + godinaDoktorskihStudija * 2000; }
	
	
	public Nastavnik mentor() 				{ return mentor; 					}
	public int godinaDoktorskihStudija() 	{ return godinaDoktorskihStudija; 	}
	
	
	public void setMentor(Nastavnik mentor) 							{ this.mentor = mentor; 									}
	public void setGodinaDoktorskihStudija(int godinaDoktorskihStudija) { this.godinaDoktorskihStudija = godinaDoktorskihStudija; 	}
	
	
	@Override
	public String toString() {
		return "Ime: " + this.ime + " Prezime: " + this.prezime + " Starost: " 
					   + this.starost + " godina (asistent).";
	}
}
