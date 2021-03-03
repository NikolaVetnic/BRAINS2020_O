package zadaci.s152.prodavnice;

import zadaci.s152.osobe.Zaposleni;

public interface Finansije {
	int obracunajPlate(Zaposleni[] spisakZaposlenih);   // vraca broj zaposlenih za koje je izvrsen obracun
	float isplatiPorez(Zaposleni[] spisakZaposlenih);   // vraca ukupan iznos placenog poreza
	float prikaziStanjeRacuna();
	
	//float izracunajPorez(); // vraca iznos poreza za placanje
	//boolean generisiGodisnjiIzvestaj();  // vraca da li je uspesno generisan izvestaj
	//float isplatiPlate();   // vraca ukupan iznos isplacenih zarada
}
