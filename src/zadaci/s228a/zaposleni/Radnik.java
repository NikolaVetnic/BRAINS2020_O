package zadaci.s228a.zaposleni;

public abstract class Radnik {
	
	public static double cenaRada;

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
	
	public abstract double plata();
	
	public String toString() {
		return String.format("%-15s %-15s %13s %12s %8.2f %10.2f", ime, prezime, jmbg, brRacuna, koefStrucneSpreme, plata());
	}
}
