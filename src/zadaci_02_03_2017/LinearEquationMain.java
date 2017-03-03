package zadaci_02_03_2017;

import java.util.Scanner;

public class LinearEquationMain {

	public static void main(String[] args) {
		// test

		Scanner input = new Scanner(System.in);

		double a, b, c, d, e, f;

		try {

			System.out.println("Unesite a,b,c,d,e,f: ");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			d = input.nextDouble();
			e = input.nextDouble();
			f = input.nextDouble();

			LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

			if (equation.isSolvable()) {
				System.out.println("Jednacina nema resenja!");
			} else {
				System.out.println("x je " + equation.getX() + " a y je " + equation.getY());
			}

		} catch (Exception g) {
			System.out.println("Pogresan unos!!!");
		} finally {
			input.close();
		}

	}

}
