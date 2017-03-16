package zadaci_14_03_2017;

public class RectangleFromGeometricObject extends GeometricObject {

	private double width;
	private double height;

	public RectangleFromGeometricObject() {
		super();
	}

	public RectangleFromGeometricObject(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width * height);
	}

}
