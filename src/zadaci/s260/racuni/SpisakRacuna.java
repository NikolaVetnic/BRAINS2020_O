package zadaci.s260.racuni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import zadaci.s260.RadSaFajlovima;

public class SpisakRacuna implements RadSaFajlovima {

	
	private static NumeratorRacuna nr = NumeratorRacuna.getInstance();

	private List<Racun> racuni;
	
	
	private SpisakRacuna() {
		this.racuni = new LinkedList<Racun>();
	}
	
	
	public static SpisakRacuna prazan() {
		return new SpisakRacuna();
	}
	
	
	public List<Racun> racuni() { return this.racuni; }
	
	
	@Override
	public void ucitajIzFajla(String input) {
		
		String file = "res//" + input + ".txt";
		
		int maxInt = -1;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			int count = 0;
			
			while ((line = br.readLine()) != null) {
				
				try {
					
					String[] tokens = line.split(" ");
					
					if (tokens.length != 4)
						throw new IllegalArgumentException("Lose formatirana linija " + count + " -> " + line);
					
					this.racuni.add(
							Racun.kreiraj(
									tokens[0].trim(), 
									tokens[1].trim(), 
									tokens[2].trim().equalsIgnoreCase("DIN") ? true : false,
									Double.parseDouble(tokens[3].trim())));
					
					int curr = Integer.parseInt(tokens[1].trim().replaceAll("-", ""));
					maxInt = curr > maxInt ? curr : maxInt;
					
					count++;
					
				} catch (IllegalArgumentException e) {
					System.err.println(e.getMessage());
				}
			}
			
			SpisakRacuna.nr.setCounter(maxInt);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	
	@Override
	public void upisiUFajl(String output) {
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//" + output + ".txt")))) {
			for (Racun r : racuni) pw.println(r.toString());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public void otvoriRacun(String jmbg, boolean dinarski) {
		racuni.add(Racun.kreiraj(jmbg, nr.generisiBroj(), dinarski, 0.0));
	}
	
	
	public void stampaj() {
		
		System.out.println("Racuni, spisak : ");
		for (Racun r : racuni) System.out.println(r);
		
		System.out.println();
	}
	
	
//	public static void main(String[] args) {
//		
//		SpisakRacuna s = SpisakRacuna.prazan();
//		s.ucitajIzFajla("s260_racuni");
//		for (Racun r : s.racuni) System.out.println(r);
//		s.upisiUFajl("s260_AAA");
//		
//	}
}
