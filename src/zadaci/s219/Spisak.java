package zadaci.s219;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Spisak {

	
	private List<Osoba> spisak;
	
	
	public Spisak(String input) {
		
		spisak = new ArrayList<Osoba>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				
				String[] tokens = line.split(" ");
				
				if (tokens.length != 3)
					throw new IllegalArgumentException("Nepravilno formatirana linija -> " + line);
				
				spisak.add(new Osoba(tokens[0].trim(), tokens[1].trim(), tokens[2].trim()));
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public void sacuvajSpisak(String output) {
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(output)))) {
			for (Osoba o : spisak) pw.println(o.ime() + " " + o.prezime() + " " + o.jmbg());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public void sortirajLeksikografski() {
		spisak.sort(new Osoba.LeksiComp());
	}
	
	
	public void sortirajPoJMBG() {
		spisak.sort(new Osoba.JMBGComp());
	}
	
	
	public void stampaj() {
		for (Osoba o : spisak) System.out.println(o);
	}
}
