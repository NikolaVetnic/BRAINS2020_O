package domaci_zadaci.z02;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
    /*****************
     * NIKOLA VETNIC *
     *****************/
	
	private static final String INPUT_FILE = "res/z02_funkcijeUlaz.txt";
	private static final String SAVE_FILE = "res/z02_funkcijeIzlaz.txt";

	
	public static void main(String[] args) {
		
		Funkcija[] funkcije = null;
		
		try {
			funkcije = Util.ucitajFunkcije(INPUT_FILE);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Util.sacuvajSaNulama(funkcije, SAVE_FILE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
