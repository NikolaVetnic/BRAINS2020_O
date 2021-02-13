package zadaci.primer01_04;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	
	private static Random rng = new Random();
	

	public static void main(String[] args) {
		
		Racunar[] r = new Racunar[5];
		
		String[] cpu = { "AMD", "Intel", "M", "Elbrus" };
		
		for (int i = 0; i < r.length; i++) {
			r[i] = new Racunar();
			r[i].setProcesor(cpu[i % cpu.length]);
			r[i].setKapacitetMemorije(rng.nextInt(32));
			r[i].setRadniTakt(rng.nextDouble() * 5);
		}
		
		Arrays.sort(r);
		
		for (int i = 0; i < r.length; i++)
			System.out.println(r[i]);
	}
}
