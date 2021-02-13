package zadaci.primer05_02;

public class Main {

	public static void main(String[] args) {
		
		Nastavnik n = new Nastavnik("Tika", "Tikic", 45, 10);
		Asistent a = new Asistent("Mika", "Mikic", 30, n, 2);
		NenastavniRadnik nr = new NenastavniRadnik("Zika", "Zikic", 56, "domar", 26);
		
		n.predstaviSe();
		System.out.println("Nastavnikova plata : " + n.racunajPlatu());
		
		a.predstaviSe();
		System.out.println("Asistentova plata : " + a.racunajPlatu());
		
		nr.predstaviSe();
		System.out.println("Radnicka plata : " + nr.racunajPlatu());
	}
}
