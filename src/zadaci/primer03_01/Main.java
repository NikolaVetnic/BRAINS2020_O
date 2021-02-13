package zadaci.primer03_01;

public class Main {

	public static void main(String[] args) {
		
		Klijent k1 = new Klijent("Tika", "Tikic", 32);
		k1.dodajLovu(10000);
		
		Klijent k2 = new Klijent("Zika", "Zikic", 34);
		k2.dodajLovu(15000);
		
		k1.prebaciNaRacun(k2, 2500);
		
		System.out.println(k1);
		System.out.println(k2);
		
		System.out.println("VLASNISTVA");
		
		Automobil a = new Automobil();
		a.setVlasnik(k1);
		System.out.println("Vlasnik automobila : " + a.vlasnik);
		
		Motocikl m = new Motocikl();
		m.setVlasnik(k2);
		System.out.println("Vlasnik motocikla : " + m.vlasnik);
		
		m.setVlasnik(k1);
		System.out.println("Vlasnik motocikla : " + m.vlasnik);
		
		System.out.println("Automobil : " + a);
		System.out.println("Motocikl  : " + m);
	}
}
