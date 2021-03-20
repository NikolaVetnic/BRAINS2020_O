package domaci_zadaci.z03.jelovnik;

public class IDGenJelovnik {

	
	private static IDGenJelovnik instance = null;
	private int count; 
	
	
	protected IDGenJelovnik() {
		this.count = 0;
	}
	
	
	public String generisiBroj() {
		int num = count++;
		return String.format("%04d", num);
	}
	
	
	public int counter() {
		return count;
	}
	
	
	public void setCounter(int newCount) {
		this.count = newCount;
	}
	
	
	public static IDGenJelovnik getInstance() {
		if (instance == null)
			instance = new IDGenJelovnik();
		
		return instance;
	}
}
