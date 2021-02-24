package zadaci.s198.zaposleni;

import java.io.PrintWriter;

public class RadnikNaBolovanju extends Radnik {
	
	private static final double varijabilniKoef = 1.75;
	
	private static double cenaRada = 100.0;
	
	public RadnikNaBolovanju(
			String ime, 
			String prezime, 
			String jmbg, 
			String brRacuna, 
			double koefStrucneSpreme) {
		super(ime, prezime, jmbg, brRacuna, koefStrucneSpreme);
	}

	@Override
	public Radnik ucitajRadnika(String line) {
		
		String[] tokens = line.split(" ");
		
		if (tokens.length != 6)
			throw new IllegalArgumentException("Neispravno formatirana linija -> '" + line + "'");
		
		return new RadnikNaBolovanju(
				tokens[1].trim(),
				tokens[2].trim(),
				tokens[3].trim(),
				tokens[4].trim(),
				Double.parseDouble(tokens[5].trim())
				);
	}

	@Override
	public void sacuvajRadnika(PrintWriter pw) {
		
		String line = "+ " + ime + " " + prezime + " " + jmbg + " " + brRacuna + " " + koefStrucneSpreme;
		pw.println(line);
		
		System.out.println("Radnik " + ime + " " + prezime + " sacuvan!");
	}

	@Override
	public double plata() {
		return 0.8 * koefStrucneSpreme * cenaRada;
	}
}
