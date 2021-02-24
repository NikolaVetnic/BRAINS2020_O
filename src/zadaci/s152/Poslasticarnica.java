package zadaci.s152;

public class Poslasticarnica extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String adresaKompanije;
	
	private String[] stavkaMenija = {
			"Sladoled",
			"Torta",
			"Krofna",
			"Kafa",
			"Caj",
			"Limunada"
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
