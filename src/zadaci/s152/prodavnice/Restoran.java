package zadaci.s152.prodavnice;

import zadaci.s152.osobe.SpisakOsoba;

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
	
	public Restoran(String imeKompanije, String adresaKompanije) {
		super(SpisakOsoba.PODRAZUMEVAN_KAPACITET, SpisakOsoba.PODRAZUMEVAN_KAPACITET);
		this.imeKompanije = imeKompanije;
		this.adresaKompanije = adresaKompanije;
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
