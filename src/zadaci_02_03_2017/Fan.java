package zadaci_02_03_2017;

public class Fan {
	
	private final int SLOW;
	private final int MEDIUM;
	private final int FAST;
	
	private int speed;
	
	private boolean isOn;
	
	private double radius;
	
	private String color;

	public Fan() {
		
		SLOW = 1;
		MEDIUM =2;
		FAST = 3;
		this.speed = SLOW;
		this.radius = 5.0;
		this.color = "blue";
	}
	
	

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed=speed;
	}



	@Override
	public String toString() {
		if (isOn) {
			return "Speed: " + speed + "\nColor: " + color + "\nRadius: " +radius;
		}else{
			return "\nColor: " + color + "\nRadius: " +radius + "\nfan is off";
		}
	}
	
	
	
	 
	

}
