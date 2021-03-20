package domaci_zadaci.z03.narudzbine;

import java.util.ArrayList;
import java.util.List;

import domaci_zadaci.z03.Element;
import domaci_zadaci.z03.Spisak;
import domaci_zadaci.z03.osobe.Klijent;

public class SpisakNarudzbi extends Spisak {
	
	
	private SpisakNarudzbi() {
		super();
	}
	
	
	public static SpisakNarudzbi prazan() {
		return new SpisakNarudzbi();
	}
	
	
	public static SpisakNarudzbi izFajla(String input) {
		
		SpisakNarudzbi s = new SpisakNarudzbi();
		s.ucitajIzFajla(input);
		
		return s;
	}
	

	@Override
	protected Element parsirajLiniju(String line) {
		
		String[] tokens = line.split(" ");
		
		List<String> idStavki = new ArrayList<String>();
		
		for (int i = 3; i < tokens.length; i++)
			idStavki.add(tokens[i].trim());
		
		return Narudzbina.izFajla(
				tokens[0].trim(), 
				tokens[1].trim(), 
				idStavki, 
				tokens[2].trim().equalsIgnoreCase("D"));
	}

	@Override
	protected String pripremiLiniju(Element e) {
		
		Narudzbina n = (Narudzbina) e;
		
		String idStavkiString = "";
		for (String id : n.idStavki()) idStavkiString += id + " ";
		
		return String.format("%s %s %s %s", n.id(), n.idKlijenta(), n.dostavljeno() ? "D" : "N", idStavkiString);
	}

	
	protected boolean dodajNarudzbinu(String id, String idKlijenta, List<String> idStavki, boolean dostavljeno) {
		return dodaj(Narudzbina.izFajla(id, idKlijenta, idStavki, dostavljeno));
	}
	
	
	public void kreirajNarudzbinu(String idKlijenta) {
		dodaj(Narudzbina.kreiraj(idKlijenta));
	}
	
	
	public void kreirajNarudzbinu(String idKlijenta, List<String> idStavki) {
		dodaj(Narudzbina.kreiraj(idKlijenta, idStavki));
	}
}
