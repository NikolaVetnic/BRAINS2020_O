package domaci_zadaci.z03;

import zadaci.s260.osobe.Klijent;

public interface RadSaKlijentima {
	boolean dodajKlijenta(Klijent k);
	boolean izbaciKlijenta(Klijent k);
	Klijent pronadjiKlijenta(String jmbg);
}
