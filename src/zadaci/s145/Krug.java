package zadaci.s145;

public class Krug extends Oblik implements Figura {

	
	private double r;
	
	
	public Krug(String boja, String tip, int brojStrana, double r) {
		super(boja, tip);
		this.r = r;
		setPovrsina();
	}
	
	
	@Override
	public void setPovrsina() { super.povrsina = r * r * Math.PI; }
	
	
	@Override
	public void setObim()	  { super.obim = 2 * r * Math.PI;	  }
}
