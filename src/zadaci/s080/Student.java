package zadaci.s080;

public class Student extends Osoba {

	private int pt1, pt2;
	private double avgPt;
	
	public Student(String ime, String prezime, int starost, int pt1, int pt2) {
		super(ime, prezime, starost);
		this.pt1 = pt1;
		this.pt2 = pt2;
		updateAvg();
	}
	
	private void updateAvg() {
		this.avgPt = 1.0 * (pt1 + pt2) / 2;
	}
	
	public void setPt1(int pt1) { 
		this.pt1 = pt1;
		updateAvg();
	}
	
	public void setPt2(int pt2) { 
		this.pt2 = pt2;
		updateAvg();
	}
	
	@Override
	public void predstaviSe() {
		System.out.println("Ime: " + this.ime
							+ " Prezime: " + this.prezime
							+ " Starost: " + this.starost
							+ " godina - Test 1 : " + pt1 + ", Test 2 : " + pt2 + ", Prosek : " + avgPt);
	}
}
