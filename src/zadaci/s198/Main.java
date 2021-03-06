package zadaci.s198;

import zadaci.s198.zaposleni.SpisakRadnika;

public class Main {

	public static void main(String[] args) {
		
		SpisakRadnika s = new SpisakRadnika("s198_spisak");
		s.stampaj();
		s.sacuvajPlatniSpisak("s198_sacuvan_spisak");
	}
}
