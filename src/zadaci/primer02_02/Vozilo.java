package zadaci.primer02_02;

public class Vozilo implements Comparable<Vozilo> {

	private String marka, tip, registracija;
	private int godiste, maksBrzina, snaga;
	
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
		return 100.0 * maksBrzina * snaga / (2021 - godiste); 
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
