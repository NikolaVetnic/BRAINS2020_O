package zadaci.primer03_02;

public class Kvadrat extends Oblik {

	private double a;
	
	public Kvadrat(String boja, String tip, int brojStrana, double a) {
		super(boja, tip, brojStrana);
		this.a = a;
		setPovrsina();
	}
	
	@Override
	public void setPovrsina() { super.povrsina = a * a; }
}
