package area.com;

public class Main {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 3;
		r.breadth = 6;
		r.calculateArea();
		System.out.println("The area of the rectangle is " + r.area);

	}

}
