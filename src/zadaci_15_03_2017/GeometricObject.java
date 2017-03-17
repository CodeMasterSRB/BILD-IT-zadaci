package zadaci_15_03_2017;

// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;

	/** Default construct */
	protected GeometricObject() {
	}

	/** Construct a geometric object */
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/** Getter method for color */
	public String getColor() {
		return color;
	}

	/** Setter method for color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Getter method for filled. Since filled is boolean, so, the get method
	 * name is isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Setter method for filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Abstract method findArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	public static void max(GeometricObject o1, GeometricObject o2) {
		if (o1.getArea() > o2.getArea()) {
			System.out.println("First is bigger");
		} else if (o1.getArea() < o2.getArea()) {
			System.out.println("Second is bigger");
		} else {
			System.out.println("Equal");
		}
	}

}