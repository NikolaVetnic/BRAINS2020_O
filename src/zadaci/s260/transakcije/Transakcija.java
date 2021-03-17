package zadaci.s260.transakcije;

public class Transakcija {

	
	private String transakcija;
	
	
	private Transakcija(String t) {
		this.transakcija = t;
	}
	
	
	public static Transakcija kreiraj(String t) {
		return new Transakcija(t);
	}
	
	
	public String transakcija() { return transakcija; }
	
	
	public String toString() {
		return transakcija;
	}
}
