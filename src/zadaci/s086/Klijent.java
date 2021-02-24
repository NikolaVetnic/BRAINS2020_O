package zadaci.s086;

import java.util.LinkedList;

public class Klijent extends Osoba {

	
	private String jmbg;
	private double stanje;
	private LinkedList<Transakcija> transakcije;
	
	
	public Klijent(String ime, String prezime, int starost, String jmbg, double stanje) {
		super(ime, prezime, starost);
		this.jmbg = jmbg;
		
		this.stanje = stanje;
		this.transakcije = new LinkedList<Transakcija>();
	}
	
	
	public void dodajTransakciju(double iznos, String poruka) {
		transakcije.addFirst(new Transakcija(iznos, poruka));
		stanje += iznos;
	}
	
	
	public String toString() {
		return ime + " " + prezime + " (" + stanje + ")";
	}
}