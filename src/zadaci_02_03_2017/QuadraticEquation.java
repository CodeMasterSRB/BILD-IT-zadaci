package zadaci_02_03_2017;

public class QuadraticEquation {
	
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * returns the discriminant, which is b2 - 4ac.
	 * @return
	 */
	public double getDiscriminant(){
		return Math.pow(b, 2) - 4 * (a*c);
	}
	
	/**
	 * returning two roots of the equation
	 * @return
	 */
	public double getRoot1(){
		
		return ((-b + Math.sqrt(getDiscriminant())) / 2*a);
		
		
	}
	
	
	/**
	 * returning two roots of the equation
	 * @return
	 */
	public double getRoot2(){
		
		return ((-b -  Math.sqrt(getDiscriminant())) / 2*a);
		
		
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	
	

}
