package zadaci.s260.osobe;

public class Klijent extends Osoba {

	
	public Klijent(String ime, String prezime, String jmbg) {
		super(ime, prezime, jmbg);
	}

	@Override
	public String getFileLine() {
		return "" + super.ime() + " " + super.prezime() + " " + super.jmbg();
	}
}
