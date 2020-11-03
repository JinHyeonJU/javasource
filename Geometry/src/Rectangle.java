
public class Rectangle extends Geometry {
	private int width;	//넓이
	private int height; //높이
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.printf("사각형은 : (%d, %d) (%d, %d)\n", x, y, width, height);
	}
}
