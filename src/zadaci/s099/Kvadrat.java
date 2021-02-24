package zadaci.s099;

public class Kvadrat extends Oblik {

	
	private double a;
	
	
	public Kvadrat(String boja, String tip, int brojStrana, double a) {
		super(boja, tip, brojStrana);
		this.a = a;
		setPovrsina();
	}
	
	
	@Override
	public void setPovrsina() { super.povrsina = a * a; }
	
	
	@Override
	public void setObim()	  { super.obim = 4 * a; 	}
}
