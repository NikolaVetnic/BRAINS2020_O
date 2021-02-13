package zadaci.primer01_03;

public class Zaposleni {

	private String ime, prezime;
	private double koefRadnogMesta;
	
	public Zaposleni(String ime, String prezime, double koefRadnogMesta) {
		this.ime = ime;
		this.prezime = prezime;
		this.koefRadnogMesta = koefRadnogMesta;
	}
	
	public void setIme(String ime) 			{ this.ime = ime; 			}
	public void setPrezime(String prezime) 	{ this.prezime = prezime; 	}
	public void setKoef(double k) 			{ this.koefRadnogMesta = k; }
	
	public double plata() { return koefRadnogMesta * 2500; }
	
	public String toString() {
		return ime + " " + prezime + " (plata : " + plata() + ")";
	}
}
