package ostalo.ispit;

public class Energent {

	String kompanija;
	double kolicina;
	boolean obnovljiv;
	public Energent(String kompanija, double kolicina, boolean obnovljiv) {
		this.kompanija = kompanija;
		this.kolicina = kolicina;
		this.obnovljiv = obnovljiv;
	}
	@Override
	public String toString() {
		return "Energent [kompanija=" + kompanija + ", kolicina=" + kolicina + ", obnovljiv=" + obnovljiv + "]";
	}
	
	
}
