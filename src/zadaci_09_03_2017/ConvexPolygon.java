package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvexPolygon {

	/**
	 * Method which calculate area of the convex polygon
	 * @param x
	 * @param y
	 * @return
	 */
	private static double calculateArea(ArrayList<Double> x, ArrayList<Double> y) {

		double area = 0;
		
		double a=0;
		double b=0;

		for (int i = 0; i < x.size()-1; i++) {

			//area += (x.get(i) * y.get(i+1)) - (x.get(i+1) * y.get(i));
			a+= x.get(i) * y.get(i+1);
			b+= y.get(i) * x.get(i+1);
		
		}
		a+= x.get(x.size()-1) * y.get(0);
		b+= y.get(y.size()-1) * x.get(0);
		
		area = Math.abs(a-b);

		return 0.5 * Math.abs(area);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int numberOfPoints;
		ArrayList<Double> x = new ArrayList<>();
		ArrayList<Double> y = new ArrayList<>();

		double number;

		try {
			System.out.print("Enter the number of the points: ");
			numberOfPoints = input.nextInt();
			
			System.out.print("Enter the coordinates of the points:");

			for (int i = 0; i < numberOfPoints; i++) {
				number = input.nextDouble();
				x.add(number);
				
				number = input.nextDouble();
				y.add(number);
			}
			
			System.out.println("Total area is: " + calculateArea(x, y));

		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}
		
		input.close();

	}

}
