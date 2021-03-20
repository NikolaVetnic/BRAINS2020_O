package domaci_zadaci.z03.jelovnik;

import domaci_zadaci.z03.Element;
import domaci_zadaci.z03.Spisak;

public class Jelovnik extends Spisak {
	
	
	public static IDGenJelovnik idGen = IDGenJelovnik.getInstance();
	
	
	private Jelovnik() {
		super();
	}
	
	
	public static Jelovnik prazan() {
		return new Jelovnik();
	}
	
	
	public static Jelovnik izFajla(String input) {
		
		Jelovnik j = new Jelovnik();
		j.ucitajIzFajla(input);
		
		return j;
	}
	

	@Override
	protected Element parsirajLiniju(String line) {
		
		String[] tokens = line.split(" ");
		
		if (tokens.length != 4)
			throw new IllegalArgumentException("Lose formatirana linija -> " + line);
		
		int currID = Integer.parseInt(tokens[0].trim());
		if (currID >= idGen.counter()) idGen.setCounter(currID + 1);;
		
		return Stavka.nova(
				tokens[0].trim(), 
				tokens[1].trim().replace('_', ' '),
				tokens[2].trim(), 
				Double.parseDouble(tokens[3].trim()));
	}

	@Override
	protected String pripremiLiniju(Element e) {
		Stavka s = (Stavka) e;
		return String.format("%s %s %s %.2f", s.id(), s.naziv().replace(' ', '_'), s.tip().toString(), s.cena());
	}

	
	protected boolean dodajStavku(String id, String naziv, String tip, double cena) {
		return dodaj(Stavka.nova(id, naziv, tip, cena));
	}
	
	
	public void kreirajStavku(String naziv, String tip, double cena) {
		dodaj(Stavka.nova(idGen.generisiBroj(), naziv, tip, cena));
	}

}
