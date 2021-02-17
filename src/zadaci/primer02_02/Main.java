package zadaci.primer02_02;

import java.util.Random;

public class Main {

	
	private static Random rng = new Random();
	
	
	@SuppressWarnings("rawtypes")
	public static void quicksort(Comparable[] arr) {
		quicksort(arr, 0, arr.length - 1);
	}
	
	
	@SuppressWarnings("rawtypes")
	private static void quicksort(Comparable[] arr, int l, int h) {
		if (l < h) {
			int j = partition(arr, l, h);
			quicksort(arr, l, j - 1);
			quicksort(arr, j + 1, h);
		}
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static int partition(Comparable[] arr, int l, int h) {
		
		int i = l + 1;
		int j = h;
		
		while (i <= j) {
			
			while (i <= h && arr[i].compareTo(arr[l]) < 0) i++;
			while (j >= l + 1 && arr[j].compareTo(arr[l]) > 0) j--;
			
			if (i < j) {
				Comparable t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;
			}
		}
		
		Comparable t = arr[l];
		arr[l] = arr[j];
		arr[j] = t;
		
		return j;
	}


	public static void main(String[] args) {
		
		Vozilo[] v = new Vozilo[10];
		
		for (int i = 0; i < v.length; i++)
			v[i] = new Vozilo(
					"Marka",
					"Tip",
					rng.nextInt(10),
					"reg",
					rng.nextInt(10),
					rng.nextInt(10)
					);
		
		quicksort(v);
		
		for (int i = 0; i < v.length; i++)
			System.out.println(v[i]);
	}
}
