package zadaci.s152;

public class SpisakKlijenata extends SpisakOsoba {
	
	
	public SpisakKlijenata(int maxBrojOsoba) {
		super(maxBrojOsoba);
	}
	
	
	public SpisakKlijenata() {
		super();
	}
	
	
	public void dodajKlijenta(String ime, String prezime, int starost) {
		
		super.dodajOsobu(new Klijent(ime, prezime, starost));
	}
}
