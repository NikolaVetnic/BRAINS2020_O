package domaci_zadaci.z02;

public class ImaginarneNule implements Nule {

	
	private Vec2[] nule;
	
	
	private ImaginarneNule(Vec2[] nule) {
		this.nule = nule;
	}
	
	
	public static ImaginarneNule unesiNule(Vec2[] nule) {
		return new ImaginarneNule(nule);
	}
	
	
	public Vec2[] nule()	{ return nule; }
	
	
	public String toString() {
		
		String[] im = prikaziIm();
		
		String out = "{ ";
		for (String s : im) out += s + " , ";
		
		return out + "}";
	}


	private String[] prikaziIm() {
		
		String[] out = new String[nule.length];
		
		for (int i = 0; i < nule.length; i++) {
		
			out[i] = "";
	
			double x = nule[i].x();
			double y = nule[i].y();
			
			if (Math.abs(x) < 1e-9) {
				
				out[i] = out[i] + String.format("%.2f * i", y);
			} else {
				
				out[i] = out[i] + String.format("%.2f", x);
				
				if (Math.abs(y) > 1e-9)
					out[i] = out[i] + (y < 0 ? " - " : " + ") + String.format("%.2f * i", Math.abs(y));
			}
			
			System.out.println(out[i]);
		}
		
		return out;
	}
}
