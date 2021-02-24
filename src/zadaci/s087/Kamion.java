package zadaci.s087;

public class Kamion extends Vozilo {

	private int brojOsovina;
	
	public Kamion(String marka, String tip, String registracija, int godiste, int brojOsovina) {
		super(marka, tip, registracija, godiste);
		this.brojOsovina = brojOsovina;
	}

	public int brojOsovina() 					{ return brojOsovina; 				}
	public void setBrojOsovina(int brojOsovina) { this.brojOsovina = brojOsovina; 	}
}
