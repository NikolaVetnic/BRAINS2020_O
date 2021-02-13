package zadaci.primer05_02;

public class Asistent extends Zaposleni {
	
	private Nastavnik mentor;
	private int godinaDoktorskihStudija;

	public Asistent(String ime, String prezime, int starost, Nastavnik mentor, int g) {
		super(ime, prezime, starost);
		this.mentor = mentor;
		this.godinaDoktorskihStudija = g;
	}
	
	public int racunajPlatu() { return 40000 + godinaDoktorskihStudija * 2000; }
	
	@Override
	public void predstaviSe() {
		System.out.println("Ime: " + this.ime
							+ " Prezime: " + this.prezime
							+ " Starost: " + this.starost
							+ " godina (asistent).");
	}
}
