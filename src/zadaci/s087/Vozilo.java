package zadaci.s087;

public class Vozilo {

	
	protected String marka, tip, registracija;
	protected int godiste;
	protected Osoba vlasnik;
	protected Motor pogAgregat;
	
	
	public Vozilo(String marka, String tip, String registracija, int godiste) {
		this.marka = marka;
		this.tip = tip;
		this.registracija = registracija;
		this.godiste = godiste;
		this.vlasnik = null;
	}

	
	public Osoba vlasnik() 								{ return vlasnik; 					}	
	public String marka() 								{ return marka; 					}
	public String tip() 								{ return tip; 						}
	public String registracija() 						{ return registracija; 				}
	public int godiste() 								{ return godiste; 					}
	
	
	public void setMarka(String marka) 					{ this.marka = marka; 				}
	public void setTip(String tip) 						{ this.tip = tip; 					}
	public void setRegistracija(String registracija) 	{ this.registracija = registracija; }
	public void setGodiste(int godiste) 				{ this.godiste = godiste; 			}
	public void setVlasnik(Osoba o) 					{ this.vlasnik = o; 				}
	
	
	public String toString() {
		return String.format("%-10s %-10s %-10s %4d [ %-10s %-10s ]", 
				marka(), tip(), registracija(), godiste(), vlasnik().ime(), vlasnik().prezime());
	}
}
