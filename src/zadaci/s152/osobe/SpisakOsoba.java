package zadaci.s152.osobe;

import zadaci.s152.util.QuickSort;

public class SpisakOsoba {

	
	public static final int PODRAZUMEVAN_KAPACITET = 100; 

	
	private Osoba[] osobe;
	private int trenutniBrojOsoba;
	private int maxBrojOsoba;
	
	
	public SpisakOsoba(int maxBrojOsoba) {
		this.maxBrojOsoba = maxBrojOsoba;
		this.trenutniBrojOsoba = 0;
		this.osobe = new Osoba[maxBrojOsoba];
	}
	
	
	public SpisakOsoba() {
		this(PODRAZUMEVAN_KAPACITET);
	}
	
	
	public Osoba[] osobe() 			{ return osobe; 			}
	public Osoba osoba(int i) 		{ return osobe[i]; 			}
	public int trenutniBrojOsoba() 	{ return trenutniBrojOsoba; }
	public int maxBrojOsoba() 		{ return maxBrojOsoba; 		}
	
	
	public int nadjiOsobu(String ime, String prezime) {
		for (int i = 0; i < this.trenutniBrojOsoba; i++)
			if (this.osobe[i].ime().equals(ime) && this.osobe[i].prezime().equals(prezime))
				return i;
		
		System.out.println("Osoba nije pronadjena!");
		return -1;
	}
	
	
	public int nadjiOsobu(String jmbg) {
		for (int i = 0; i < this.trenutniBrojOsoba; i++)
			if (this.osobe[i].jmbg().equals(jmbg))
				return i;
		
		System.out.println("Osoba nije pronadjena!");
		return -1;
	}
	
	
	public void sort() {
		QuickSort.quicksort(this.osobe(), 0, this.trenutniBrojOsoba() - 1);
	}
	
	
	public boolean dodajOsobu(Osoba o) {
		
		if (this.trenutniBrojOsoba < this.maxBrojOsoba) {
			this.osobe[this.trenutniBrojOsoba++] = o;
			return true;
		} else {
			System.out.println("Nema vise mesta u spisku osoba!");
			return false;
		}
	}
	
	
	public boolean izbaciOsobu(String ime, String prezime) {
		
		return izbaciOsobu(nadjiOsobu(ime, prezime));
	}

	
	public boolean izbaciOsobu(String jmbg) {
		
		return izbaciOsobu(nadjiOsobu(jmbg));
	}
	
	
	private boolean izbaciOsobu(int idx) {
		
		if (idx == -1) return false;
		
		for (int i = idx; i < trenutniBrojOsoba - 1; i++)
			osobe[i] = osobe[i + 1];
		
		trenutniBrojOsoba--;
		
		return true;
	}
	
	
	public void stampaj(String label) {
		
		System.out.println(label + ", spisak : ");
		
		for (int i = 0; i < trenutniBrojOsoba(); i++)
			System.out.println(osoba(i));
		
		System.out.println();
	}
}
