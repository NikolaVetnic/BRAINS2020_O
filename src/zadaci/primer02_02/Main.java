package zadaci.primer02_02;

import java.util.Arrays;
import java.util.Random;

public class Main {

	
	private static Random rng = new Random();
	
	
	public static void main(String[] args) {
		
		Vozilo[] v = new Vozilo[3];
		
		for (int i = 0; i < v.length; i++)
			v[i] = new Vozilo(
					"Marka",
					"Tip",
					rng.nextInt(10),
					"reg",
					rng.nextInt(10),
					rng.nextInt(10)
					);
		
		Arrays.sort(v);
		
		for (int i = 0; i < v.length; i++)
			System.out.println(v[i]);
	}
}
