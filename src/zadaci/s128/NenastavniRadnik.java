package zadaci.s128;

public class NenastavniRadnik extends Zaposleni {
	
	
	private String radnoMesto;
	private int godineStaza;

	
	public NenastavniRadnik(String ime, String prezime, int starost, double koefRadnogMesta, String rm, int gs) {
		super(ime, prezime, starost, koefRadnogMesta);
		this.radnoMesto = rm;
		this.godineStaza = gs;
	}
	
	
	public int racunajPlatu() { return 30000 + godineStaza * 500; }
	
	
	public String radnoMesto() 	{ return radnoMesto; 	}
	public int godineStaza() 	{ return godineStaza; 	}
	
	
	public void setRadnoMesto(String radnoMesto) 	{ this.radnoMesto = radnoMesto; 	}
	public void setGodineStaza(int godineStaza) 	{ this.godineStaza = godineStaza; 	}
	
	
	@Override
	public String toString() {
		return "Ime: " + this.ime + " Prezime: " + this.prezime + " Starost: " 
					   + this.starost + " godina, "  + this.godineStaza + " godina staza.";
	}
}
