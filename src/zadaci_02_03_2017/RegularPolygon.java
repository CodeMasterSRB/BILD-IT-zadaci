package zadaci_02_03_2017;

public class RegularPolygon {
	
	private int n;
	private double side;
	private double x;
	private double y;
	
	
	/**
	 * A constructor that set fields to default values
	 */
	public RegularPolygon() {
		
		this.n = 3;
		this.side = 1.0;
		this.x = 0.0;
		this.y = 0.0;
	}
	
	/**
	 * A constructor that creates a regular polygon with the specified number of sides
	 * and length of side, centered at (0, 0).
	 * @param n
	 * @param legntOfSide
	 */
	public RegularPolygon(int n, double legntOfSide) {
		
		this.n = 3;
		this.side = legntOfSide;
		
	}

	/**
	 * A constructor that creates a regular polygon with the specified number of sides,
	 * length of side, and x- and y-coordinates.
	 * @param n
	 * @param side
	 * @param x
	 * @param y
	 */
	public RegularPolygon(int n, double side, double x, double y) {
		super();
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * return perimeter for regular polygon
	 * @return
	 */
	public double getPerimeter(){
		return n*side;
	}
	
	/**
	 * return area for regular polygon
	 * @return
	 */
	public double getArea(){
		double forT = n/Math.PI;
		return (n* Math.pow(side, 2)) / ((4*Math.tan(forT)));
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
	

}
