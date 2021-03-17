package zadaci.s260.osobe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import zadaci.s260.RadSaFajlovima;

abstract class SpisakOsoba implements RadSaFajlovima {

	
	private List<Osoba> osobe;
	
	
	public SpisakOsoba() {
		this.osobe = new LinkedList<Osoba>();
	}
	
	
	public List<Osoba> osobe() 		{ return osobe; 			}
	public Osoba osoba(int i) 		{ return osobe.get(i); 		}
	public int trenutniBrojOsoba() 	{ return osobe.size(); 		}
	
	
	public boolean dodajOsobu(Osoba o) {
		
		if (nadjiOsobu(o) != -1) return false;
		
		osobe.add(o);
		return true;
	}
	
	
	public int nadjiOsobu(String ime, String prezime) {
		for (int i = 0; i < trenutniBrojOsoba(); i++)
			if (this.osobe.get(i).ime().equals(ime) && this.osobe.get(i).prezime().equals(prezime))
				return i;
		
		return -1;
	}

	
	public int nadjiOsobu(String jmbg) {
		for (int i = 0; i < trenutniBrojOsoba(); i++)
			if (this.osobe.get(i).jmbg().equals(jmbg))
				return i;
		
		return -1;
	}
	
	
	public int nadjiOsobu(Osoba o) {
		return nadjiOsobu(o.jmbg());
	}
	
	
	public boolean izbaciOsobu(String ime, String prezime) {
		
		return izbaciOsobu(nadjiOsobu(ime, prezime));
	}
	
	
	public boolean izbaciOsobu(String jmbg) {
		
		return izbaciOsobu(nadjiOsobu(jmbg));
	}
	
	
	private boolean izbaciOsobu(int idx) {
		
		if (idx == -1) return false;
		
		osobe.remove(idx);
		return true;
	}
	
	
	public void sortirajPoJMBG() {
		sort((o1, o2) -> o1.jmbg().compareTo(o2.jmbg()));
	}
	
	
	public void sortirajPoPrezimenu() {
		sort((o1, o2) -> o1.prezime().compareTo(o2.prezime()));
	}
	
	
	private void sort(Comparator<Osoba> redosled) {
		this.osobe.sort(redosled);
	}
	
	
	@Override
	public abstract void ucitajIzFajla(String input);

	
	@Override
	public void upisiUFajl(String output) {
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//" + output + ".txt")))) {
			for (Osoba o : osobe()) pw.println(o.getFileLine());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public void stampaj(String label) {
		
		System.out.println(label + ", spisak : ");
		
		for (int i = 0; i < trenutniBrojOsoba(); i++)
			System.out.println(osoba(i));
		
		System.out.println();
	}
}
