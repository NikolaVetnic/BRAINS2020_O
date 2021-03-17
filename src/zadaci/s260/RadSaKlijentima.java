package zadaci.s260;

import zadaci.s260.osobe.Klijent;

public interface RadSaKlijentima {
	boolean dodajKlijenta(Klijent k);
	boolean izbaciKlijenta(Klijent k);
	Klijent pronadjiKlijenta(String jmbg);
}
