package zadaci.primer03_01;

public class Klijent extends Osoba {
	
	private double stanje;

	Klijent (String ime, String prezime, int starost) {
		super(ime, prezime, starost);
		this.stanje = 0.0;
	}
	
	public boolean dodajLovu(double lova) {
	
		if (lova < 0) return false;
		
		this.stanje += lova;
		return true;
	}
	
	public boolean prebaciNaRacun(Klijent drugi, double iznos) {
		
		if (stanje < iznos) return false;
		
		this.stanje -= iznos;
		drugi.stanje += iznos;
		
		return true;
	}
	
	@Override
	public String toString() {
		return super.ime + " " + super.prezime + ", " + stanje;
	}
}
