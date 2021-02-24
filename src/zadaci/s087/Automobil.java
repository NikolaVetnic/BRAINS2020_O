package zadaci.s087;

public class Automobil extends Vozilo {

	private int brojVrata;
	
	public Automobil(String marka, String tip, String registracija, int godiste, int brojVrata) {
		super(marka, tip, registracija, godiste);
		setBrojVrata(brojVrata);
	}

	public int brojVrata() 					{ return brojVrata; 			}
	public void setBrojVrata(int brojVrata) { this.brojVrata = brojVrata; 	}
}
