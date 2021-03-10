package zadaci.s228b;

import java.util.LinkedList;
import java.util.List;

public class Institucija {
	
	
//	private static final int MAX = 20;

	
	private String naziv, adresa, maticniBroj;
	private Osoba zakonskiZastupnik;
	
//	private Ucionica[] ucionice;
//	private Zaposleni[] zaposleni;
	
	private List<Ucionica> ucionice;
	private List<Zaposleni> zaposleni;
	
//	private int brU, brZ;
	
	
	public Institucija(String naziv, String adresa, String maticniBroj, Osoba zakonskiZastupnik) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.maticniBroj = maticniBroj;
		this.zakonskiZastupnik = zakonskiZastupnik;
		
		this.ucionice = new LinkedList<Ucionica>();
		this.zaposleni = new LinkedList<Zaposleni>();
		
//		this.ucionice = new Ucionica[MAX];
//		this.brU = 0;
		
//		this.zaposleni = new Zaposleni[MAX];
//		this.brZ = 0;
	}
	
	
	public Institucija() {
		this("", "", "", null);
	}
	
	
	public void dodajUcionicu(String oznaka, String tip, int brMesta, double povrsina, boolean racunarska) {
		ucionice.add(racunarska ? 
				new RacunarskaUcionica(oznaka, tip, brMesta, povrsina) : 
				new Ucionica		  (oznaka, tip, brMesta, povrsina));
	}
	
	
	public void dodajZaposlenog(String ime, String prezime, int starost, double koefRadnogMesta) {
		zaposleni.add(new Zaposleni(ime, prezime, starost, koefRadnogMesta));
	}
	
	
	private Ucionica nadjiUcionicu(String oznaka) {
		for (Ucionica u : ucionice) if (u.oznaka().equals(oznaka)) return u;
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
	public List<Ucionica> ucionice() 	{ return ucionice; 			}
	public List<Zaposleni> zaposleni() 	{ return zaposleni; 		}
	public int brojUcionica() 			{ return ucionice.size(); 	}
	public int brojZaposlenih() 		{ return zaposleni.size(); 	}

	
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
		for (Zaposleni z : zaposleni) System.out.println("\t" + z);
		
		System.out.println("Ucionice : ");
		for (Ucionica u : ucionice) System.out.println("\t" + u);
	}
}
