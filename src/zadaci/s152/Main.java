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
	}
}
