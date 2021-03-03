package zadaci.s152.prodavnice;

import zadaci.s152.osobe.SpisakKlijenata;
import zadaci.s152.osobe.SpisakZaposlenih;
import zadaci.s152.osobe.Zaposleni;

public abstract class Prodavnica implements Finansije, Logistika {

	
	protected SpisakKlijenata  spisakKlijenata ;
	protected SpisakZaposlenih spisakZaposlenih;
	private float stanjeRacuna;
	
	
	Prodavnica() {}
	
	
	Prodavnica(int maxBrojKlijenata, int maxBrojZaposlenih){
		this.spisakKlijenata 	= new SpisakKlijenata(maxBrojKlijenata);
		this.spisakZaposlenih	= new SpisakZaposlenih(maxBrojZaposlenih);
	}
	
	
	/**************
	 *  KLIJENTI  *
	 **************/
	
	public boolean dodajKlijenta(String ime, String prezime, String jmbg) {
		return spisakKlijenata.dodajKlijenta(ime, prezime, jmbg);
	}
	
	public void ucitajKlijente(String input) {
		spisakKlijenata.ucitaj(input);
	}
	
	public boolean izbaciKlijenta(String ime, String prezime) {
		return spisakKlijenata.izbaciKlijenta(ime, prezime);
	}
	
	public void sortirajKlijente() {
		spisakKlijenata.sort();
	}

	public void stampajKlijente() {
		spisakKlijenata.stampaj();
	}
	
	
	/***************
	 *  ZAPOSLENI  *
	 ***************/
	
	public boolean dodajZaposlenog(String ime, String prezime, String jmbg, double koefRadnogMesta) {
		return spisakZaposlenih.dodajZaposlenog(ime, prezime, jmbg, koefRadnogMesta);
	}
	
	public void ucitajZaposlene(String input) {
		spisakZaposlenih.ucitaj(input);
	}
	
	public boolean izbaciZaposlenog(String ime, String prezime) {
		return spisakZaposlenih.izbaciZaposlenog(ime, prezime);
	}

	public boolean izbaciZaposlenog(String jmbg) {
		return spisakZaposlenih.izbaciZaposlenog(jmbg);
	}
	
	public void sortirajZaposlene() {
		spisakZaposlenih.sort();
	}

	public void stampajZaposlene() {
		spisakZaposlenih.stampaj();
	}
	
	
	/***************
	 *  FINANSIJE  *
	 ***************/
	
	public float prikaziStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(float stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}
	
	public int obracunajPlate(Zaposleni[] spisakZaposlenih) {
		return -1;
	}
		
	public float isplatiPorez(Zaposleni[] spisakZaposlenih) {
		return (float) -1.0;
	}

	public void izracunajPDV() {
		System.out.println("Stopa PDV je 20%!");
	}
	
	
	/**************
	 *  INVENTAR  *
	 **************/
	
	public abstract String[] uzmiIzInventara();
	
	public void potrosiInventar(String artikal) {
		System.out.println(artikal + " potrosen!");
	}
	
	public abstract void nabaviInventar(String artikal);
	
	public int prikaziStanjeInventara(String[] spisakArtikala) {
		return -1;
	}
}
