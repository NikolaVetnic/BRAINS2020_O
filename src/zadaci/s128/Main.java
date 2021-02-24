package zadaci.s128;

public class Main {

	public static void main(String[] args) {
		
		Nastavnik n = new Nastavnik("Tika", "Tikic", 45, 1.0, 10);
		Asistent a = new Asistent("Mika", "Mikic", 30, 1.0, n, 2);
		NenastavniRadnik nr = new NenastavniRadnik("Zika", "Zikic", 56, 1.0, "domar", 26);
		
		System.out.println(n);
		System.out.println("Nastavnikova plata : " + n.racunajPlatu());
		
		System.out.println(a);
		System.out.println("Asistentova plata : " + a.racunajPlatu());
		
		System.out.println(nr);
		System.out.println("Radnicka plata : " + nr.racunajPlatu());
	}
}
