package zadaci.primer03_02;

public class Krug extends Oblik {

	private double r;
	
	public Krug(String boja, String tip, int brojStrana, double r) {
		super(boja, tip, brojStrana);
		this.r = r;
		setPovrsina();
	}
	
	@Override
	public void setPovrsina() { super.povrsina = r * r * Math.PI; }
}
