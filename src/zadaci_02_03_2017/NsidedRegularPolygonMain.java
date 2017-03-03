package zadaci_02_03_2017;

public class NsidedRegularPolygonMain {

	public static void main(String[] args) {
		
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Polygon 1:\nPerimeter: " + polygon1.getPerimeter() + "\nArea: " + polygon1.getArea());
		System.out.println("\nPolygon 2:\nPerimeter: " + polygon2.getPerimeter() + "\nArea: " + polygon2.getArea());
		System.out.println("\nPolygon 3:\nPerimeter: " + polygon3.getPerimeter() + "\nArea: " + polygon3.getArea());

	}

}
