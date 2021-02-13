package zadaci.primer02_03;

public class Transakcija {

	private final double iznos;
	private final String opis;
	
	public Transakcija(double iznos, String opis) {
		this.iznos = iznos;
		this.opis = opis;
	}
	
	public double iznos() 	{ return iznos; }
	public String opis()	{ return opis; 	}
	
	public String toString() {
		return "" + iznos + ", " + opis;
	}
}
