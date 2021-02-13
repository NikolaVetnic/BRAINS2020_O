package zadaci.primer04_01;

public class Institucija {
	
	private static final int MAX = 20;

	private String naziv;
	
	private Ucionica[] ucionice;
	private Zaposleni[] zaposleni;
	
	private int brU, brZ;
	
	public Institucija(String naziv) {
		this.naziv = naziv;
		
		this.ucionice = new Ucionica[MAX];
		this.brU = 0;
		
		this.zaposleni = new Zaposleni[MAX];
		this.brZ = 0;
	}
	
	public boolean dodajUcionicu(int br) {
		
		if (brU == MAX)
			return false;
		
		ucionice[brU++] = new Ucionica(br);
		return true;
	}
	
	public boolean dodajZaposlenog(String ime, String prezime, int starost) {
		
		if (brZ == MAX)
			return false;
		
		zaposleni[brZ++] = new Zaposleni(ime, prezime, starost);
		return true;
	}
	
	private Ucionica nadjiUcionicu(int br) {
		for (int i = 0; i < brU; i++)
			if (ucionice[i].br() == br)
				return ucionice[i];
		
		return null;
	}
	
	public boolean dodajRacunarUUcionicu(int br, String procesor, double radniTakt, int kapacitetMemorije) {
		
		Ucionica u = nadjiUcionicu(br);
		if (u == null) return false;
		
		u.dodajRacunar(new Racunar(procesor, radniTakt, kapacitetMemorije));
		return false;
	}
}
