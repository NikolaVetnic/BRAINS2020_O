package domaci_zadaci.z02;

public class LinearnaFunkcija implements Funkcija {

	
	private double a;
	private double b;
	
	
	public LinearnaFunkcija(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	public LinearnaFunkcija(String line) {
		this.a = 0;
		this.b = 0;
		ucitajParametre(line);
	}
	

	@Override
	public void ucitajParametre(String line) {
		
		String[] tokens = line.trim().split("\\s+");
		
		if (tokens.length != 2)
			throw new IllegalArgumentException("Nepravilno formatirana linija -> " + line);
		
		setA(Double.parseDouble(tokens[0].trim()));
		setB(Double.parseDouble(tokens[1].trim()));
	}
	

	@Override
	public double izracunajVrednost(double x) {
		return a() * x + b();
	}

	@Override
	public boolean proveriRealneNule() {
		
		/*
		 * a == 0 && b == 0 -> code ==  0
		 * a == 0 && b != 0 -> code ==  1
		 * a != 0 && b == 0 -> code == 10
		 * a != 0 && b != 0 -> code == 11
		 */
		
		switch (getCode()) {
			case  0: System.out.println("Broj realnih nula : + ∞");	return true ;
			case  1: System.out.println("Broj realnih nula : 0  "); return false;
			case 10: 
			case 11: System.out.println("Broj realnih nula : 1  "); return true ;
			default: 												return false;
		}
	}

	@Override
	public RealneNule izracunajNule() {
		
		switch (getCode()) {
			case  0: return RealneNule.unesiNule(new double[] { Double.POSITIVE_INFINITY });
			case  1: return RealneNule.unesiNule(new double[] { 						 });
			case 10: 
			case 11: return RealneNule.unesiNule(new double[] { -b() / a() 				 });
			default: return null;
		}
	}


	private int getCode() {
		return (int) (Math.abs(a()) < 1e-9 ? 0 : 1) * 10 + (int) (Math.abs(b()) < 1e-9 ? 0 : 1);
	}
	
	
	public String prikaziNule() {
		if (izracunajNule().nule().length == 0) return "/";
		else return String.format("%6.2f", izracunajNule().nule()[0]);
	}


	public double a() { return a; }
	public double b() { return b; }


	public void setA(double a) { this.a = a; }
	public void setB(double b) { this.b = b; }
	
	
	public String toString() {
		
		String out = "y = ";
		
		if (Math.abs(a()) < 1e-9)
			return out + String.format("%.2f", b());
		
		out = out + String.format("%.2f * x", a());
		
		if (Math.abs(b()) < 1e-9) {
			return out;
		}
		
		return out + (b() < 0 ? " - " : " + ") + String.format("%.2f", Math.abs(b()));
	}
}
