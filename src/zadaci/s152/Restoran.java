package zadaci.s152;

public class Restoran extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String adresaKompanije;
	
	private String[] stavkaMenija = {
			"Becka",
			"Karadjordjeva",
			"Tartufi",
			"Supa",
			"Corba",
			"Skembici"
	};
	
	@Override
	public String pribaviImeProdavnice() {
		return imeKompanije;
	}

	@Override
	public void postaviImeProdavnice(String ime) {
		this.imeKompanije = ime;
	}

	@Override
	public String[] uzmiIzInventara() {
		return stavkaMenija;
	}

	@Override
	public void nabaviInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal " + artikal);
	}

	public String pribaviAdresu() {
		return adresaKompanije;
	}

	public void postaviAdresu(String adresa) {
		this.adresaKompanije = adresa;
	}
}
