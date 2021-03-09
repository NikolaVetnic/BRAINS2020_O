package domaci_zadaci.z02;

public class KvadratnaFunkcija implements Funkcija {

	
	private double a;
	private double b;
	private double c;
	
	
	public KvadratnaFunkcija(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	public KvadratnaFunkcija(String line) {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		ucitajParametre(line);
	}
	

	@Override
	public void ucitajParametre(String line) {
		
		String[] tokens = line.trim().split("\\s+");
		
		if (tokens.length != 3)
			throw new IllegalArgumentException("Nepravilno formatirana linija -> " + line);
		
		setA(Double.parseDouble(tokens[0].trim()));
		setB(Double.parseDouble(tokens[1].trim()));
		setC(Double.parseDouble(tokens[2].trim()));
	}
	

	@Override
	public double izracunajVrednost(double x) {
		return a() * x * x + b() * x + c();
	}

	@Override
	public boolean proveriRealneNule() {
		
		if (a() != .0) {
			
			double d = izracunajDiskriminantu();
			
			if (d > 0) {
				System.out.println("Broj realnih nula : 2  ");
				return true;
			} else if (d == 0) {
				System.out.println("Broj realnih nula : 1  ");
				return true;
			} else {
				System.out.println("Broj realnih nula : 0  (konjugovano-kompleksno resenje)");
				return false;
			}
		} else if (b != .0) {
			System.out.println("Broj realnih nula : 1  (linearna jednacina)");
			return true;
		}
		
		System.out.println("Broj realnih nula : /  (greska pri unosu)");
		return false;
	}

	private double izracunajDiskriminantu() {
		return b() * b() - 4 * a() * c();
	}


	@Override
	public Nule izracunajNule() {
		
		if (a() != .0) {
			
			double d = izracunajDiskriminantu();
			
			if (d > 0) {
				
				return RealneNule.unesiNule(new double[] { 
						(- b() - Math.sqrt(d)) / (2 * a()),
						(- b() + Math.sqrt(d)) / (2 * a())
				});
			} else if (d == 0) {
				
				return RealneNule.unesiNule(new double[] { 
						- b() / (2 * a())
				});
			} else {
				
				Vec2 v = Vec2.xy(- b / (2 * a), - Math.sqrt(- d) / (2 * a));
				
				return ImaginarneNule.unesiNule(new Vec2[] { 
						v,
						v.konjuguj()
				});
			}
		} else if (b != .0) {
			
			return RealneNule.unesiNule(new double[] { 
				- c() / b()	
			});
		}
		
		return null;
	}
	
	
	public String prikaziNule() {
		
		String out = "";
		
		if (izracunajNule() instanceof RealneNule) {
			RealneNule rn = (RealneNule) izracunajNule();
			for (double d : rn.nule()) out += String.format("%6.2f ", d);
			
			return out;
		} else {
			ImaginarneNule in = (ImaginarneNule) izracunajNule();
			for (Vec2 v : in.nule()) out += v + " ";
			
			return out + " [im]";
		}
	}


	public double a() { return a; }
	public double b() { return b; }
	public double c() { return c; }


	public void setA(double a) { this.a = a; }
	public void setB(double b) { this.b = b; }
	public void setC(double c) { this.c = c; }
	
	
	public String toString() {
		
		String out = "y = ";
		
		if (Math.abs(a()) > 1e-9)
			out += String.format("%.2f * x^2", a());
		
		if (Math.abs(b()) > 1e-9) {
			out += b() < 0 ? " - " : " + ";
			out += String.format("%.2f * x", Math.abs(b()));
		}
		
		if (Math.abs(c()) > 1e-9) {
			out += c() < 0 ? " - " : " + ";
			out += String.format("%.2f", Math.abs(c()));
		}
		
		return out;
	}
}