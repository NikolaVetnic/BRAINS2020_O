package zadaci.s099;

public class Oblik {

	
	protected String boja, tip;
	protected int brojStrana;
	protected double obim, povrsina;
	
	
	public Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
		setObim();
		setPovrsina();
	}

	
	public Oblik() {
		this("", "", 0);
	}

	
	public String boja() 		{ return boja; 			}
	public String tip() 		{ return tip; 			}
	public int brojStrana() 	{ return brojStrana; 	}
	public double povrsina() 	{ return povrsina; 		}

	
	public void setBoja(String boja) 			{ this.boja = boja; 			}
	public void setTip(String tip) 				{ this.tip = tip; 				}
	public void setBrojStrana(int brojStrana) 	{ this.brojStrana = brojStrana; }
	public void setPovrsina() 					{ this.povrsina = -1.0; 		}
	public void setObim() 						{ this.obim = -1.0; 			}
	
	
	public String toString() {
		return tip + " " + boja + " " + brojStrana + " " + povrsina;
	}
}
