package zadaci.primer06_01;

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
	public String pribaviIme() {
		return imeKompanije;
	}

	@Override
	public void postaviIme(String ime) {
		this.imeKompanije = ime;
	}

	@Override
	public String[] uzmiInventar() {
		return stavkaMenija;
	}

	@Override
	public void kupiInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal " + artikal);
	}

	@Override
	public String pribaviAdresu() {
		return adresaKompanije;
	}

	@Override
	public void postaviAdresu(String adresa) {
		this.adresaKompanije = adresa;
	}
}
