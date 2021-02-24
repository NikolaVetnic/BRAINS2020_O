package zadaci.s121;

public class Zena extends Osoba {

	private String devojackoPrezime;
	
	public Zena(String ime, String prezime, int starost, String devojackoPrezime) {
		super(ime, prezime, starost);
		this.devojackoPrezime = devojackoPrezime;
	}
	
	@Override
	public void predstaviSe() {
		System.out.println("Ime: " + this.ime + " Prezime: " + this.prezime + " Devojacko: " + this.devojackoPrezime);
	}
}
