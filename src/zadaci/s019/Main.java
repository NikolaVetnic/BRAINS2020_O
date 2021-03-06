package zadaci.s019;

public class Main {

	public static void main(String[] args) {
		
		Poruka p1 = new Poruka("Hello!");
		System.out.println(p1);
		
		p1.setTekst("Hello world!");
		System.out.println(p1.tekst());
		
		Poruka p2 = new Poruka("Jos poruka...");
		Poruka p3 = new Poruka("Jos vise poruka...");
		
		System.out.println(p2);
		System.out.println(p3);
	}
}
