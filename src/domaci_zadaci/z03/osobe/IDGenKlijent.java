package domaci_zadaci.z03.osobe;

public class IDGenKlijent {

	
	private static IDGenKlijent instance = null;
	private int count; 
	
	
	protected IDGenKlijent() {
		this.count = 0;
	}
	
	
	public String generisiBroj() {
		int num = count++;
		return String.format("%013d", num);
	}
	
	
	public int counter() {
		return count;
	}
	
	
	public void setCounter(int newCount) {
		this.count = newCount;
	}
	
	
	public static IDGenKlijent getInstance() {
		if (instance == null)
			instance = new IDGenKlijent();
		
		return instance;
	}
}
