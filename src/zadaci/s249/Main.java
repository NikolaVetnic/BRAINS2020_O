package zadaci.s249;

public class Main {

	public static void main(String[] args) {
		
		Singleton s0 = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s0.s);
		s1.s = "Menjamo...";
		System.out.println(s0.s);
	}
}
