package zadaci.s198.zaposleni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SpisakRadnika {

	
	private Radnik[] spisak;
	
	
	public SpisakRadnika(String input) {
		ucitajRadnike(input);
	}
	
	
	/**
	 * Ucitava radnike u spisak iz fajla.
	 * 
	 * @param String imeFajla
	 */


	private void ucitajRadnike(String imeFajla) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("res//" + imeFajla + ".txt"));
				 PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//plate")));
		) {
			
			Radnik.cenaRada = Double.parseDouble(br.readLine().trim());
			
			int numRadnika = Integer.parseInt(br.readLine().trim());

			spisak = new Radnik[numRadnika];
			
			for (int i = 0; i < numRadnika; i++) {
				
				String status 				= br.readLine().trim();
				
				String ime 					= br.readLine().trim();
				String prezime 				= br.readLine().trim();
				String jmbg 				= br.readLine().trim();
				String brRacuna 			= br.readLine().trim();
				double koefStrucneSpreme 	= Double.parseDouble(br.readLine().trim());
				
				double varijabilniKoef		= 0.0;
				
				if (status.equals("-")) {
					spisak[i] = new RadnikNaBolovanju(ime, prezime, jmbg, brRacuna, koefStrucneSpreme);
				} else {
					varijabilniKoef 		= Double.parseDouble(br.readLine().trim());
					spisak[i] = new AktivanRadnik(ime, prezime, jmbg, brRacuna, koefStrucneSpreme, varijabilniKoef);
				}
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	/**
	 * Snimanje spiska radnika u fajl.
	 * 
	 * @param String imeFajla
	 */
	
	
	public void sacuvajPlatniSpisak(String imeFajla) {
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//" + imeFajla + ".txt")))) {
			for (int i = 0; i < spisak.length; i++) pw.println(spisak[i]);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	/**
	 * Stampa spisak radnika.
	 */
	
	
	public void stampaj() {
		for (Radnik r : spisak) System.out.println(r);
	}
}
