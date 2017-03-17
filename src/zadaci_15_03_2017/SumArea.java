package zadaci_15_03_2017;

public class SumArea {
	public static double sumArea(GeometricObject[] a){
		double sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum+= a[i].getArea();
		}
		
		return sum;
	}

	public static void main(String[] args) {
		GeometricObject octagon1 = new Octagon(15);
		GeometricObject rectangle1 = new RectangleFromGeometricObject(5, 10);
		GeometricObject circle = new CircleFromGeometricObject(25);
		
		GeometricObject[] a = {octagon1, rectangle1,circle};

		System.out.println("Sum of all areas is " + sumArea(a));
	}

}
