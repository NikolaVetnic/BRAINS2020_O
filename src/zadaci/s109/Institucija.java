package zadaci.s109;

public class Institucija {
	
	
	private static final int MAX = 20;

	
	private String naziv, adresa, maticniBroj;
	private Osoba zakonskiZastupnik;
	
	private Ucionica[] ucionice;
	private Zaposleni[] zaposleni;
	
	private int brU, brZ;
	
	
	public Institucija(String naziv, String adresa, String maticniBroj, Osoba zakonskiZastupnik) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.maticniBroj = maticniBroj;
		this.zakonskiZastupnik = zakonskiZastupnik;
		
		this.ucionice = new Ucionica[MAX];
		this.brU = 0;
		
		this.zaposleni = new Zaposleni[MAX];
		this.brZ = 0;
	}
	
	
	public Institucija() {
		this("", "", "", null);
	}
	
	
	public boolean dodajUcionicu(String oznaka, String tip, int brMesta, double povrsina, boolean racunarska) {
		
		if (brU == MAX)
			return false;
		
		ucionice[brU++] = racunarska ? 
				new RacunarskaUcionica(oznaka, tip, brMesta, povrsina) : 
				new Ucionica		  (oznaka, tip, brMesta, povrsina) ;
		
		return true;
	}
	
	
	public boolean dodajZaposlenog(String ime, String prezime, int starost, double koefRadnogMesta) {
		
		if (brZ == MAX)
			return false;
		
		zaposleni[brZ++] = new Zaposleni(ime, prezime, starost, koefRadnogMesta);
		return true;
	}
	
	
	private Ucionica nadjiUcionicu(String oznaka) {
		for (int i = 0; i < brU; i++)
			if (ucionice[i].oznaka().equals(oznaka))
				return ucionice[i];
		
		return null;
	}
	
	
	public boolean dodajRacunarUUcionicu(String oznaka, String procesor, double radniTakt, int kapacitetMemorije) {
		
		Ucionica u = nadjiUcionicu(oznaka);
		if (u == null) return false;
		
		if (!(u instanceof RacunarskaUcionica))
			throw new IllegalArgumentException("\tRacunari se dodaju samo u racunarske ucionice!");
		
		RacunarskaUcionica ru = (RacunarskaUcionica) u;
		
		ru.dodajRacunar(new Racunar(procesor, radniTakt, kapacitetMemorije));
		return true;
	}

	
	public String naziv() 				{ return naziv; 			}
	public String adresa() 				{ return adresa; 			}
	public String maticniBroj() 		{ return maticniBroj; 		}
	public Osoba zakonskiZastupnik() 	{ return zakonskiZastupnik; }
	public Ucionica[] ucionice() 		{ return ucionice; 			}
	public Zaposleni[] zaposleni() 		{ return zaposleni; 		}
	public int brojUcionica() 			{ return brU; 				}
	public int brojZaposlenih() 		{ return brZ; 				}

	
	public void setNaziv(String naziv) 							{ this.naziv = naziv; 							}
	public void setAdresa(String adresa) 						{ this.adresa = adresa; 						}
	public void setMaticniBroj(String maticniBroj) 				{ this.maticniBroj = maticniBroj; 				}
	public void setZakonskiZastupnik(Osoba zakonskiZastupnik) 	{ this.zakonskiZastupnik = zakonskiZastupnik; 	}
	
	
	public String toString() {
		return naziv + ", " + adresa + " (" + maticniBroj + ")";
	}
	
	
	public void prikazi() {
		
		System.out.println(this);
		
		System.out.println("Zaposleni : ");
		for (int i = 0; i < brZ; i++) System.out.println("\t" + zaposleni[i]);
		
		System.out.println("Ucionice : ");
		for (int i = 0; i < brU; i++) System.out.println("\t" + ucionice[i]);
	}
}
