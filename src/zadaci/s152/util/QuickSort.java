package zadaci.s152.util;

public class QuickSort {

	
	public static void quicksort(Comparable[] arr, int start, int end) {
		sort(arr, start, end);
	}

	
	private static void sort(Comparable[] arr, int l, int h) {
		if (l < h) {
			int j = partition(arr, l, h);
			sort(arr, l, j - 1);
			sort(arr, j + 1, h);
		}
	}


	private static int partition(Comparable[] arr, int l, int h) {
		
		Comparable pivot = arr[l];
		
		int i = l + 1;
		int j = h;
		
		while (i <= j) {
			
			while (i <= h 	  && arr[i].compareTo(pivot) < 0) i++;
			while (j >= l + 1 && arr[j].compareTo(pivot) > 0) j--;
			
			if (i <= j) {
				Comparable tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		
		Comparable tmp = arr[l];
		arr[l] = arr[j];
		arr[j] = tmp;
		
		return j;
	}
}
