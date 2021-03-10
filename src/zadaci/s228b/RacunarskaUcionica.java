package zadaci.s228b;

import java.util.ArrayList;
import java.util.List;

public class RacunarskaUcionica extends Ucionica {

	
	private List<Racunar> racunari;
	private int brR;
	
	
	public RacunarskaUcionica(String oznaka, String tip, int brMesta, double povrsina) {
		super(oznaka, tip, brMesta, povrsina);
		this.racunari = new ArrayList<Racunar>();
		this.brR = 0;
	}
	
	
	public RacunarskaUcionica() {
		this("", "", 0, 0.0);
	}
	
	
	public void dodajRacunar(Racunar r) {
		racunari.add(r);
	}

	
	public List<Racunar> racunari() { return racunari; 			}
	public Racunar racunar(int i) 	{ return racunari.get(i); 	}
	
	
	public String toString() {
		String out = super.toString();
		
		return out + " \t " + brR + " racunar(a)";
	}
}