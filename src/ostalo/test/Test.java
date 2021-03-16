package ostalo.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//text.txt")))) {
			pw.println("TEST");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//text.txt")))) {
			pw.println("TEST2");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
