package zadaci.s260;

import zadaci.s260.osobe.Klijent;

public interface RadSaTransakcijama{
	void izvrsiInternuTransakciju(Klijent posiljalac, Klijent primalac, float iznos);
}
