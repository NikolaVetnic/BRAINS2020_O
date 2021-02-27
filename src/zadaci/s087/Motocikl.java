package zadaci.s087;

public class Motocikl extends Vozilo {
	
	
	private static final double MAX_BRZINA = 250.0;

	
	private boolean registrovan;
	
	
	public Motocikl(String marka, String tip, String registracija, int godiste, boolean registrovan, Motor pogAgregat) {
		super(marka, tip, registracija, godiste, pogAgregat);
		setRegistrovan(registrovan);
	}
	
	@Override
	public double maxBrzina()						{ return MAX_BRZINA;				}


	public boolean isRegistrovan() 					{ return registrovan; 				}
	public void setRegistrovan(boolean registrovan) { this.registrovan = registrovan; 	}
}
