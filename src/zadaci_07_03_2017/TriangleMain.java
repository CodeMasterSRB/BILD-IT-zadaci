package zadaci_07_03_2017;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		//Test
		
		Scanner input = new Scanner(System.in);
		double side1,side2,side3;
		String color;
		boolean isFilled;
		
		Triangle triangle;
		
		try {
			System.out.print("Enter side 1: ");
			side1 = input.nextDouble();
			
			System.out.print("Enter side 2: ");
			side2 = input.nextDouble();
			
			System.out.print("Enter side 3: ");
			side3 = input.nextDouble();
			
			if (side1<=0 || side2 <=0 || side3<=0) {
				System.out.println("Wrong input");
				System.exit(0);
			}
			
			input.nextLine();
			System.out.print("Enter color: ");
			color = input.nextLine();
			
			System.out.print("Is filled true/false: ");
			isFilled = input.nextBoolean();
			
			triangle = new Triangle(side1, side2, side3, color, isFilled);
			
			System.out.println("Area: " + triangle.getArea());
			System.out.println("Permieter: " + triangle.getPerimeter());
			System.out.println("Color: " + triangle.getColor());
			System.out.println("Is filled " + triangle.isFilled());
			
		} catch (Exception e) {
			System.out.println("Wrong input!!!");
		}
		
		input.close();
	}

}
