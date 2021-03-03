package zadaci.s152;

import zadaci.s152.prodavnice.Knjizara;
import zadaci.s152.prodavnice.Picerija;
import zadaci.s152.prodavnice.Poslasticarnica;
import zadaci.s152.prodavnice.Prodavnica;
import zadaci.s152.prodavnice.Restoran;

public class Main {
	
	
	static Prodavnica[] p = {
			new Poslasticarnica	("Carigrad", 		"Preko puta izvrsnog veca"	),
			new Picerija		("Ciao", 			"Kod Socijalnog"			),
			new Knjizara		("Zal za mladost", 	"Ka Futogu"					),
			new Restoran		("Bulevar Books", 	"Kod Brauhausa"				),
	};
	

	public static void main(String[] args) {
		
		Prodavnica curr = p[1];
		curr.ucitajKlijente("s152_spisakKlijenata");
		curr.ucitajZaposlene("s152_spisakZaposlenih");
		
		System.out.println(curr.toString().toUpperCase() + "\n");
		curr.stampajKlijente();
		curr.stampajZaposlene();
	}
}
