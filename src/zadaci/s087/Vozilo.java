package zadaci.s087;

abstract class Vozilo implements Voznja {

	
	private static final double MAX_BRZINA = 50.0;
	
	
	protected String marka, tip, registracija;
	protected int godiste, stepenPrenosa;
	protected double brzina;
	protected Osoba vlasnik;
	protected Motor pogAgregat;
	
	
	public Vozilo(String marka, String tip, String registracija, int godiste, Motor pogAgregat) {
		this.marka = marka;
		this.tip = tip;
		this.registracija = registracija;
		this.godiste = godiste;
		this.stepenPrenosa = 0;
		this.brzina = 0.0;
		this.vlasnik = null;
		this.pogAgregat = pogAgregat;
	}

	
	public Osoba vlasnik() 								{ return vlasnik; 					}	
	public String marka() 								{ return marka; 					}
	public String tip() 								{ return tip; 						}
	public String registracija() 						{ return registracija; 				}
	public int godiste() 								{ return godiste; 					}
	public int stepenPrenosa()							{ return stepenPrenosa;				}
	public double brzina()								{ return brzina;					}
	public double maxBrzina()							{ return MAX_BRZINA;				}
	
	
	public void setMarka(String marka) 					{ this.marka = marka; 				}
	public void setTip(String tip) 						{ this.tip = tip; 					}
	public void setRegistracija(String registracija) 	{ this.registracija = registracija; }
	public void setGodiste(int godiste) 				{ this.godiste = godiste; 			}
	public void setVlasnik(Osoba o) 					{ this.vlasnik = o; 				}
	
	
	public String toString() {
		return String.format("%-10s %-10s %-10s %4d [ %-10s %-10s ]", 
				marka(), tip(), registracija(), godiste(), vlasnik().ime(), vlasnik().prezime());
	}
	
	@Override
	public void povecajStepenPrenosa() {
		if (stepenPrenosa == 5)
			return;
		
		stepenPrenosa++;
	}
	
	@Override
	public void smanjiStepenPrenosa() {
		if (stepenPrenosa == 0)
			return;
		
		stepenPrenosa--;
	}
	
	@Override
	public void ubrzaj(double b) {
		
		if (!pogAgregat.radi()) {
			System.out.println("Vozilo nije u pokretu.");
			return;
		}
		
		if (brzina + b > maxBrzina()) {
			brzina = maxBrzina();
			return;
		}
		
		brzina += b;
	}

	@Override
	public void uspori(double b) {

		if (!pogAgregat.radi()) {
			System.out.println("Vozilo nije u pokretu.");
			return;
		}
		
		if (brzina - b < 0.0) {
			
			brzina = 0.0;
			pogAgregat.setRadi(false);
			
			return;
		}
		
		brzina -= b;
	}

	@Override
	public void ukljuci() {
		
		if (pogAgregat.radi()) {
			System.out.println("Vozilo je vec ukljuceno.");
			return;
		}
		
		System.out.println("Vozilo -> ukljuceno");
		pogAgregat.setRadi(true);
	}

	@Override
	public void iskljuci() {
		
		if (!pogAgregat.radi()) {
			System.out.println("Vozilo je vec iskljuceno.");
			return;
		}
		
		System.out.println("Vozilo -> iskljuceno");
		pogAgregat.setRadi(false);
	}
}
