package zadaci.s087;

public class Main {

	public static void main(String[] args) {
		
		Klijent k1 = new Klijent("Tika", "Tikic", 32);
		k1.dodajLovu(10000);
		
		Klijent k2 = new Klijent("Zika", "Zikic", 34);
		k2.dodajLovu(15000);
		
		k1.prebaciNaRacun(k2, 2500);
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println();
		
		System.out.println("VLASNISTVA");
		
		Automobil a = new Automobil("Marka", "Tip", "Registracija", 2000, 5);
		a.setVlasnik(k1);
		System.out.println("Vlasnik automobila : " + a.vlasnik);
		
		Motocikl m = new Motocikl("Marka", "Tip", "Registracija", 2000, true);
		m.setVlasnik(k2);
		System.out.println("Vlasnik motocikla : " + m.vlasnik);
		
		Kamion k = new Kamion("Marka", "Tip", "Registracija", 2000, 4);
		k.setVlasnik(k1);
		System.out.println("Vlasnik kamiona : " + k.vlasnik);
		System.out.println();
		
		m.setVlasnik(k1);
		System.out.println("Nakon prenosa vlasnistva vlasnik motocikla je : " + m.vlasnik);
		System.out.println();
		
		System.out.println("Automobil : " + a);
		System.out.println("Motocikl  : " + m);
	}
}
