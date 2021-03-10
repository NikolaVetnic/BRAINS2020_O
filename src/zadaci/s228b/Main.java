package zadaci.s228b;

public class Main {

	public static void main(String[] args) {
		
		Institucija pmf = new Institucija("PMF", "Trg Dositeja Obradovica 3", "171666", new Osoba("Milica", "Pavkov Hrvojevic", 42));
		
		pmf.dodajUcionicu("A1", "amfiteatar", 150, 100.0, false);
		pmf.dodajUcionicu("A7", "amfiteatar", 75, 75.0, false);
		pmf.dodajUcionicu("RC2", "kabinet", 30, 45.0, true);
		pmf.dodajUcionicu("RC3", "kabinet", 35, 50.0, true);
		
		try {
			pmf.dodajRacunarUUcionicu("A1", "CPU0", 3.0, 16);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		pmf.dodajRacunarUUcionicu("RC3", "CPU0", 3.0, 16);
		pmf.dodajRacunarUUcionicu("RC3", "CPU1", 4.0, 32);
		
		pmf.dodajZaposlenog("Milos", "Savic", 36, 4.0);
		pmf.dodajZaposlenog("Zoran", "Budimac", 62, 6.0);
		
		pmf.prikazi();
	}
}
