package zadaci.s109;

public class Racunar implements Comparable<Racunar> {

	private String procesor;
	private double radniTakt;
	private int kapacitetMemorije;
	
	private double indeksPerformansi;
	
	public Racunar(String procesor, double radniTakt, int kapacitetMemorije) {
		this.procesor = procesor;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
		setIndeksPerformansi();
	}
	
	public Racunar() {
		this("", 0.0, 0);
	}
	
	public void setProcesor(String procesor) 	{ this.procesor = procesor; }
	public void setIndeksPerformansi() 			{ this.indeksPerformansi = 10 * radniTakt + kapacitetMemorije; }
	
	public void setRadniTakt(double rt) { 
		this.radniTakt = rt;
		setIndeksPerformansi();
	}
	
	public void setKapacitetMemorije(int km) { 
		this.kapacitetMemorije = km;
		setIndeksPerformansi();
	}
	
	public String toString() {
		return "[ CPU " + procesor + " ; takt " + radniTakt + " ; RAM " 
				+ kapacitetMemorije + " ; indeks performansi " + indeksPerformansi + " ]";
	}

	@Override
	public int compareTo(Racunar o) {
		double d = indeksPerformansi - o.indeksPerformansi;
		if 		(d > 0) return  1;
		else if (d < 0) return -1;
		else 			return  0;
	}
}
