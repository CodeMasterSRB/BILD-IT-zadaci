package zadaci_02_03_2017;

import java.util.Scanner;

public class IntersectingPoint {

	private static LinearEquation getEquation(double x1, double y1, double x2, double y2, double x3, double y3,
			double x4, double y4) {

		// cramer rule
		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

		return equation;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x1, y1, x2, y2, x3, y3, x4, y4;

		try {

			System.out.println("Unesite x1,y1,x2,y2,x3,y3,x4,y4: ");
			x1 = input.nextDouble();
			y1 = input.nextDouble();
			x2 = input.nextDouble();
			y2 = input.nextDouble();
			x3 = input.nextDouble();
			y3 = input.nextDouble();
			x4 = input.nextDouble();
			y4 = input.nextDouble();

			LinearEquation equation = getEquation(x1, y1, x2, y2, x3, y3, x4, y4);

			if (equation.isSolvable()) {
				System.out.println("Linije su paralelne");
			} else {
				System.out.println("Tacke presjeka su  " + equation.getX() + " a y je " + equation.getY());

			}

		} catch (Exception g) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
