package zadaci.s260.racuni;

public class Racun {

	
	private String jmbg;
	private String broj;
	
	private TipRacuna tip;
	
	private double stanje;
	
	
	private Racun(String jmbg, String broj, boolean dinarski, double stanje) {
		this.jmbg = jmbg;
		this.broj = broj;
		this.tip = dinarski ? TipRacuna.DINARSKI : TipRacuna.DEVIZNI;
		this.stanje = stanje;
	}
	
	
	public static Racun kreiraj(String jmbg, String broj, boolean dinarski, double stanje) {
		return new Racun(jmbg, broj, dinarski, stanje);
	}
	
	
	public String toString() {
		return jmbg + " " + broj + " " + (tip == TipRacuna.DINARSKI ? "DIN" : "DEV") + String.format(" %.2f", stanje);
	}


	public String jmbg() 	{ return jmbg; 		}
	public String broj() 	{ return broj; 		}
	public TipRacuna tip() 	{ return tip; 		}
	public double stanje() 	{ return stanje; 	}
	
	
	public void setStanje(double s) { this.stanje = s; 	}
}
