package zadaci.s249;

public class Singleton {

	private static Singleton instance = null;
	public String s; 
	
	protected Singleton() {
		this.s = "Pozdrav od stringa koji je deo Singleton klase!";
	}
	
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		
		return instance;
	}
}
