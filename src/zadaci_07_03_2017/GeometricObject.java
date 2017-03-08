package zadaci_07_03_2017;

public class GeometricObject {

	private String color;
	private boolean isFilled;
	
	/**
	 * set data for all fields
	 * @param color
	 * @param isFilled
	 */
	public GeometricObject(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return isFilled;
	}
	
	
	public String toString(){
		return " color: " + getColor() + " is filled "+ isFilled();
	}
	
}


