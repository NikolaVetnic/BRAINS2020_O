package zadaci.primer02_01;

public class Zaposleni {

	private String ime, prezime;
	private double koefRadnogMesta, plata;
	
	public Zaposleni(String ime, String prezime, double koefRadnogMesta) {
		this.ime = ime;
		this.prezime = prezime;
		this.koefRadnogMesta = koefRadnogMesta;
		setPlata(30);
	}
	
	public Zaposleni() {
		this("", "", 0.0);
	}
	
	public void setIme(String ime) 			{ this.ime = ime; 			}
	public void setPrezime(String prezime) 	{ this.prezime = prezime; 	}
	public void setKoef(double k) 			{ this.koefRadnogMesta = k; }
	
	public void setPlata(int brDana)		{ 
		this.plata = koefRadnogMesta * brDana * 100; 
	}
	
	public String toString() {
		return ime + " " + prezime + " (plata : " + plata + ")";
	}
}
