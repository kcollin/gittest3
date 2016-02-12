
public class TestFigure {

	public static void main(String[] args) {


		Figure fig = new Rectangle();
		System.out.println(fig);
		Circle c1 = new Circle();
		c1.setColor("blue");
		System.out.println(c1);
		Circle c2 = new Circle(10, 10, 20);
		System.out.println(c2);
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(10, 20, 100,200);
		r2.setColor("red");
		System.out.println(r2);

	}

}
