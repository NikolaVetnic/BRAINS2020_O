package zadaci.s260.racuni;

public class NumeratorRacuna {

	private static NumeratorRacuna instance = null;
	private int count; 
	
	protected NumeratorRacuna() {
		this.count = 0;
	}
	
	public String generisiBroj() {
		int num = count++;
		String snum = String.format("%013d", num);
		return snum.substring(0, 3) + "-" + snum.substring(3, 9) + "-" + snum.substring(9);
	}
	
	public void setCounter(int newCount) {
		this.count = newCount;
	}
	
	public static NumeratorRacuna getInstance() {
		if (instance == null)
			instance = new NumeratorRacuna();
		
		return instance;
	}
}
