package zadaci.s087;

public class Motocikl extends Vozilo {

	private boolean registrovan;
	
	public Motocikl(String marka, String tip, String registracija, int godiste, boolean registrovan) {
		super(marka, tip, registracija, godiste);
		setRegistrovan(registrovan);
	}

	public boolean isRegistrovan() 					{ return registrovan; 				}
	public void setRegistrovan(boolean registrovan) { this.registrovan = registrovan; 	}
}
