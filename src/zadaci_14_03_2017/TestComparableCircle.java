package zadaci_14_03_2017;

public class TestComparableCircle {

	public static void main(String[] args) {
		
		CircleFromGeometricObject circle1 = new CircleFromGeometricObject(50);
		CircleFromGeometricObject circle2 = new CircleFromGeometricObject(60);
		
		ComparableSpecial compare = (c1 , c2)->{
			if (c1.getArea() > c2.getArea()) {
				System.out.println("First is bigger");
			}else if(c1.getArea() == c2.getArea()){
				System.out.println("Equal");
			}else{
				System.out.println("Second is bigger");
			}
		};
		
		compare.compareTo(circle1, circle2);

	}
	

}

	interface ComparableSpecial{
		public void compareTo(CircleFromGeometricObject c1, CircleFromGeometricObject c2);
	}
