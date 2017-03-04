package zadaci_03_03_2017;

public class TestMyPoint {
	
	public static void main(String[] args){
		
		MyPoint point1 = new MyPoint(0 , 0);
		
		MyPoint point2 = new MyPoint(10 , 30.5);

		System.out.println(point1.distance(point2));
		
		
	}

}
