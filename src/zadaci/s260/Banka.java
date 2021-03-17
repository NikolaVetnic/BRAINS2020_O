package zadaci.s260;

import zadaci.s260.osobe.Klijent;
import zadaci.s260.osobe.SpisakKlijenata;
import zadaci.s260.osobe.SpisakZaposlenih;
import zadaci.s260.racuni.Racun;
import zadaci.s260.racuni.SpisakRacuna;
import zadaci.s260.transakcije.SpisakTransakcija;

public class Banka implements RadSaTransakcijama {
	
	
	private String naziv;

	
	private SpisakZaposlenih zaposleni;
	private SpisakKlijenata klijenti;
	private SpisakRacuna racuni;
	private SpisakTransakcija transakcije;
	
	
	private Banka(String naziv) {
		this.naziv = naziv;
		this.zaposleni = SpisakZaposlenih.prazan();
		this.klijenti = SpisakKlijenata.prazan();
		this.racuni = SpisakRacuna.prazan();
		this.transakcije = SpisakTransakcija.prazna();
	}
	
	
	public static Banka prazna(String naziv) {
		return new Banka(naziv);
	}
	
	
	public void ucitajZaposlene(String input) {
		this.zaposleni.ucitajIzFajla(input);
	}
	

	public void ucitajKlijente(String input) {
		this.klijenti.ucitajIzFajla(input);
	}
	
	
	public void ucitajRacune(String input) {
		this.racuni.ucitajIzFajla(input);
	}
	
	
	public void otvoriRacun(String jmbg, boolean dinarski) {
		
		if (klijenti.nadjiOsobu(jmbg) == -1)
			throw new IllegalArgumentException("Trazena osoba nije klijent banke!");
		
		racuni.otvoriRacun(jmbg, dinarski);
	}


	@Override
	public void izvrsiInternuTransakciju(Klijent posiljalac, Klijent primalac, float iznos) {
		
		Racun r0 = null;
		Racun r1 = null;
		
		for (Racun r : racuni.racuni())
			if (r.jmbg().equals(posiljalac.jmbg()) && r.stanje() >= iznos) {
				r0 = r;
			} else if (r.jmbg().equals(primalac.jmbg())) {
				r1 = r;
			}
		
		if (r0 == null)
			throw new IllegalArgumentException("Posiljalac ili nema racun ili nema dovoljno sredstava ni na jednom od racuna!");
		
		if (r1 == null)
			throw new IllegalArgumentException("Primalac nema otvoren racun!");
		
		r0.setStanje(r0.stanje() - iznos);
		r1.setStanje(r1.stanje() + iznos);
		
		String t = r0.broj() + " -" + iznos + " | " + r1.broj() + " +" + iznos;

		System.out.println("Obavljena INTERNA transakcija: " + t);
		this.transakcije.dodajTransakciju(r0.broj() + " -" + iznos + " | " + r1.broj() + " +" + iznos);
	}


	public SpisakZaposlenih zaposleni() 	{ return zaposleni; 	}
	public SpisakKlijenata klijenti() 		{ return klijenti; 		}
	public SpisakRacuna racuni() 			{ return racuni; 		}
	public SpisakTransakcija transakcije() 	{ return transakcije; 	}
	public String naziv()					{ return naziv; 		}
	
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o)
			return true;
		
		if (o == null) 
			return false;
		
		if (this.getClass() != o.getClass())
			return false;
		
		Banka b = (Banka) o;
		
		if (!this.naziv().equalsIgnoreCase(b.naziv())) return false;
		
		return true;
	}
}
