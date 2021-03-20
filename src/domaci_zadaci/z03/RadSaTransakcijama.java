package domaci_zadaci.z03;

import zadaci.s260.osobe.Klijent;

public interface RadSaTransakcijama{
	void izvrsiInternuTransakciju(Klijent posiljalac, Klijent primalac, float iznos);
}
