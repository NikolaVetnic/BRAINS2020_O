package zadaci.s152;

public class Main {

	public static void main(String[] args) {
		
		Poslasticarnica carigrad = new Poslasticarnica();
		carigrad.postaviImeProdavnice("Carigrad");
		carigrad.nabaviInventar("Sladoled");
		carigrad.postaviAdresu("Preko puta Izvrsnog veca");
		System.out.println(carigrad);

		Picerija ciao = new Picerija();
		ciao.postaviImeProdavnice("Ciao");
		ciao.nabaviInventar("Pica");
		ciao.postaviAdresu("Kod Socijalnog");
		System.out.println(ciao);
		
		Restoran r = new Restoran();
		r.postaviImeProdavnice("Zal za mladost");
		r.postaviAdresu("Ka Futogu");
		r.nabaviInventar("Karadjordjeva");
		
		Knjizara k = new Knjizara();
		k.postaviImeProdavnice("Bulevar Books");
		k.postaviAdresu("Kod Brauhausa");
		k.nabaviInventar("Crveni Mars");
		
		System.out.println("\n\n\n");
		
		int sw = 1;
		
		Prodavnica curr = null;
		
		switch (sw) {
			case 0: curr = carigrad; 	break;
			case 1: curr = ciao; 		break;
			case 2: curr = r; 			break;
			case 3: curr = k; 			break;
		}
		
		System.out.println(curr);
			
		curr.dodajKlijenta("Nikola", "Vetnic", 36);
		curr.dodajKlijenta("Nikola", "Babic", 36);
		curr.dodajKlijenta("Nikola", "Selakovic", 36);
		curr.sortirajKlijente();
		curr.stampajKlijente();
		
		System.out.println();
		
		curr.izbaciKlijenta("Nikola", "Vetnic");
		curr.stampajKlijente();
		
		curr.setStanjeRacuna(1000);
		System.out.println("Stanje racuna : " + curr.prikaziStanjeRacuna());
		curr.potrosiInventar("Artikal");
	}
}
