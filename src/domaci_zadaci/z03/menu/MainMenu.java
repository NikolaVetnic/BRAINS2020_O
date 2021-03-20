package domaci_zadaci.z03.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import domaci_zadaci.z03.Element;
import domaci_zadaci.z03.Restoran;
import domaci_zadaci.z03.jelovnik.Jelovnik;
import domaci_zadaci.z03.jelovnik.Stavka;
import domaci_zadaci.z03.narudzbine.Narudzbina;
import domaci_zadaci.z03.osobe.Klijent;
import domaci_zadaci.z03.osobe.SpisakKlijenata;

public class MainMenu {
	
	
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	private Restoran r;
	
	
	public MainMenu(Restoran r) {
		this.r = r;
	}
	
	
	public Restoran r() { return r; }

	
	public void prikazi() throws IOException {
		
		int choice = Util.intMenu(
				in,
				"GLAVNI MENI", 
				new String[] { "Klijenti", "Jelovnik", "Narudzbine" }, 
				3);
		
		switch (choice) {
			case 1	: op1_Base(); 	break;
			case 2	: op2_Base();	break;
			case 3	: op3_Base();	break;
			
			case 0	:
			default	: in.close();	break;
		}
	}
	
	
	// KLIJENT MENI
	
	
	private void op1_Base() throws IOException {
		
		int choice = Util.intMenu(
				in,
				"KLIJENT MENI", 
				new String[] { "Ucitaj iz fajla", "Dodaj novog klijenta", "Prikazi klijente (sortirano po ID)", 
							   "Prikazi klijente (sortirano po imenu)", "Obrisi klijenta (ID)", "Pronadji klijenta (ID)", 
							   "Pronadji klijenta (ime)"}, 
				7);
		
		switch (choice) {
			case 1	: op1_1();		break;
			case 2	: op1_2();		break;
			case 3	: op1_3();		break;
			case 4	: op1_4();		break;
			case 5	: op1_5();		break;
			case 6	: op1_6();		break;
			case 7	: op1_7();		break;
			
			case 0	:
			default	: prikazi(); 	break;
		}
	}
	
	
	private void op1_1() throws IOException {
		
		String line = Util.stringMenu(in, "KLIJENT MENI / Ucitaj iz fajla", new String[] { } );
		
		r().setKlijenti(SpisakKlijenata.izFajla(line));
		System.out.println();
		
		op1_Base();
	}
	
	
	private void op1_2() throws IOException {
		
		String line = Util.stringMenu(
				in,
				"KLIJENT MENI / Unos novog klijenta (format : 'ime prezime adresa telefon')",
				new String[] { }
				);
		
		String[] tokens = line.split(" ");
		
		r.klijenti().kreirajKlijenta(
				tokens[0].trim(), tokens[1].trim(), tokens[2].trim(), tokens[3].trim());
		System.out.println();
		
		op1_Base();
	}
	
	
	private void op1_3() throws IOException {
		r.klijenti().stampajPoID();
		System.out.println();
		
		op1_Base();
	}
	
	
	private void op1_4() throws IOException {
		r.klijenti().stampajPoPrezimenu();
		System.out.println();
		
		op1_Base();
	}
	
	
	private void op1_5() throws IOException {
		
		String line = Util.stringMenu(
				in,
				"KLIJENT MENI / Brisanje klijenta (prema IDu)",
				new String[] { }
				);
		
		if (r().klijenti().izbaci(line.trim()))
			System.out.println("Klijent uspesno obrisan! \n");
		else
			System.err.printf("Klijent sa ID-om %s ne postoji! %n", line.trim());
		
		op1_Base();
	}
	
	
	private void op1_6() throws IOException {
		
		String line = Util.stringMenu(
				in,
				"KLIJENT MENI / Pretraga klijenata (prema IDu)",
				new String[] { }
				);
		
		Klijent k = null;
		
		if ((k = (Klijent) r().klijenti().nadji(line)) != null)
			System.out.println(k + "\n");
		else
			System.out.println("Klijent nije pronadjen! \n");
		
		op1_Base();
	}
	
	
	private void op1_7() throws IOException {
		
		String line = Util.stringMenu(
				in,
				"KLIJENT MENI / Pretraga klijenata (format : 'ime prezime')",
				new String[] { }
				);
		
		String[] tokens = line.split(" ");
		
		if (tokens.length != 2) {
			System.out.println("Pogresan unos!");
			op1_Base();
		}
		
		Klijent k = null;
		
		if ((k = (Klijent) r().klijenti().nadji(tokens[0].trim(), tokens[1].trim())) != null)
			System.out.println(k + "\n");
		else
			System.out.println("Klijent nije pronadjen! \n");
		
		op1_Base();
	}
	

	// JELOVNIK MENI
	
	
	private void op2_Base() throws IOException {
		
		int choice = Util.intMenu(
				in,
				"JELOVNIK MENI", 
				new String[] { "Ucitaj iz fajla", "Dodaj stavku", "Prikazi stavke (sortirano po ID)", 
							   "Obrisi stavku (ID)", "Pronadji stavku (ID)" },
				4);
		
		switch (choice) {
			case 1	: op2_1();		break;
			case 2	: op2_2();		break;
			case 3	: op2_3();		break;
			case 4	: op2_4();		break;
			case 5  : op2_5();		break;
			case 0	:
			default	: prikazi(); 	break;
		}
	}


