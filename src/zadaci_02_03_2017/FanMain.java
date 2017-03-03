package zadaci_02_03_2017;

public class FanMain {
	
	public static void main(String[] args){
		
		Fan fan1 = new Fan();
		fan1.setOn(true);
		fan1.setSpeed(fan1.getFAST());
		fan1.setRadius(10);
		fan1.setColor("yellow");
		
		System.out.println("FAN 1: \n"+fan1.toString());
		
		
		Fan fan2 = new Fan();
		fan2.setOn(false);
		fan2.setSpeed(fan2.getMEDIUM());
		fan2.setRadius(5);
		fan2.setColor("blue");
		
		System.out.println("\nFAN 2: "+fan2.toString());

		
	}

}
