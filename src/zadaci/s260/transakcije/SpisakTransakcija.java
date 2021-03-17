package zadaci.s260.transakcije;

import java.util.ArrayList;
import java.util.List;

public class SpisakTransakcija {

	
	private List<Transakcija> transakcije;
	
	
	private SpisakTransakcija() {
		this.transakcije = new ArrayList<Transakcija>();
	}
	
	
	public static SpisakTransakcija prazna() {
		return new SpisakTransakcija();
	}
	
	
	public List<Transakcija> transakcije() 	{ return transakcije; 	}
	
	
	public void dodajTransakciju(String t) {
		transakcije.add(Transakcija.kreiraj(t));
	}
	
	
	public void stampaj() {
		
		System.out.println("Transakcije : ");
		for (Transakcija t : transakcije) System.out.println(t);
		
		System.out.println();
	}
}
