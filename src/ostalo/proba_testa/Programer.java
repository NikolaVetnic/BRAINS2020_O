package ostalo.proba_testa;

import java.util.Iterator;

public class Programer extends Osoba implements Iterator {
	
	
	private String iskustvo;
	private double plata;
	
	
	public Programer(String ime, String prezime, int starost, String iskustvo, double plata) {
		super(ime, prezime, starost);
		this.iskustvo = iskustvo;
		this.plata = plata;
	}
	
	
	
	

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}


	public String iskustvo() 	{ return iskustvo; 	}
	public double plata() 		{ return plata; 	}


	public void setIskustvo(String iskustvo) 	{ this.iskustvo = iskustvo; }
	public void setPlata(double plata) 			{ this.plata = plata; 		}

	
	public String toString() {
		return super.toString() + String.format(" %s %.2f", iskustvo(), plata());
	}
}
