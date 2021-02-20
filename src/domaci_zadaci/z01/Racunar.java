package domaci_zadaci.z01;

public class Racunar implements Comparable<Racunar> {

	
	private String oznakaProcesora;
	private double radniTakt;
	private int kapacitetMemorije;
	
	
	public Racunar(String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
	}
	
	
	public Racunar() {
		this("", 0.0, 0);
	}


	public String oznakaProcesora() { return oznakaProcesora; 	}
	public double radniTakt() 		{ return radniTakt; 		}
	public int kapacitetMemorije() 	{ return kapacitetMemorije; }


	public void setOznakaProcesora(String op) 	{ this.oznakaProcesora = op; 	}
	public void setRadniTakt(double rt) 		{ this.radniTakt = rt;			}
	public void setKapacitetMemorije(int km) 	{ this.kapacitetMemorije = km; 	}
	
	
	public double indeksPerformansi() { 
		return Math.round(10000 * radniTakt + kapacitetMemorije) / 100;
	}
	
	
	public String toString() {
		return String.format("[ %-10s %2.1fGhz (%2dGb RAM) : idx %6.1f ]", 
				oznakaProcesora(), radniTakt(), kapacitetMemorije(), indeksPerformansi());
	}


	@Override
	public int compareTo(Racunar o) {
		double d = this.indeksPerformansi() - o.indeksPerformansi();
		if 		(d > 0) return  1;
		else if (d < 0)	return -1;
		else			return  0;
	}
}
