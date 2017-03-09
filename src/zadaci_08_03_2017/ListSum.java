package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * (Sum ArrayList) Write the following method that returns the sum of all
 * numbers in an ArrayList: public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores
 * them in an array list, and displays their sum.
 */


public class ListSum {

	/**
	 * method that returns the sum of all numbers in an ArrayList 
	 * @param list
	 * @return
	 */
	public static double sum(ArrayList<Double> list) {

		double sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i);
		}
		
		return sum;

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		Double number;

		try {
			for (int i = 0; i < 5; i++) {
				System.out.print("Enter number: ");
				number = input.nextDouble();
				list.add(number);
			}

			System.out.println("Sum: " + sum(list));

		} catch (Exception e) {
			System.out.println("Wrong input!!!");
		}

		input.close();

	}

}
