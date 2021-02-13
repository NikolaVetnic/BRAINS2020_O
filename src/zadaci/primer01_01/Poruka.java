package zadaci.primer01_01;

public class Poruka {

	private String tekst;
	
	public Poruka(String tekst) {
		this.tekst = tekst;
	}
	
	public void setTekst(String tekst) { this.tekst = tekst; }
	public String tekst() { return this.tekst; }
	
	public String toString() {
		return tekst;
	}
}
