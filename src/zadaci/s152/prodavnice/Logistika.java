package zadaci.s152.prodavnice;

public interface Logistika {
	void nabaviInventar(String artikal);
	void potrosiInventar(String artikal);
	int prikaziStanjeInventara(String[] spisakArtikala);  // vraca broj prikazanih artikala
}
