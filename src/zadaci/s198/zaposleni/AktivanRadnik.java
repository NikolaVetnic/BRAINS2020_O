package zadaci.s198.zaposleni;

public class AktivanRadnik extends Radnik {
	
	private double varijabilniKoef;
	
	public AktivanRadnik(
			String ime, 
			String prezime, 
			String jmbg, 
			String brRacuna, 
			double koefStrucneSpreme,
			double varijabilniKoef) {
		super(ime, prezime, jmbg, brRacuna, koefStrucneSpreme);
		this.varijabilniKoef = varijabilniKoef;
	}

	@Override
	public double plata() {
		return (koefStrucneSpreme + varijabilniKoef) * cenaRada;
	}
}
