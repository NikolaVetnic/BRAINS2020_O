package zadaci.s087;

public class Motor {

	
	private boolean radi;
	private String tip;
	private int snaga, kubikaza;
	
	
	public Motor(boolean radi, String tip, int snaga, int kubikaza) {
		this.radi = radi;
		this.tip = tip;
		this.snaga = snaga;
		this.kubikaza = kubikaza;
	}
	
	
	public Motor() {
		this(false, "", 0, 0);
	}

	
	public boolean radi() 					{ return radi; 				}
	public String tip() 					{ return tip; 				}
	public int snaga() 						{ return snaga; 			}
	public int kubikaza() 					{ return kubikaza; 			}

	
	public void setRadi(boolean radi) 		{ this.radi = radi; 		}
	public void setTip(String tip) 			{ this.tip = tip; 			}
	public void setSnaga(int snaga) 		{ this.snaga = snaga; 		}
	public void setKubikaza(int kubikaza) 	{ this.kubikaza = kubikaza; }
	
	
	public void ukljuci() {
		if (radi())
			this.setRadi(true);
	}
	
	
	public void iskljuci() {
		if (this.radi())
			setRadi(false);
	}
	
	
	public void stampajPodatke() {

		System.out.println("Informacije o motoru:");
		System.out.println("Ukljucen:" 		+ radi() 
						 + " Tip: " 		+ tip()
						 + " Snaga: " 		+ snaga() 
						 + " Kubikaza: " 	+ kubikaza());
	}
}
