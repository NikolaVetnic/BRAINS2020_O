package zadaci.s198.zaposleni;

import java.io.PrintWriter;

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
	public void sacuvajRadnika(PrintWriter pw) {
		
		String line = "+ " + ime + " " + prezime + " " + jmbg + " " + brRacuna + " " + koefStrucneSpreme;
		pw.println(line);
		
		System.out.println("Radnik " + ime + " " + prezime + " sacuvan!");
	}

	@Override
	public double plata() {
		return 0.8 * koefStrucneSpreme * super.cenaRada;
	}
}
