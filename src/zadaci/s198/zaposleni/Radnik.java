package zadaci.s198.zaposleni;

import java.io.PrintWriter;

public abstract class Radnik {

	protected String ime, prezime, jmbg, brRacuna;
	protected double koefStrucneSpreme;
	
	public Radnik(
			String ime, 
			String prezime, 
			String jmbg, 
			String brRacuna, 
			double koefStrucneSpreme) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brRacuna = brRacuna;
		this.koefStrucneSpreme = koefStrucneSpreme;
	}
	
	public abstract Radnik ucitajRadnika(String line);
	public abstract void sacuvajRadnika(PrintWriter pw);
	public abstract double plata();
}
