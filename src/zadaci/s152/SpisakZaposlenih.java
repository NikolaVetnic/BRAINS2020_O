package zadaci.s152;

public class SpisakZaposlenih extends SpisakOsoba {
	
	
	public SpisakZaposlenih(int maxBrojOsoba) {
		super(maxBrojOsoba);
	}
	
	
	public SpisakZaposlenih() {
		super();
	}
	
	
	public void dodajZaposlenog(String ime, String prezime, int starost, double koefRadnogMesta) {
		
		super.dodajOsobu(new Zaposleni(ime, prezime, starost, koefRadnogMesta));
	}
}
