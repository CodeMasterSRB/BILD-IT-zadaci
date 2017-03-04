package zadaci_03_03_2017;

public class MyPoint {

	private double x;
	private double y;

	public MyPoint() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * returns the distance from this point to a
	 * specified point of the MyPoint type.
	 * @param anotherPoint
	 * @return
	 */
	public double distance(MyPoint anotherPoint) {

		return Math.sqrt(Math.pow((anotherPoint.getX() - this.x), 2) + Math.pow((anotherPoint.getY() - this.y), 2));

	}

	/**
	 * returns the distance from this point to
	 * another point with specified x- and y-coordinates.
	 * @param x2
	 * @param y2
	 * @return
	 */
	public double distance(int x2, int y2) {

		return Math.sqrt(Math.pow((x2 - this.x), 2) + Math.pow((y2 - this.y), 2));

	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	

}
