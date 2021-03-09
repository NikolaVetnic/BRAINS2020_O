package domaci_zadaci.z02;

public class Vec2 {

	
	private final double x;
	private final double y;
	
	
	private Vec2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	public static Vec2 xy(double x, double y) {
		return new Vec2(x, y);
	}
	
	
	public Vec2 konjuguj() {
		return Vec2.xy(x(), -y());
	}
	
	
	public double x() { return x; }
	public double y() { return y; }
	
	
	public String toString() {
		return String.format("(%.2f, %.2f)", x(), y());
	}
}
