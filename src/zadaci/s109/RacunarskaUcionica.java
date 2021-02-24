package zadaci.s109;

public class RacunarskaUcionica extends Ucionica {

	
	private static final int MAX = 20;
	
	
	private Racunar[] racunari;
	private int brR;
	
	
	public RacunarskaUcionica(String oznaka, String tip, int brMesta, double povrsina) {
		super(oznaka, tip, brMesta, povrsina);
		this.racunari = new Racunar[MAX];
		this.brR = 0;
	}
	
	
	public RacunarskaUcionica() {
		this("", "", 0, 0.0);
	}
	
	
	public boolean dodajRacunar(Racunar r) {
		if (brR == MAX)
			return false;
		
		racunari[brR++] = r;
		return true;
	}

	
	public Racunar[] racunari() 	{ return racunari; 		}
	public Racunar racunar(int i) 	{ return racunari[i]; 	}
	
	
	public String toString() {
		String out = super.toString();
		
		return out + " \t " + brR + " racunar(a)";
	}
}