package zadaci.primer04_01;

import java.util.LinkedList;

public class Ucionica {

	private int br;
	private LinkedList<Racunar> racunari;
	
	public Ucionica(int br) {
		this.br = br;
		this.racunari = new LinkedList<Racunar>();
	}
	
	public void dodajRacunar(Racunar r) {
		this.racunari.addFirst(r);
	}
	
	public int br() { return br; }
}
