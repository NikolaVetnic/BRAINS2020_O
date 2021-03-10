package zadaci.s228a;

import zadaci.s198.zaposleni.SpisakRadnika;

public class Main {

	public static void main(String[] args) {
		
		SpisakRadnika s = new SpisakRadnika("s198_spisak");
		s.stampaj();
		s.sacuvajPlatniSpisak("s228a_sacuvan_spisak");
	}
}
