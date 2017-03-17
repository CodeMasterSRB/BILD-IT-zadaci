package zadaci_15_03_2017;

public class RectangleFromGeometricObject extends GeometricObject implements Comparable<RectangleFromGeometricObject> {

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
	
	@Override
	public boolean equals(Object obj) {
		if (this.getArea() == ((RectangleFromGeometricObject)(obj)).getArea()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(RectangleFromGeometricObject o) {
		if (this.getArea() < o.getArea()) {
			return -1;
		}else if(this.getArea() == o.getArea()){
			return 0;
		}else{
			return 1;
		}
	}

}
