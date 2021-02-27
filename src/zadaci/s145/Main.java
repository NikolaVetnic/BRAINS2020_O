package zadaci.s145;

public class Main {

	public static void main(String[] args) {
		
		Kvadrat k = new Kvadrat("zuta", "kvadrat", 4, 2.0);
		System.out.println(k);
		
		Krug c = new Krug("lila", "krug", 0, 2.0);
		System.out.println(c);
		
		Oblik o = new Kvadrat("srebrni", "kvadrat", 6, 3.0);
		System.out.println(o);
		
			  o = new Krug("crni", "krug", 0, 3.0);
		System.out.println(o);
	}
}
