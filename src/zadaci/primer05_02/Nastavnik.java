package zadaci.primer05_02;

public class Nastavnik extends Zaposleni {
	
	private int brojSCIRadova;

	public Nastavnik(String ime, String prezime, int starost, int brojSCIRadova) {
		super(ime, prezime, starost);
		this.brojSCIRadova = brojSCIRadova;
	}
	
	public int racunajPlatu() { return 60000 + brojSCIRadova * 3000; }
	
	@Override
	public void predstaviSe() {
		System.out.println("Ime: " + this.ime
							+ " Prezime: " + this.prezime
							+ " Starost: " + this.starost
							+ " godina, "  + this.brojSCIRadova
							+ " SCI radova.");
	}
}
