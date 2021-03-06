package ostalo.primer_valjak;

public class Valjak {

	private double r;
	private double H;
	
	Valjak() { }
	
	Valjak(double r, double H) {
		this.r = r;
		this.H = H;
	}
	
	public static void main(String[] args) {
		
		Valjak cev = new Valjak(2.0, 200.0);
	}
}
