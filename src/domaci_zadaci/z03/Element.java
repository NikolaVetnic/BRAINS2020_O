package domaci_zadaci.z03;

public abstract class Element {
	
	
	protected String id;
	
	
	protected Element() { }
	
	
	protected Element(String id) {
		this.id = id;
	}
	
	
	public String id() { return id; }
}
