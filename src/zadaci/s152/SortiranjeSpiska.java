package zadaci.s152;

public class SortiranjeSpiska {

	
	public static void quicksort(SpisakOsoba s) {
		quicksort(s, 0, s.trenutniBrojOsoba() - 1);
	}

	
	private static void quicksort(SpisakOsoba s, int l, int h) {
		if (l < h) {
			int j = partition(s.osobe(), l, h);
			quicksort(s, l, j - 1);
			quicksort(s, j + 1, h);
		}
	}


	private static int partition(Osoba[] osobe, int l, int h) {
		
		
		Osoba pivot = osobe[l];
		
		int i = l + 1;
		int j = h;
		
		while (i <= j) {
			
			while (i <= h && osobe[i].compareTo(pivot) < 0) i++;
			while (j >= l + 1 && osobe[j].compareTo(pivot) > 0) j--;
			
			if (i <= j) {
				Osoba tmp = osobe[i];
				osobe[i] = osobe[j];
				osobe[j] = tmp;
				i++;
				j--;
			}
		}
		
		Osoba tmp = osobe[l];
		osobe[l] = osobe[j];
		osobe[j] = tmp;
		
		return j;
	}
}
