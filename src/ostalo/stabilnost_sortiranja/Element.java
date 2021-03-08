package ostalo.stabilnost_sortiranja;

public class Element {

	int num;
	char c;
	
	public Element(int num, char c) {
		this.num = num;
		this.c = c;
	}
	
	public String toString() {
		return "(" + num + ", " + c + ")";
	}
}
