package zadaci.s152;

public class Picerija extends Prodavnica implements Imenovanje {
	
	
	private String imeKompanije;
	private String adresaKompanije;
	
	
	private String[] ponudaHrane = {
			"Pica",
			"Pasta",
			"Salata",
			"Kalcona",
			"Sok",
			"Pivo"
	};
	
	
	public Picerija() {
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
		return ponudaHrane;
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
