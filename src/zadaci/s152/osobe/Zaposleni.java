package zadaci.s152.osobe;

public class Zaposleni extends Osoba {

	private static final int DEFAULT_BROJ_DANA = 20;
	
	
	private double koefRadnogMesta;
	private double plata;

	
	public Zaposleni(String ime, String prezime, String jmbg, double koefRadnogMesta) {
		super(ime, prezime, jmbg);
		this.koefRadnogMesta = koefRadnogMesta;
		setPlata(DEFAULT_BROJ_DANA);
	}
	
	
	public double koefRadnogMesta() { return this.koefRadnogMesta; 	}
	public double plata() 			{ return this.plata; 			}
	
	
	public void setKoefRadnogMesta(double k) {
		this.koefRadnogMesta = k;
		setPlata(DEFAULT_BROJ_DANA);
	}
	
	
	private void setPlata(int brojDana) {
		this.plata = koefRadnogMesta() * brojDana;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format(" (%.2f RSD)", plata);
	}
}
