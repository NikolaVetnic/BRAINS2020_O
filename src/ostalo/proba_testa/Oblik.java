package ostalo.proba_testa;

abstract class Oblik {

	
	private String boja;
	private String tip;
	private int brojStrana;
	
	
	public Oblik() {}
	
	
	public Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
	}


	public String boja() 	{ return boja; 			}
	public String tip() 	{ return tip; 			}
	public int brojStrana() { return brojStrana; 	}


	public void setBoja(String boja) 			{ this.boja = boja; 			}
	public void setTip(String tip) 				{ this.tip = tip; 				}
	public void setBrojStrana(int brojStrana) 	{ this.brojStrana = brojStrana; }
	
	
	public abstract double circumference();
	public abstract double area();
	
	
	public String toString() {
		return String.format("%10s %10s %d", boja(), tip(), brojStrana());
	}
}