	private void op2_1() throws IOException {
		
		String line = Util.stringMenu(in, "JELOVNIK MENI / Ucitaj iz fajla", new String[] { } );
		
		r().setJelovnik(Jelovnik.izFajla(line));
		System.out.println();
		
		op2_Base();
	}
	
	
	private void op2_2() throws IOException {
		
		String line = Util.stringMenu(
				in,
				"JELOVNIK MENI / Unos nove stavke (format : 'naziv_naziv..._naziv tip cena')",
				new String[] { }
				);
		
		String[] tokens = line.split(" ");
		
		if (tokens.length != 3) {
			System.out.println("Pogresan unos!");
			op2_Base();
		}
		
		r.jelovnik().kreirajStavku(
				tokens[0].trim().replace('_', ' '), tokens[1].trim(), Double.parseDouble(tokens[2].trim()));
		System.out.println();
		
		op2_Base();
	}
	
	
	private void op2_3() throws IOException {
		r.jelovnik().stampajPoID();
		System.out.println();
		
		op2_Base();
	}
	
	
	private void op2_4() throws IOException {

		String line = Util.stringMenu(
				in,
				"JELOVNIK MENI / Brisanje stavke (prema IDu)",
				new String[] { }
				);
		
		if (r().jelovnik().izbaci(line.trim()))
			System.out.println("Stavka uspesno obrisana! \n");
		else
			System.err.printf("Stavka sa ID-om %s ne postoji! %n", line.trim());
		
		op2_Base();
	}
	
	
	private void op2_5() throws IOException {
		
		String line = Util.stringMenu(
				in,
				"JELOVNIK MENI / Pretraga stavki (prema IDu)",
				new String[] { }
				);
		
		Stavka s = null;
		
		if ((s = (Stavka) r().jelovnik().nadji(line)) != null)
			System.out.println(s + "\n");
		else
			System.out.println("Klijent nije pronadjen! \n");
		
		op2_Base();
	}
	
	
	// NARUDZBINE MENI
	
	
	private void op3_Base() throws IOException {
		
		int choice = Util.intMenu(
				in,
				"NARUDZBINA MENI", 
				new String[] { "Dodaj narudzbinu", "Prikazi narudzbine (sortirano po ID)", 
							   "Prikazi narudzbine (sortirano po ID, detaljno)", "Obrisi narudzbinu (ID)", 
							   "Sacuvaj u fajl" },
				5);
		
		switch (choice) {
			case 1	: op3_1();		break;
			case 2	: op3_2();		break;
			case 3	: op3_3();		break;
			case 4	: op3_4();		break;
			case 5	: op3_5();		break;
			case 0	:
			default	: prikazi(); 	break;
		}
	}


	private void op3_1() throws IOException {
		
		String line = Util.stringMenu(
				in,
				"NARUDZBINA MENI / Unos nove narudzbine (format : idKlijenta stavka_stavka..._stavka')",
				new String[] { }
				);
		
		String[] tokens = line.split(" ");
		
		if (tokens.length != 2 || r.klijenti().nadji(tokens[0].trim()) == null) {
			System.out.println("Pogresan unos!");
			op3_Base();
		}
		
		String[] items = tokens[1].split("_");
		List<String> l = new ArrayList<String>();
		
		for (String s : items)
			if (r.jelovnik().nadji(s.trim()) == null) {
				System.out.println("Pogresan unos!");
				op3_Base();
			} else {
				l.add(s.trim());
			}
		
		r.narudzbine().kreirajNarudzbinu(tokens[0].trim(), l);
		System.out.println("Narudzbina uspesno kreirana! \n");
		
		op3_Base();
	}
	
	
	private void op3_2() throws IOException {
		r.narudzbine().stampajPoID();
		System.out.println();
		
		op3_Base();
	}
	
	
	private void op3_3() throws IOException {
		
		List<Element> l = r.narudzbine().lista();
		
		for (Element e : l) {
			Narudzbina n = (Narudzbina) e;
			
			System.out.println(e);
			
			System.out.printf("Posiljalac : %s %n", r.klijenti().nadji(n.idKlijenta()));
			
			for (String id : n.idStavki())
				System.out.println("\t" + r.jelovnik().nadji(id));
			
			System.out.println();
		}
		
		System.out.println();
		
		op3_Base();
	}
	
	
	private void op3_4() throws IOException {

		String line = Util.stringMenu(
				in,
				"NARUDZBINE MENI / Brisanje stavke (prema IDu)",
				new String[] { }
				);
		
		if (r().narudzbine().izbaci(line.trim()))
			System.out.println("Stavka uspesno obrisana! \n");
		else
			System.err.printf("Stavka sa ID-om %s ne postoji! %n", line.trim());
		
		op3_Base();
	}
	
	
	private void op3_5() throws IOException {

		String line = Util.stringMenu(
				in,
				"NARUDZBINE MENI / Cuvanje narudzbina u fajl",
				new String[] { }
				);
		
		r.narudzbine().upisiUFajl(line.trim());
		
		System.out.println("Narudzbine uspesno sacuvane! \n");
		
		op3_Base();
	}
}
