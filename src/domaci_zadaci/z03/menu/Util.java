package domaci_zadaci.z03.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

	
	protected static int intMenu(BufferedReader br, String title, String[] options, int max) throws IOException {
		
		int op = -1;
		
		do {
			System.out.printf("==> %s \n\n", title);
			for (int i = 0; i < options.length; i++)
				System.out.printf("[%d] %s %n", i + 1, options[i]);
			System.out.printf("%n[%d] %s %n%n", 0, "Back / End");
			
			System.out.print("Unos -> ");
			String s = br.readLine();
			System.out.println();
			
			op = Integer.parseInt(s.trim());
			
		} while (!(0 <= op && op <= max + 1));
		
		return op;
	}
	
	
	protected static String stringMenu(BufferedReader br, String title, String[] options) throws IOException {
		
		String line = "";
		
		do {
			System.out.printf("==> %s \n\n", title);
			for (int i = 0; i < options.length; i++)
				System.out.printf("[%d] %s %n", i + 1, options[i]);
			
			if (options.length > 0) System.out.println();
			
			System.out.printf("[%d] %s %n%n", 0, "Back / End");
			
			System.out.print("Unos -> ");
			line = br.readLine();
			System.out.println();
			
		} while (line.length() == 0);
		
		return line.trim();
	}
}
