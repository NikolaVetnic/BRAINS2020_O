package ostalo.ispit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ucitavanje {

	/*
	 * Tekstualna datoteka sadrži podatke o energentima 
	 * kojima se trguje na energetskoj berzi u sledećem 
	 * obliku: RosEnergija 17.88 false. Prvi parametar 
	 * je naziv kompanije vlasnika energenta, drugi je 
	 * količina energenta u megavatima, a treći inorma-
	 * cija o tome da li je energent iz obnovljivih iz-
	 * vora ili ne. Napisati funkciju kojom se iz ove 
	 * datoteke mogu učitati podaci o proizvoljnom bro-
	 * ju energenata u dinamički niz listaEnergenata.
	 */
	
	public static List<Energent> ucitaj(String input) {
		
		String file = "res//" + input + ".txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			List<Energent> l = new ArrayList<Energent>();
			String line;
			
			while ((line = br.readLine()) != null) {
					
				String[] tokens = line.split(" ");
					
				if (tokens.length != 3)
					throw new IllegalArgumentException("Nepravilno formatirana linija -> " + line);
				
				l.add(new Energent(
						tokens[0].trim(), 
						Double.parseDouble(tokens[1].trim()), 
						tokens[2].trim().equalsIgnoreCase("false") ? false : true));				
			}
			
			return l;
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		List<Energent> l = ucitaj("ispit");
		System.out.println(l);
	}
}
