package zadaci.primer06_01;

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
		return ponudaHrane;
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
