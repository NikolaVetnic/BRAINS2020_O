package zadaci.s257;

public class FabrikaVozila {

	public Vozilo pribaviOblik(String tipVozila) {
		
		if (tipVozila == null)
			return null;
		
		if (tipVozila.equalsIgnoreCase("AUTOMOBIL"))
			return new Automobil();
		else if (tipVozila.equalsIgnoreCase("KAMION"))
			return new Kamion();
		else if (tipVozila.equalsIgnoreCase("MOTOCIKL"))
			return new Motocikl();
		
		return null;
	}
}
