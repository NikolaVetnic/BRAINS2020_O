package zadaci.s260.osobe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import zadaci.s260.RadSaKlijentima;

public class SpisakKlijenata extends SpisakOsoba implements RadSaKlijentima {
	
	
	private SpisakKlijenata() {
		super();
	}
	
	
	public static SpisakKlijenata prazan() {
		return new SpisakKlijenata();
	}
	
	
	public static SpisakKlijenata izFajla(String input) {
		
		SpisakKlijenata s = new SpisakKlijenata();
		s.ucitajIzFajla(input);
		
		return s;
	}
	
	
	@Override
	public void ucitajIzFajla(String input) {
		
		String file = "res//" + input + ".txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			int count = 0;
			
			while ((line = br.readLine()) != null) {
				
				try {
					
					String[] tokens = line.split(" ");
					
					if (tokens.length != 3)
						throw new IllegalArgumentException("Lose formatirana linija " + count + " -> " + line);
					
					this.dodajKlijenta(tokens[0].trim(), tokens[1].trim(), tokens[2].trim());
					
					count++;
					
				} catch (IllegalArgumentException e) {
					System.err.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		super.sortirajPoJMBG();
	}
	
	
	public boolean dodajKlijenta(String ime, String prezime, String jmbg) {
		return super.dodajOsobu(new Klijent(ime, prezime, jmbg));
	}
	
	
	@Override
	public boolean dodajKlijenta(Klijent k) {
		return super.dodajOsobu(k);
	}

	
	public boolean izbaciKlijenta(String ime, String prezime) {
		return super.izbaciOsobu(ime, prezime);
	}

	
	public boolean izbaciKlijenta(String jmbg) {
		return super.izbaciOsobu(jmbg);
	}
	
	
	@Override
	public boolean izbaciKlijenta(Klijent k) {
		return super.izbaciOsobu(k.jmbg());
	}
	
	
	@Override
	public Klijent pronadjiKlijenta(String jmbg) {
		return (Klijent) super.osoba(super.nadjiOsobu(jmbg));
	}
	
	
	public void stampaj() {
		super.stampaj("Klijenti");
	}
}
