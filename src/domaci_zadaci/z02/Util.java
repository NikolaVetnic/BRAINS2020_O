package domaci_zadaci.z02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {

	
	private static Random rng = new Random(42);
	
	
	public static void generisiUlazniFajl(int brLinija, double vrv) {
		
		try (PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter("res/z02_funkcijeUlaz.txt")));) {
			
			for (int i = 0; i < brLinija; i++) {
				
				String line = String.format("%6.2f %6.2f", 
						rng.nextDouble() * rng.nextInt(50) , 
						rng.nextDouble() * rng.nextInt(50));
				
				line = rng.nextDouble() < vrv ? line : line + String.format(" %6.2f", rng.nextDouble() * rng.nextInt(50));
				
				pw.println(line);
			}
		} catch (IOException e) {
			System.err.println("Greska prilikom generisanja fajla");
		}
	}
	
	
	public static Funkcija[] ucitajFunkcije(String file) throws FileNotFoundException, IOException {
		
		Funkcija[] funkcije = new Funkcija[0];
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			List<Funkcija> l = new ArrayList<Funkcija>();
			
			while ((line = br.readLine()) != null) {
				
				if (line.trim().split("\\s+").length == 2)
					l.add(new LinearnaFunkcija(line));
				else
					l.add(new KvadratnaFunkcija(line));
			}
			
			funkcije = l.toArray(funkcije);
			
		}
		
		return funkcije;
	}
	
	
	public static void sacuvajSaNulama(Funkcija[] funkcije, String file) throws IOException {
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
			
			for (Funkcija f : funkcije) {
				if (f instanceof LinearnaFunkcija) {
					LinearnaFunkcija lf = (LinearnaFunkcija) f;
					pw.printf("%6.2f %6.2f %14s %4s %8s \n", lf.a(), lf.b(), "|", "", lf.prikaziNule());
				} else {
					KvadratnaFunkcija kf = (KvadratnaFunkcija) f;
					pw.printf("%6.2f %6.2f %6.2f %7s %6s %s \n", kf.a(), kf.b(), kf.c(), "|", "", kf.prikaziNule());
				}
			}
		}
	}
}
