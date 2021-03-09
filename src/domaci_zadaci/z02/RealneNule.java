package domaci_zadaci.z02;

public class RealneNule implements Nule {

	
	private double[] nule;
	
	
	private RealneNule(double[] nule) {
		this.nule = nule;
	}
	
	
	public static RealneNule unesiNule(double[] nule) {
		return new RealneNule(nule);
	}
	
	
	public double[] nule()	{ return nule; }
	
	
	public String toString() {
		
		String out = "";
		
		for (double nula : nule) out += String.format("%6.2f ", nula);
		
		return out;
	}
}
