package zadaci.s182;

public class Main {

	
	static public double[] koren(double a, double b, double c) {
		
		assert a != 0.0 : "Vodeci koeficijent kvadratne jednacine ne sme biti nula!";
		double d = b * b - 4 * a * c;
		assert d >= 0.0 : "Diskriminanta kvadrante jednacine ne sme biti negativna!";
		
		return new double[] { (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a) };
	}
	
	
	public static void main(String[] args) {
		
//		double[] r0 = koren(1, 2, 3);
//		System.out.println(r0[0] + " & " + r0[1]);
		
		double[] r1 = koren(1, 2, 1);		
		System.out.println(r1[0] + " & " + r1[1]);
	}
}
