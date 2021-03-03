package zadaci.s152;

public abstract class Prodavnica implements Finansije, Logistika {

	
	protected SpisakKlijenata  spisakKlijenata ;
	protected SpisakZaposlenih spisakZaposlenih;
	private float stanjeRacuna;
	
	
	Prodavnica() {}
	
	
	Prodavnica(int maxBrojKlijenata){
		this.spisakKlijenata = new SpisakKlijenata(maxBrojKlijenata);
	}
	
	
	/**************
	 *  KLIJENTI  *
	 **************/
	
	public boolean dodajKlijenta(String ime, String prezime, int starost) {
		return spisakKlijenata.dodajKlijenta(ime, prezime, starost);
	}
	
	public boolean izbaciKlijenta(String ime, String prezime) {
		return spisakKlijenata.izbaciKlijenta(ime, prezime);
	}
	
	public void sortirajKlijente() {
		this.spisakKlijenata.sort();
	}

	public void stampajKlijente() {
		spisakKlijenata.stampaj();
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
