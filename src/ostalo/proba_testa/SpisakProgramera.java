package ostalo.proba_testa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpisakProgramera {

	
	public static List<Programer> l = new ArrayList<Programer>();
	
	
	public void ucitajIzFajla(String input) {
		
		String file = "res//" + input + ".txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				
				String[] tokens = line.split(" ");
				
				if (tokens.length != 5)
					throw new IllegalArgumentException();
				
				l.add(new Programer(
						tokens[0].trim(),
						tokens[1].trim(),
						Integer.parseInt(tokens[2].trim()),
						tokens[3].trim(),
						Double.parseDouble(tokens[4].trim())
						));
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
