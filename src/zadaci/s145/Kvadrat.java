package zadaci.s145;

public class Kvadrat extends Oblik implements Figura, Poligon {

	
	private double a;
	private int brojStrana;
	
	
	public Kvadrat(String boja, String tip, int brojStrana, double a) {
		super(boja, tip);
		this.a = a;
		this.brojStrana = brojStrana;
		setPovrsina();
	}
	

	public int brojStrana()						{ return brojStrana; 			}
	public void setBrojStrana(int brojStrana) 	{ this.brojStrana = brojStrana; }
	
	
	@Override
	public void setPovrsina() 					{ super.povrsina = a * a; 		}
	
	
	@Override
	public void setObim()	  					{ super.obim = 4 * a; 			}
	
	
	@Override
	public String toString() {
		return super.toString() + "\t(strana : " + brojStrana() + ")";
	}
}
