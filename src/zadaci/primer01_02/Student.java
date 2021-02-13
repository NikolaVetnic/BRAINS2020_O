package zadaci.primer01_02;

public class Student {

	private String ime, prezime;
	private int pt1, pt2;
	private double avgPt;
	
	public Student(String ime, String prezime, int pt1, int pt2) {
		this.ime = ime;
		this.prezime = prezime;
		this.pt1 = pt1;
		this.pt2 = pt2;
		updateAvg();
	}
	
	public Student(String ime, String prezime) {
		this(ime, prezime, 0, 0);
	}
	
	private void updateAvg() {
		this.avgPt = 1.0 * (pt1 + pt2) / 2;
	}
	
	public void setIme(String ime) 			{ this.ime = ime; 			}
	public void setPrezime(String prezime) 	{ this.prezime = prezime; 	}
	
	public void setPt1(int pt1) { 
		this.pt1 = pt1;
		updateAvg();
	}
	
	public void setPt2(int pt2) { 
		this.pt2 = pt2;
		updateAvg();
	}
	
	public String ime() 	{ return this.ime;		}
	public String prezime() { return this.prezime; 	}
	public int pt1() 		{ return this.pt1; 		}
	public int pt2() 		{ return this.pt2; 		}
	public double avg() 	{ return this.avgPt; 	}
	
	public String toString() {
		return "[ " + ime + " " + prezime + " (prvi test : " + pt1 + ", drugi test : " + pt2 + ") ]";
	}
}
