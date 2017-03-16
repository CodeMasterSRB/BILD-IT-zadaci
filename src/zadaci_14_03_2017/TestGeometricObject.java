package zadaci_14_03_2017;

public class TestGeometricObject {
	
	public static void main(String[] args){
		
		CircleFromGeometricObject circle1 = new CircleFromGeometricObject(50);
		CircleFromGeometricObject circle2 = new CircleFromGeometricObject(40);

		GeometricObject.max(circle1, circle2);
		
		RectangleFromGeometricObject rectangle1 = new RectangleFromGeometricObject(10, 15);
		RectangleFromGeometricObject rectangle2 = new RectangleFromGeometricObject(12, 15);
		
		GeometricObject.max(rectangle1, rectangle2);


	}

}
