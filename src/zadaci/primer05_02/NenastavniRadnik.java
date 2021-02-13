package zadaci.primer05_02;

public class NenastavniRadnik extends Zaposleni {
	
	private String radnoMesto;
	private int godineStaza;

	public NenastavniRadnik(String ime, String prezime, int starost, String rm, int gs) {
		super(ime, prezime, starost);
		this.radnoMesto = rm;
		this.godineStaza = gs;
	}
	
	public int racunajPlatu() { return 30000 + godineStaza * 500; }
	
	@Override
	public void predstaviSe() {
		System.out.println("Ime: " + this.ime
							+ " Prezime: " + this.prezime
							+ " Starost: " + this.starost
							+ " godina, "  + this.godineStaza
							+ " godina staza.");
	}
}
