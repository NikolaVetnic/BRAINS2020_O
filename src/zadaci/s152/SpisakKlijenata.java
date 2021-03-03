package zadaci.s152;

public class SpisakKlijenata extends SpisakOsoba {
	
	
	public SpisakKlijenata(int maxBrojOsoba) {
		super(maxBrojOsoba);
	}
	
	
	public SpisakKlijenata() {
		super();
	}
	
	
	public boolean dodajKlijenta(String ime, String prezime, int starost) {
		return super.dodajOsobu(new Klijent(ime, prezime, starost));
	}

	
	public boolean izbaciKlijenta(String ime, String prezime) {
		return super.izbaciOsobu(ime, prezime);
	}
	
	
	public void stampaj() {
		
		System.out.println("Spisak klijenata : ");
		
		for (int i = 0; i < super.trenutniBrojOsoba(); i++) {
			Klijent k = (Klijent) super.osobe()[i];
			System.out.println(k);
		}
	}
}
