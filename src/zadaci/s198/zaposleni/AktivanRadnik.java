package zadaci.s198.zaposleni;

import java.io.PrintWriter;

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
	public void sacuvajRadnika(PrintWriter pw) {
		
		String line = "+ " + ime + " " + prezime + " " + jmbg + " " + brRacuna + " " + koefStrucneSpreme;
		pw.println(line);
		
		System.out.println("Radnik " + ime + " " + prezime + " sacuvan!");
	}

	@Override
	public double plata() {
		return (koefStrucneSpreme + varijabilniKoef) * cenaRada;
	}
}
