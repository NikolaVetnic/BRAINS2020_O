package zadaci.s152;

public class SpisakOsoba {

	
	private static final int PODRAZUMEVAN_KAPACITET = 100; 

	
	private Osoba[] osobe;
	private int trenutniBrojOsoba;
	private int maxBrojOsoba;
	
	
	public SpisakOsoba(int maxBrojOsoba) {
		this.maxBrojOsoba = maxBrojOsoba;
		this.trenutniBrojOsoba = 0;
		this.osobe = new Osoba[maxBrojOsoba];
	}
	
	
	public SpisakOsoba() {
		this(PODRAZUMEVAN_KAPACITET);
	}
	
	
	public Osoba nadjiOsobu(String ime, String prezime) {
		for (int i = 0; i < this.trenutniBrojOsoba; i++)
			if (this.osobe[i].ime().equals(ime) && this.osobe[i].prezime().equals(prezime))
				return this.osobe[i];
		
		System.out.println("Osoba nije pronadjena!");
		return null;
	}
	
	
	public void dodajOsobu(Osoba o) {
		
		if (this.trenutniBrojOsoba < this.maxBrojOsoba)
			this.osobe[this.trenutniBrojOsoba++] = o;
		else
			System.out.println("Nema vise mesta u spisku osoba!");
	}
}
