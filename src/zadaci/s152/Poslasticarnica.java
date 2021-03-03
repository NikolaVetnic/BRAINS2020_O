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
	
	
	public Poslasticarnica() {
		super(SpisakOsoba.PODRAZUMEVAN_KAPACITET);
	}

	
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
	
	
	public String toString() {
		return imeKompanije + " " + adresaKompanije;
	}
}
