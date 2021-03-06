package zadaci.s063a;

import java.util.LinkedList;

public class Klijent {

	private String ime, prezime, jmbg;
	private double stanje;
	private LinkedList<Transakcija> transakcije;
	
	public Klijent(String ime, String prezime, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		
		this.stanje = 0.0;
		this.transakcije = new LinkedList<Transakcija>();
	}
	
	public void dodajTransakciju(double iznos, String poruka) {
		transakcije.addFirst(new Transakcija(iznos, poruka));
	}
	
	public String toString() {
		return ime + " " + prezime + " (" + stanje + ")";
	}
}