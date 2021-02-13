package zadaci.primer02_02;

public class Vozilo implements Comparable<Vozilo> {

	private String marka;
	private String tip;
	private int godiste;
	private String registracija;
	private int maksBrzina;
	private int snaga;
	
	public Vozilo(String marka, String tip, int godiste, String registracija, int maksBrzina, int snaga) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maksBrzina = maksBrzina;
		this.snaga = snaga;
	}
	
	public Vozilo() {
		this("", "", 0, "", 0, 0);
	}
	
	public double vrednost() { 
		return 1.0 * maksBrzina * snaga / (2017 - godiste); 
	}
	
	public String toString() {
		return "( " + marka + ", " + tip + ", " + godiste + ", " 
			+ registracija + ", " + maksBrzina + ", " + snaga + ", " + vrednost() + " )";
	}

	@Override
	public int compareTo(Vozilo o) {
		double d = vrednost() - o.vrednost();
		if 		(d > 0) return  1;
		else if (d < 0) return -1;
		else 			return  0;
	}
}
