package domaci_zadaci.z03.jelovnik;

import java.util.HashMap;
import java.util.Map;

import domaci_zadaci.z03.Element;

public class Stavka extends Element {
	
	
	private static Map<String, TipStavke> tipovi = new HashMap<String, TipStavke>();
	
	
	{
		tipovi.put("predjelo", TipStavke.PREDJELO);
		tipovi.put("glavno", TipStavke.GLAVNO);
		tipovi.put("salata", TipStavke.SALATA);
		tipovi.put("dezert", TipStavke.DEZERT);
		tipovi.put("pice", TipStavke.PICE);
	}


	private String naziv;
	private TipStavke tip;
	private double cena;
	
	
	private Stavka(String id, String naziv, String tip, double cena) {
		super(id);
		
		if (tipovi.get(tip.toLowerCase()) == null)
			throw new IllegalArgumentException("Neispravan tip stavke!");

		this.naziv = naziv;
		this.tip = tipovi.get(tip.toLowerCase());
		this.cena = cena;
	}
	
	
	public static Stavka nova(String id, String naziv, String tip, double cena) {
		return new Stavka(id, naziv, tip, cena);
	}


	public String 		naziv() { return naziv; }
	public TipStavke 	tip() 	{ return tip; 	}
	public double 		cena() 	{ return cena; 	}
	
	
	public String toString() {
		return String.format("%s %40s %10s %10.2f", id(), naziv(), tip.toString(), cena());
	}
}
