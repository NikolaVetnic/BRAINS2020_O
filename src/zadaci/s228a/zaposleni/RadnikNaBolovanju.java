package zadaci.s228a.zaposleni;

public class RadnikNaBolovanju extends Radnik {
	
	public RadnikNaBolovanju(
			String ime, 
			String prezime, 
			String jmbg, 
			String brRacuna, 
			double koefStrucneSpreme) {
		super(ime, prezime, jmbg, brRacuna, koefStrucneSpreme);
	}

	@Override
	public double plata() {
		return 0.8 * koefStrucneSpreme * super.cenaRada;
	}
}
