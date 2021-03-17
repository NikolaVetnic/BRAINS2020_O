package zadaci.s260;

import java.util.LinkedList;
import java.util.List;

import zadaci.s260.osobe.Klijent;
import zadaci.s260.racuni.Racun;

public class PlatniPromet {

	
	private List<Banka> banke;
	
	
	private PlatniPromet() {
		this.banke = new LinkedList<Banka>();
	}
	
	
	public static PlatniPromet prazan() {
		return new PlatniPromet();
	}
	
	
	public void dodajBanku(Banka b) {
		this.banke.add(b);
	}
	
	
	public Banka banka(String naziv) {
		for (Banka b : banke) if (b.naziv().equalsIgnoreCase(naziv))
			return b;
		
		return null;
	}
	
	
	public void izvrsiEksternuTransakciju(Banka b0, Klijent k0, Banka b1, Klijent k1, double iznos) {
		
		boolean f0 = false,
				f1 = false;
		
		for (Banka b : banke)
			if 		(b.equals(b0)) f0 = true;
			else if (b.equals(b1)) f1 = true;
		
		if (!f0 || !f1) 
			throw new IllegalArgumentException("Jedna od banaka nije u platnom prometu!");
		
		if (b0.klijenti().nadjiOsobu(k0) == -1)
			throw new IllegalArgumentException("Posiljalac nije klijent svoje banke!");
		
		if (b1.klijenti().nadjiOsobu(k1) == -1)
			throw new IllegalArgumentException("Primalac nije klijent svoje banke!");
		
		Racun r0 = null,
			  r1 = null;
		
		for (Racun r : b0.racuni().racuni())
			if (r.jmbg().equals(k0.jmbg()) && r.stanje() >= iznos)
				r0 = r;
		
		for (Racun r : b0.racuni().racuni())
			if (r.jmbg().equals(k1.jmbg()))
				r1 = r;
		
		if (r0 == null)
			throw new IllegalArgumentException("Posiljalac ili nema racun ili nema dovoljno sredstava ni na jednom od racuna!");
		
		if (r1 == null)
			throw new IllegalArgumentException("Primalac nema otvoren racun!");
		
		r0.setStanje(r0.stanje() - iznos);
		r1.setStanje(r1.stanje() + iznos);
		
		String t = "[e] " + 
				   b0.naziv().toUpperCase() + " " + r0.broj() + " -" + iznos + " | " + 
				   b1.naziv().toUpperCase() + " " + r1.broj() + " +" + iznos;
		
		System.out.println("Obavljena EKSTERNA transakcija: " + t + "\n");
		b0.transakcije().dodajTransakciju(t);
		b1.transakcije().dodajTransakciju(t);
	}
	
	
	public void stampaj() {
		
		System.out.println("Banke u platnom prometu : ");
		for (Banka b : banke) System.out.println(b);
		
		System.out.println();
	}
	
	
	public List<Banka> banke() 	{ return banke; 	}
}
