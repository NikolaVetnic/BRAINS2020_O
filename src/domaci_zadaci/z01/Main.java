package domaci_zadaci.z01;

import java.util.Random;

public class Main {
	
	
	private static Random rng = new Random();
	
	
	private static Racunar[] r = new Racunar[7];
	
	
	private static String[] oznakeProcesora = { "AMD", "i3", "i5", "i7", "M", "Celeron", "Motorola" };
	
	
	private static void stampaj(Racunar[] r, boolean sort) {
		
		System.out.println("Niz racunara (" + (sort ? "sortirano" : "nesortirano") + ") : ");
		
		if (sort) HeapSort.heapSort(r);
		
		for (int i = 0; i < r.length; i++)
			System.out.println(r[i]);
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < r.length; i++)
			r[i] = new Racunar(
					oznakeProcesora[i],
					1.0 * (rng.nextInt(30) + 1) / 10,
					(int) Math.pow(2, rng.nextInt(6) + 1)
					);
		
		stampaj(r, false);
		
		stampaj(r, true);
	}
}
