package zadaci.primer06_01;

public abstract class Prodavnica {

	private SpisakKlijenata spisakKlijenata;
	private String[] prodavci;
	
	public void izracunajPDV() {
		System.out.println("Stopa PDV je 20%!");
	}
	
	public abstract String[] uzmiInventar();
	
	public abstract void kupiInventar(String artikal);
}
