package zadaci.s198;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import zadaci.s198.zaposleni.AktivanRadnik;
import zadaci.s198.zaposleni.Radnik;

public class Main {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("res//spisak.txt"));
			 PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//plate")));
		) {
			String line = br.readLine();
			
			String[] tokens = line.split(" ");
			if (tokens.length != 2)
				throw new IllegalArgumentException("Neispravno formatirana linija -> '" + line + "'");
			
			double cenaRada = Double.parseDouble(tokens[0].trim());
			int brRadnika = Integer.parseInt(tokens[1].trim());
			
			Radnik[] r = new Radnik[brRadnika];
			
			for (int i = 0; i < brRadnika; i++) {
				
				line = br.readLine();
				
				if (line.charAt(0) == '+')
					r[i] = new AktivanRadnik(line, line, line, line, cenaRada);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
