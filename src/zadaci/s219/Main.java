package zadaci.s219;

public class Main {

	public static void main(String[] args) {
		
		Spisak s = new Spisak("res//s152_spisakKlijenata.txt");
		
		System.out.println("Spisak 'as is' : ");
		s.stampaj();
		System.out.println();
		
		s.sortirajLeksikografski();

		System.out.println("Spisak sortiran leksikografski : ");
		s.stampaj();
		System.out.println();
		
		s.sortirajPoJMBG();
		
		System.out.println("Spisak sortiran po JMBGu : ");
		s.stampaj();
		System.out.println();
		
		s.sacuvajSpisak("res//s219_uredjeniSpisak.txt");
	}
}
