package zadaci.s031;

public class Main {

	public static void main(String[] args) {
		
		Zaposleni z1 = new Zaposleni("Tika", "Tikic", 1.0);
		z1.setIme("Sava");
		
		Zaposleni z2 = new Zaposleni("Zika", "Zikic", 2.0);
		z2.setPrezime("Savic");
		
		Zaposleni z3 = new Zaposleni("Mika", "Mikic", 3.0);
		z3.setKoef(1.5);
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
	}
}
