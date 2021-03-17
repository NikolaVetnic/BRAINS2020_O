package zadaci.s260;

public class Main {

	public static void main(String[] args) {
		
		PlatniPromet p = PlatniPromet.prazan();
		
		Banka b0 = Banka.prazna("ERSTE");
		
		b0.ucitajZaposlene("s152_spisakZaposlenih");
		b0.ucitajKlijente("s152_spisakKlijenata");
		b0.ucitajRacune("s260_racuni");
		
		b0.racuni().stampaj();
		
		b0.izvrsiInternuTransakciju(
				b0.klijenti().pronadjiKlijenta("0000000000001"), 
				b0.klijenti().pronadjiKlijenta("0000000000002"), 
				(float) 50.0);
		
		b0.transakcije().stampaj();
		
		Banka b1 = Banka.prazna("INTESA");
		
		b1.ucitajZaposlene("s152_spisakZaposlenih");
		b1.ucitajKlijente("s152_spisakKlijenata");
		b1.ucitajRacune("s260_racuni");
		
		p.dodajBanku(b0);
		p.dodajBanku(b1);

		b0.transakcije().stampaj();
		b1.transakcije().stampaj();
		
		try {
			p.izvrsiEksternuTransakciju(
					b0, b0.klijenti().pronadjiKlijenta("0000000000001"), 
					b1, b1.klijenti().pronadjiKlijenta("0000000000002"), 
					(float) 50.0);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		b0.transakcije().stampaj();
		b1.transakcije().stampaj();
		
		b0.otvoriRacun("0000000000001", true);
		b0.otvoriRacun("0000000000001", true);
		b0.otvoriRacun("0000000000001", true);
		
		b0.racuni().stampaj();
	}
}
