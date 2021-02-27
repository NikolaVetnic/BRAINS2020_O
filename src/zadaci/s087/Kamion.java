package zadaci.s087;

public class Kamion extends Vozilo {
	
	private static final double MAX_BRZINA = 100.0;

	private int brojOsovina;
	
	public Kamion(String marka, String tip, String registracija, int godiste, int brojOsovina, Motor pogAgregat) {
		super(marka, tip, registracija, godiste, pogAgregat);
		this.brojOsovina = brojOsovina;
	}
	
	@Override
	public double maxBrzina()					{ return MAX_BRZINA;				}


	public int brojOsovina() 					{ return brojOsovina; 				}
	public void setBrojOsovina(int brojOsovina) { this.brojOsovina = brojOsovina; 	}
}
