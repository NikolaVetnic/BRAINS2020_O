package ostalo.ispit;

import java.util.ArrayList;

public class EnergetskaBerza extends Berza implements RadSaTransakcijama {

	
	private ArrayList<Trgovac> listaTrgovaca;
	private ArrayList<Kompanija> listaEnergenata;
	private ArrayList<Transakcija> listaTransakcija;
	
	
	public EnergetskaBerza(String naziv, String grad, String nazivIndeksa, double vrednostIndeksa) {
		super(naziv, grad, nazivIndeksa, vrednostIndeksa);
		
		this.listaTrgovaca = new ArrayList<Trgovac>();
		this.listaEnergenata = new ArrayList<Kompanija>();
		this.listaTransakcija = new ArrayList<Transakcija>();
	}


	public ArrayList<Trgovac> listaTrgovaca() 			{ return listaTrgovaca;		}
	public ArrayList<Kompanija> listaEnergenata() 		{ return listaEnergenata;	}
	public ArrayList<Transakcija> listaTransakcija() 	{ return listaTransakcija;	}


	public void setListaTrgovaca(ArrayList<Trgovac> listaTrgovaca) 				{ this.listaTrgovaca = listaTrgovaca;		}
	public void setListaEnergenata(ArrayList<Kompanija> listaEnergenata) 		{ this.listaEnergenata = listaEnergenata;	}
	public void setListaTransakcija(ArrayList<Transakcija> listaTransakcija) 	{ this.listaTransakcija = listaTransakcija;	}


	@Override
	public boolean izvrsiTransakciju(Kompanija e, Trgovac t) {
		
		boolean found = false;
		for (Kompanija energent : listaEnergenata)
			if (energent.equals(e)) found = true;
		
		if (!found) {
			System.err.println("Trazeni energent nije u listi!");
			return false;
		}
		
				found = false;
		for (Trgovac trgovac : listaTrgovaca)
			if (trgovac.equals(t)) found = true;
		
		if (!found) {
			System.err.println("Trazeni trgovac nije u listi!");
		}
		
		e.vlasnik = t;
		return true;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " " + listaEnergenata.toString() + " " + listaTrgovaca.toString();
	}
}
