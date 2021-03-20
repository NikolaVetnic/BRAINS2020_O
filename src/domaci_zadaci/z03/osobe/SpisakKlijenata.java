package domaci_zadaci.z03.osobe;

import domaci_zadaci.z03.Element;

public class SpisakKlijenata extends SpisakOsoba {
	
	
	public static IDGenKlijent idGen = IDGenKlijent.getInstance();
	
	
	private SpisakKlijenata() {
		super();
	}
	
	
	public static SpisakKlijenata prazan() {
		return new SpisakKlijenata();
	}
	
	
	public static SpisakKlijenata izFajla(String input) {
		
		SpisakKlijenata s = new SpisakKlijenata();
		s.ucitajIzFajla(input);
		
		return s;
	}
	

	@Override
	protected Osoba parsirajLiniju(String line) {
		
		String[] tokens = line.split(" ");
		
		if (tokens.length != 5)
			throw new IllegalArgumentException("Lose formatirana linija -> " + line);
		
		int currID = Integer.parseInt(tokens[0].trim());
		if (currID >= idGen.counter()) idGen.setCounter(currID + 1);;
		
		return Klijent.novi(
				tokens[0].trim(), 
				tokens[1].trim(), 
				tokens[2].trim(), 
				tokens[3].trim().replace('_', ' '), 
				tokens[4].trim());
	}
	

	@Override
	protected String pripremiLiniju(Element e) {
		Klijent k = (Klijent) e;
		return String.format("%s %s %s %s %s", k.id(), k.ime(), k.prezime(), k.adresa().replace(' ', '_'), k.tel());
	}

	
	protected boolean dodajKlijenta(String id, String ime, String prezime, String adresa, String tel) {
		return dodaj(Klijent.novi(id, ime, prezime, adresa, tel));
	}
	
	
	public void kreirajKlijenta(String ime, String prezime, String adresa, String tel) {
		dodaj(Klijent.novi(idGen.generisiBroj(), ime, prezime, adresa, tel));
	}
}
