package zadaci.s087;

public class Automobil extends Vozilo {
	
	
	private static final double MAX_BRZINA = 200.0;

	
	private int brojVrata;
	
	
	public Automobil(String marka, String tip, String registracija, int godiste, int brojVrata, Motor pogAgregat) {
		super(marka, tip, registracija, godiste, pogAgregat);
		setBrojVrata(brojVrata);
	}
	
	@Override
	public double maxBrzina()				{ return MAX_BRZINA;				}

	
	public int brojVrata() 					{ return brojVrata; 			}
	public void setBrojVrata(int brojVrata) { this.brojVrata = brojVrata; 	}
}
