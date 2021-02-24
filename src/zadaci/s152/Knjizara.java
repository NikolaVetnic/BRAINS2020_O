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
	public String pribaviIme() {
		return imeKompanije;
	}

	@Override
	public void postaviIme(String ime) {
		this.imeKompanije = ime;
	}

	@Override
	public String[] uzmiInventar() {
		return ponudaKnjiga;
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
