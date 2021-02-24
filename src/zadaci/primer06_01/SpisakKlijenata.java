package zadaci.primer06_01;

public class SpisakKlijenata {
	
	private static final int PODRAZUMEVAN_KAPACITET = 100; 

	private String[] ime;
	private int trenutniBrojKlijenata;
	private int maxBrojKlijenata;
	
	public SpisakKlijenata(int maxBrojKlijenata) {
		this.maxBrojKlijenata = maxBrojKlijenata;
		this.trenutniBrojKlijenata = 0;
		this.ime = new String[maxBrojKlijenata];
	}
	
	public SpisakKlijenata() {
		this(PODRAZUMEVAN_KAPACITET);
	}
	
	public String nadjiKlijenta(String ime) {
		for (int i = 0; i < this.trenutniBrojKlijenata; i++)
			if (this.ime[i].equals(ime))
				return this.ime[i];
		
		System.out.println("Klijent nije pronadjen!");
		return null;
	}
	
	public void dodajKlijenta(String ime) {
		
		if (this.trenutniBrojKlijenata < this.maxBrojKlijenata)
			this.ime[this.trenutniBrojKlijenata++] = ime;
		else
			System.out.println("Nema vise mesta u spisku klijenata!");
	}
}
