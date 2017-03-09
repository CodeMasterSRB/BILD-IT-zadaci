package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * (Remove duplicates) Write a method that removes the duplicate elements
 * from an array list of integers using the following header: public static
 * void removeDuplicate(ArrayList<Integer> list) Write a test program that
 * prompts the user to enter 10 integers to a list and displays the distinct
 * integers separated by exactly one space.
 */

public class RemoveDuplicats {

	
	/**
	 * method that removes the duplicate elements from an array list of integers
	 * @param list
	 */
	public static void removeDuplicate(ArrayList<Integer> list) {

		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.println("The distinct integers are: ");
		for (Integer integer : set) {
			System.out.println(integer.intValue());
		}
		

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		Integer number;

		try {
			System.out.println("Enter 10 integers\n");
			for (int i = 0; i < 10; i++) {
				System.out.print("Enter number: ");
				number = input.nextInt();
				list.add(number);
			}

			removeDuplicate(list);

		} catch (Exception e) {
			System.out.println("Wrong input!!!");
		}

		input.close();

	}

}
