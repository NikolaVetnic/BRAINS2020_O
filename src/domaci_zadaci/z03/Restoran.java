package domaci_zadaci.z03;

import domaci_zadaci.z03.jelovnik.Jelovnik;
import domaci_zadaci.z03.narudzbine.SpisakNarudzbi;
import domaci_zadaci.z03.osobe.SpisakKlijenata;

public class Restoran {

	
	private String ime;
	private String adresa;
	
	
	private SpisakKlijenata klijenti;
	private Jelovnik 		jelovnik;
	private SpisakNarudzbi 	narudzbine;
	
	
	private Restoran(String ime, String adresa) {
		this.ime = ime;
		this.adresa = adresa;
		
		this.klijenti 	= SpisakKlijenata.prazan();
		this.jelovnik 	= Jelovnik.prazan();
		this.narudzbine = SpisakNarudzbi.prazan();
	}
	
	
	public static Restoran novi(String ime, String adresa) {
		return new Restoran(ime, adresa);
	}


	public String ime() 				{ return ime; 			}
	public String adresa() 				{ return adresa; 		}
	public SpisakKlijenata klijenti() 	{ return klijenti; 		}
	public Jelovnik jelovnik() 			{ return jelovnik; 		}
	public SpisakNarudzbi narudzbine() 	{ return narudzbine; 	}


	public void setIme(String ime) 							{ this.ime = ime; 				}
	public void setAdresa(String adresa) 					{ this.adresa = adresa; 		}
	public void setKlijenti(SpisakKlijenata klijenti) 		{ this.klijenti = klijenti; 	}
	public void setJelovnik(Jelovnik jelovnik) 				{ this.jelovnik = jelovnik; 	}
	public void setNarudzbine(SpisakNarudzbi narudzbine) 	{ this.narudzbine = narudzbine; }
}
