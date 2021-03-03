package zadaci.s152.osobe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import zadaci.s152.util.QuickSort;

public class SpisakKlijenata extends SpisakOsoba {
	
	
	public SpisakKlijenata(int maxBrojOsoba) {
		super(maxBrojOsoba);
	}
	
	
	public SpisakKlijenata() {
		super();
	}
	
	
	public void ucitaj(String input) {
		
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
		
		QuickSort.quicksort(super.osobe(), 0, super.trenutniBrojOsoba() - 1);
	}
	
	
	public boolean dodajKlijenta(String ime, String prezime, String jmbg) {
		return super.dodajOsobu(new Klijent(ime, prezime, jmbg));
	}

	
	public boolean izbaciKlijenta(String ime, String prezime) {
		return super.izbaciOsobu(ime, prezime);
	}

	
	public boolean izbaciKlijenta(String jmbg) {
		return super.izbaciOsobu(jmbg);
	}
	
	
	public void stampaj() {
		super.stampaj("Klijenti");
	}
}
