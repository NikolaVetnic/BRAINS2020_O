package domaci_zadaci.z03.osobe;

public class Klijent extends Osoba {

	
	private String adresa;
	private String tel;
	
	
	private Klijent(String id, String ime, String prezime, String adresa, String tel) {
		super(id, ime, prezime);
		this.adresa = adresa;
		this.tel = tel;
	}
	
	
	protected static Klijent novi(String id, String ime, String prezime, String adresa, String tel) {
		return new Klijent(id, ime, prezime, adresa, tel);
	}
	
	
	public String adresa() 	{ return adresa; 	}
	public String tel() 	{ return tel; 		}
	
	
	@Override
	public String toString() {
		return super.toString() + String.format(" (%s, telefon: %s)", adresa(), tel());
	}
}
