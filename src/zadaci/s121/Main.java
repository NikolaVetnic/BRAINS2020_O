package zadaci.s121;

public class Main {

	public static void main(String[] args) {
		
		Zena z1 = new Zena("Ana", "Bakuta", 56, "Dekuta");
		Zena z2 = new Zena("Snezana", "Babic", 66, "Dedic");
		
		Osoba o1 = new Osoba("Milutin", "Mrkonjic", 65);
		Osoba o2 = new Osoba("Hamit", "Djogaj", 60);
		
		z1.predstaviSe();
		z2.predstaviSe();
		
		o1.predstaviSe();
		o2.predstaviSe();
	}
}
