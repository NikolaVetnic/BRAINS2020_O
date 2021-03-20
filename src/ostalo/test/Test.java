package ostalo.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static List<Integer> split(int num, int chunkSize) {
		
		int shift = (int) Math.pow(2, chunkSize) - 1;
		
		List<Integer> chunks = new ArrayList<Integer>();
		
		int chunkCount = 0;
		int numLength  = Integer.toBinaryString(num).length();
		
		while (chunkCount * chunkSize <= numLength)
			chunks.add((num >> chunkCount++ * chunkSize) & shift);
			
		return chunks;
	}
	
	
	public static int assemble(List<Integer> chunks, int chunkSize) {
		
		int num = 0;
		
		for (int i = 0; i < chunks.size(); i++)
			num = num + (chunks.get(i) << (i * chunkSize));
		
		return num;
	}
	

	public static void main(String[] args) {
		
		
		int num = 333;
		
		System.out.println(Integer.toBinaryString(num));
		
		for (Integer i : split(num, 4)) System.out.println(Integer.toBinaryString(i));
		
		System.out.println(Integer.toBinaryString(assemble(split(num, 4), 4)));
	}
}
