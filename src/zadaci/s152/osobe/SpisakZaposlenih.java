package zadaci.s152.osobe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import zadaci.s152.util.QuickSort;

public class SpisakZaposlenih extends SpisakOsoba {
	
	
	public SpisakZaposlenih(int maxBrojOsoba) {
		super(maxBrojOsoba);
	}
	
	
	public SpisakZaposlenih() {
		super();
	}
	
	
	public void ucitaj(String input) {
		
		String file = "res//" + input + ".txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			
			int count = 0;
			
			
			while ((line = br.readLine()) != null) {
				
				String[] tokens = line.split(" ");
				
				try {
					
					if (tokens.length != 4)
						throw new IllegalArgumentException("Lose formatirana linija " + count + " -> " + line);
					
					this.dodajZaposlenog(
											   tokens[0].trim(), 
											   tokens[1].trim(), 
											   tokens[2].trim(), 
							Double.parseDouble(tokens[3].trim()));
					
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
	
	
	public boolean dodajZaposlenog(String ime, String prezime, String jmbg, double koefRadnogMesta) {
		return super.dodajOsobu(new Zaposleni(ime, prezime, jmbg, koefRadnogMesta));
	}

	
	public boolean izbaciZaposlenog(String ime, String prezime) {
		return super.izbaciOsobu(ime, prezime);
	}

	
	public boolean izbaciZaposlenog(String jmbg) {
		return super.izbaciOsobu(jmbg);
	}

	
	public void stampaj() {
		super.stampaj("Zaposleni");
	}
}
