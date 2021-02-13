package zadaci.primer03_01;

public class Vozilo {

	protected Osoba vlasnik;
	
	public void setVlasnik(Osoba o) {
		this.vlasnik = o;
	}
	
	public Osoba vlasnik() { return vlasnik; }
	
	public String toString() {
		return "Mrzelo me je da izmisljam atribute...";
	}
}
