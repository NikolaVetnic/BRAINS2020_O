package domaci_zadaci.z03.jelovnik;

public enum TipStavke {
	
	PREDJELO("predjelo"),
	GLAVNO("glavno"),
	SALATA("salata"),
	DEZERT("dezert"),
	PICE("pice");
	
	private String opis;
	
	private TipStavke(String opis) {
		this.opis = opis;
	}
	
	public String toString() {
		return opis;
	}
}
