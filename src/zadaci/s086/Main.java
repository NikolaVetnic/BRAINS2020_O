package zadaci.s086;

public class Main {
	
	
	public static void prebacivanjeSredstava(Klijent k1, Klijent k2, double iznos) {
		
		if (iznos <= 0)
			throw new IllegalArgumentException("Iznos sredstava mora biti pozitivan realan broj!");
		
		k1.dodajTransakciju(-iznos, "Skidanje sredstava sa racuna");
		k2.dodajTransakciju(+iznos, "Dodavanje sredstava na racun");
	}

	
	public static void main(String[] args) {
		
		Klijent k1 = new Klijent("Tika", "Tikic", 32, "0111018800029", 5000.0);
		System.out.println(k1);
		
		Klijent k2 = new Klijent("Mika", "Mikic", 33, "0111018800030", 5500.0);
		System.out.println(k2);
		
		prebacivanjeSredstava(k1, k2, 2000.0);
		
		System.out.println(k1);
		System.out.println(k2);
	}
}
