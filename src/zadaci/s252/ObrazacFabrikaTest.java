package zadaci.s252;

public class ObrazacFabrikaTest {

	public static void main(String[] args) {
		
		FabrikaOblika f = new FabrikaOblika();
		
		Figura f0 = f.pribaviOblik("PRAVOUGAONIK");
		f0.crtaj();
		
		Figura f1 = f.pribaviOblik("KVADRAT");
		f1.crtaj();
		
		Figura f2 = f.pribaviOblik("KRUG");
		f2.crtaj();
	}
}
