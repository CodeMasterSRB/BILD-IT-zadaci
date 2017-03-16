package zadaci_14_03_2017;

public class CircleFromGeometricObject extends GeometricObject {

	private double radius;
	public double nesto;

	public CircleFromGeometricObject() {
		super();
	}

	public CircleFromGeometricObject(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * Math.PI;
	}

}
