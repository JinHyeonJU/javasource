
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t = new Triangle (10, 20, 30, 40, 50, 60);
		Rectangle r = new Rectangle (100, 200, 300, 400);
		Circle c = new Circle(1000, 2000, 3000);
		Geometry[] geos = {t, r, c};
		
		for(Geometry geo : geos)
			geo.draw();
	}
}
