package domaci_zadaci.z03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Spisak implements RadSaFajlovima {

	
	private Map<String, Element> elementi;
	
	
	public Spisak() {
		this.elementi = new TreeMap<String, Element>();
	}
	
	
	public Map<String, Element> elementi() 	{ return elementi; 			}
	public int brojElemenata() 				{ return elementi.size(); 	}
	
	
	public List<Element> lista() {
		return new ArrayList<Element>(elementi().values()); 
	}
	
	
	public interface Kriterijum 	{ public boolean zadovoljava(Element e);	}
	public interface Akcija			{ public void uradi(Element e);				}
	
	
	protected boolean dodaj(Element e) {

		if (nadji(e.id()) != null)
			return false;
		
		elementi.put(e.id(), e);
		return true;
	}
	
	
	protected Element nadji(Kriterijum kriterijum) {
		for (Map.Entry<String, Element> entry : elementi.entrySet())
			if (kriterijum.zadovoljava(entry.getValue())) return entry.getValue();
		
		return null;
	}
	
	
	public Element nadji(String id) {
		return elementi.get(id);
	}
	
	
	protected boolean izbaci(Kriterijum kriterijum, Akcija akcija) {

		for (Map.Entry<String, Element> entry : elementi.entrySet()) {
			if (kriterijum.zadovoljava(entry.getValue())) 
				akcija.uradi(entry.getValue());

			return true;
		}
		
		return false;
	}
	
	
	public boolean izbaci(String id) {
		return elementi.remove(id) != null;
	}
	
	
	protected void stampaj(Comparator<Element> c, Akcija akcija) {
		
		ArrayList<Element> l = new ArrayList<Element>(elementi().values());
		Collections.sort(l, c);
		
		for (Element e : l) akcija.uradi(e);
	}
	
	
	public void stampajPoID() {
		stampaj((e1, e2) -> e1.id().compareTo(e2.id()), e -> System.out.println(e));
	}
	
	
	abstract protected Element parsirajLiniju(String line);
	
	
	abstract protected String pripremiLiniju(Element e);
	
	
	@Override
	public void ucitajIzFajla(String input) {
		
		String file = "res//" + input + ".txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line;
			int count = 0;
			
			while ((line = br.readLine()) != null) {
				
				try {
					
					try {
						dodaj(parsirajLiniju(line));
					} catch (IllegalArgumentException e) {
						System.err.printf("[%04d] %s %n", count, e.getMessage());
					}
					
					count++;
					
				} catch (IllegalArgumentException e) {
					System.err.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
		
	@Override
	public void upisiUFajl(String output) {
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("res//" + output + ".txt")))) {
			for (Map.Entry<String, Element> entry : elementi.entrySet()) pw.println(pripremiLiniju(entry.getValue()));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
