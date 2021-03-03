package zadaci.s152;

public class Knjizara extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String adresaKompanije;
	
	private String[] ponudaKnjiga = {
			"Dina",
			"Mesija Dine",
			"Deca Dine",
			"Bozanski Car Dine",
			"Jeretici Dine",
			"Kapitol Dina",
			"Crveni Mars",
			"Zeleni Mars",
			"Plavi Mars"
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
		return ponudaKnjiga;
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
