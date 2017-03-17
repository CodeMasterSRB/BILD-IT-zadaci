package zadaci_15_03_2017;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	
	private double side;

	public Octagon(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2+4 / Math.sqrt(2))* side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8 * side;
	}
	

	@Override
	public int compareTo(Octagon o) {
		if (this.getArea() < o.getArea()) {
			return -1;
		}else if(this.getArea() == o.getArea()){
			return 0;
		}else{
			return 1;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
