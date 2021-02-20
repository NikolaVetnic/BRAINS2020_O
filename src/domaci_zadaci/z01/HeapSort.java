package domaci_zadaci.z01;

public class HeapSort<T extends Comparable<T>> {

	
	public static <T extends Comparable<T>> void heapSort(T[] arr) {
		
		int lastIndex = arr.length - 1;
		int lastParent = (lastIndex - 1) / 2;
		
		while (lastParent >= 0) {
			makeHeap(arr, lastParent, lastIndex);
			lastParent--;
		}
		
		int end = lastIndex;
		
		while (end > 0) {
			
			T tmp = arr[end];
			arr[end] = arr[0];
			arr[0] = tmp;
			
			end--;
	
			makeHeap(arr, 0, end);
		}
	}
	

	private static <T extends Comparable<T>> void makeHeap(T[] arr, int start, int end) {
		
		boolean restored = false;
		int parentIdx = start;
		
		while (!restored) {
			
			int sonIdx = getMaxSon(arr, parentIdx, end);
			
			if (sonIdx == -1) {
				restored = true;
			} else {
				if (arr[sonIdx].compareTo(arr[parentIdx]) < 0) {
					restored = true;
				} else {
					T tmp = arr[sonIdx];
					arr[sonIdx] = arr[parentIdx];
					arr[parentIdx] = tmp;
					
					parentIdx = sonIdx;
				}
			}
		}
	}


	private static <T extends Comparable<T>> int getMaxSon(T[] arr, int parentIdx, int end) {
		
		int son1 = 2 * parentIdx + 1;
		int son2 = 2 * parentIdx + 2;
		int maxSon = -1;
		
		if (son1 <= end)
			maxSon = son1;
		
		if (son2 <= end)
			if (arr[son2].compareTo(arr[maxSon]) > 0)
				maxSon = son2;
		
		return maxSon;
	}
}
