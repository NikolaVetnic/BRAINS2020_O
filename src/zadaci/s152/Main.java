package zadaci.s152;

public class Main {

	public static void main(String[] args) {
		
		Poslasticarnica carigrad = new Poslasticarnica();
		carigrad.postaviIme("Carigrad");
		carigrad.kupiInventar("Sladoled");
		carigrad.postaviAdresu("Preko puta Izvrsnog veca");

		Picerija ciao = new Picerija();
		ciao.postaviIme("Ciao");
		ciao.kupiInventar("Pica");
		ciao.postaviAdresu("Kod Socijalnog");
		
		Restoran r = new Restoran();
		r.postaviIme("Zal za mladost");
		r.postaviAdresu("Ka Futogu");
		r.kupiInventar("Karadjordjeva");
		
		Knjizara k = new Knjizara();
		k.postaviIme("Bulevar Books");
		k.postaviAdresu("Kod Brauhausa");
		k.kupiInventar("Crveni Mars");
	}
}
