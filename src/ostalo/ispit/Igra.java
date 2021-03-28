package ostalo.ispit;

abstract class Igra {

	
	private String naziv;
	private String vrsta;
	private double brojIgraca;
	
	
	public Igra() {}
	
	
	public Igra(String naziv, String vrsta, double brojIgraca) {
		this.naziv = naziv;
		this.vrsta = vrsta;
		this.brojIgraca = brojIgraca;
	}


	public String naziv() 		{ return naziv; 		}
	public String vrsta() 		{ return vrsta; 		}
	public double brojIgraca() 	{ return brojIgraca; 	}


	public void setNaziv(String naziv) 				{ this.naziv = naziv; 			}
	public void setVrsta(String vrsta) 				{ this.vrsta = vrsta; 			}
	public void setBrojIgraca(double brojIgraca) 	{ this.brojIgraca = brojIgraca;	}
	
	
	@Override
	public String toString() {
		return String.format("%s %s %.2f", naziv(), vrsta(), brojIgraca());
	}
	
	
	public abstract void pokreni();
	public abstract void odigrajPotez();
}
