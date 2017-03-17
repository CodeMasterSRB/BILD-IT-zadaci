package zadaci_15_03_2017;


public class CircleFromGeometricObject extends GeometricObject implements Comparable<CircleFromGeometricObject> {

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
	
	

	@Override
	public boolean equals(Object arg0) {
		if (this.radius == ((CircleFromGeometricObject)(arg0)).getArea()) {
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int compareTo(CircleFromGeometricObject o) {
		// TODO Auto-generated method stub
				if (this.getArea() < o.getArea()) {
					return -1;
				}else if(this.getArea() == o.getArea()){
					return 0;
				}else{
					return 1;
				}
	}

}
