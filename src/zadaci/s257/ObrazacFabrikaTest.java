package zadaci.s257;

public class ObrazacFabrikaTest {

	public static void main(String[] args) {
		
		FabrikaVozila f = new FabrikaVozila();
		
		Vozilo v0 = f.pribaviOblik("AUTOMOBIL");
		v0.vozi();
		
		Vozilo v1 = f.pribaviOblik("KAMION");
		v1.vozi();
		
		Vozilo v2 = f.pribaviOblik("MOTOCIKL");
		v2.vozi();
	}
}
