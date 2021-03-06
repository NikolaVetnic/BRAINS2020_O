package zadaci.s043;

public class Main {

	public static void main(String[] args) {
		
		Zaposleni z1 = new Zaposleni("Tika", "Tikic", 1.0);
		z1.setIme("Sava");
		z1.setPlata(20);
		
		Zaposleni z2 = new Zaposleni("Zika", "Zikic", 2.0);
		z2.setPrezime("Savic");
		z2.setPlata(15);
		
		Zaposleni z3 = new Zaposleni("Mika", "Mikic", 3.0);
		z3.setKoef(1.5);
		z3.setPlata(10);
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
	}
}
