
public class Circle extends Geometry {
	private int radius; //반지람
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		System.out.printf("원형은 : (%d, %d, %d)\n", x, y, radius);
	}
}
