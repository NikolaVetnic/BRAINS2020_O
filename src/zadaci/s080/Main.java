package zadaci.s080;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Tika", "Tikic", 22, 20, 20);
		s1.setPt1(10);
		s1.setPt2(30);
		s1.predstaviSe();
		
		Student s2 = new Student("Zika", "Zikic", 23, 45, 15);
		s2.predstaviSe();
	}
}
