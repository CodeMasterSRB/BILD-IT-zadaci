package zadaci_02_03_2017;

import java.util.Scanner;

public class QuadraticEquationMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double a, b, c;
		

		try {
			
			System.out.println("Unesite a,b,c: ");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			QuadraticEquation equation = new QuadraticEquation(a, b, c);

			

				if (equation.getDiscriminant() > 0) {
					
					System.out.println("Jednacina ima dva korijana: " + equation.getRoot1() + " , " + equation.getRoot2());
				}else if(equation.getDiscriminant() == 0){
					System.out.println("Jednacina ima jedan korijen: " + equation.getRoot2());
				}else{
					System.out.println("Jednacina nema stvarni korijen");
				}

			

		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}

	}

}
