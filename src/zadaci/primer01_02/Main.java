package zadaci.primer01_02;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Tika", "Tikic");
		s1.setPt1(10);
		s1.setPt2(30);
		System.out.println(s1);
		System.out.println("Prosecni broj poena za " + s1.ime() + " " + s1.prezime() + " : " + s1.avg());
		
		Student s2 = new Student("Zika", "Zikic", 45, 15);
		System.out.println(s2);
	}
}
