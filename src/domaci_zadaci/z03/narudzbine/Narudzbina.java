package domaci_zadaci.z03.narudzbine;

import java.util.List;

import domaci_zadaci.z03.Element;
import domaci_zadaci.z03.jelovnik.Stavka;

public class Narudzbina extends Element {
	
	private String idKlijenta;
	private List<String> idStavki;
	private boolean dostavljeno;
	
	
	private Narudzbina(String id, String idKlijenta, List<String> idStavki, boolean dostavljeno) {
		super(id);
		
		this.idKlijenta = idKlijenta;
		this.idStavki = idStavki;
		this.dostavljeno = dostavljeno;
	}
	
	
	public static Narudzbina kreiraj(String idKlijenta) {
		return new Narudzbina(java.time.LocalDateTime.now().toString().replaceAll("[-T:\\.]", ""), idKlijenta, null, false);
	}
	
	
	public static Narudzbina kreiraj(String idKlijenta, List<String> idStavki) {
		return new Narudzbina(java.time.LocalDateTime.now().toString().replaceAll("[-T:\\.]", ""), idKlijenta, idStavki, false);
	}
	
	
	public static Narudzbina izFajla(String id, String idKlijenta, List<String> idStavki, boolean dostavljeno) {
		return new Narudzbina(id, idKlijenta, idStavki, dostavljeno);
	}


	public String idKlijenta() 		{ return idKlijenta; 	}
	public List<String> idStavki() 	{ return idStavki; 		}
	public boolean dostavljeno() 	{ return dostavljeno; 	}
	
	
	public void dodajStavku(Stavka s) {
		idStavki.add(s.id());
	}
	
	
	public boolean izbaciStavku(String id) {
		
		for (String idStavke : idStavki) 
			if (idStavke.equals(id)) {
				idStavki.remove(idStavke);
				return true;
			}
		
		System.err.println("Trazena stavka nije u narudzbini!");
		return false;
	}
	
	
	public String idToDateTime() {
		return String.format("%s-%s-%s %s:%s:%s", 
				id().substring( 0, 4 ), id().substring( 4,  6), id().substring( 6,  8), 
				id().substring( 8, 10), id().substring(10, 12), id().substring(12, 14), id().substring(15));
	}
	
	
	public String toString() {
		return String.format(
				"%s %s (%s) : ",  id(), idKlijenta(), dostavljeno() ? 
				"dostavljeno" : "nedostavljeno") + idStavki.toString();
	}
}
