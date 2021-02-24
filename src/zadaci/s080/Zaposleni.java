package zadaci.s080;

public class Zaposleni extends Osoba {
	
	private static final int DEFAULT_BROJ_DANA = 20;
	
	private double koefRadnogMesta;
	private double plata;

	public Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta) {
		super(ime, prezime, starost);
		this.koefRadnogMesta = koefRadnogMesta;
		setPlata(DEFAULT_BROJ_DANA);
	}
	
	public String ime() 			{ return super.ime; 			}
	public String prezime() 		{ return super.prezime; 		}
	public int starost() 			{ return super.starost; 		}
	public double koefRadnogMesta() { return this.koefRadnogMesta; 	}
	public double plata() 			{ return this.plata; 			} 
	
	public void setPlata(int brojDana) {
		this.plata = koefRadnogMesta() * brojDana;
	}
	
	public void stampajPlatu() {
		System.out.println(ime() + " " + prezime() + ", na radnom mestu sa koeficijentom " 
								 + koefRadnogMesta() + " ima platu " + plata());
	}
}
