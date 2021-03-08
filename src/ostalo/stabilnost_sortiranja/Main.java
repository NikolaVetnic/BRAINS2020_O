package ostalo.stabilnost_sortiranja;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	private static Random rng = new Random();
	
	private static final int NUM_EL = 10;
	
	public static void stampaj(Element[] arr) {
		for (Element e : arr) System.out.println(e);
	}

	public static void main(String[] args) {
		
		Element[] arr = new Element[NUM_EL];
		
		for (int i = 0; i < NUM_EL; i++)
			arr[i] = new Element(rng.nextInt(10), (char) (rng.nextInt(26) + 'a'));
		
		stampaj(arr);
		System.out.println();
		
		Arrays.sort(arr, new NumComp());
		stampaj(arr);
	}
}
