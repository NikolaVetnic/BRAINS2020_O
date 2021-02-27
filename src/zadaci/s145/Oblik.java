package zadaci.s145;

public abstract class Oblik {

	
	protected String boja, tip;
	protected double obim, povrsina;
	
	
	public Oblik(String boja, String tip) {
		this.boja = boja;
		this.tip = tip;
		this.obim = -1.0;
		this.povrsina = -1.0;
	}

	
	public Oblik() {
		this("", "");
	}

	
	public String boja() 		{ return boja; 			}
	public String tip() 		{ return tip; 			}
	public double povrsina() 	{ return povrsina; 		}

	
	public void setBoja(String boja) 			{ this.boja = boja; 			}
	public void setTip(String tip) 				{ this.tip = tip; 				}
	
	
	public String toString() {
//		return tip + "\t" + boja + "\t" + povrsina;
		return String.format("%8s %8s %8.2f", tip, boja, povrsina);
	}
}
