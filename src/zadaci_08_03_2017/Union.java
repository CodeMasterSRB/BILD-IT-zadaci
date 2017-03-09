package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Union {
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> union = new ArrayList<>(list1);
		union.addAll(list2);
		
		return union;
		
				
	}
	
	
	public static void main(String[] args) {
		// Test
		
		System.out.println("Union of two lists\n");
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Integer number;

		try {
			System.out.println("Enter first list [5 numbers separated by space]");
			System.out.print("Enter numbers: ");
			for (int i = 0; i < 5; i++) {
				
				number = input.nextInt();
				list1.add(number);
			}
			
			
			
			System.out.println("\nEnter second list [5 numbers separated by space]");
			System.out.print("Enter number: ");

			for (int i = 0; i < 5; i++) {
				number = input.nextInt();
				list2.add(number);
			}

			SortList.printSortedLIst(union(list1, list2));

		} catch (Exception e) {
			System.out.println("Wrong input!!!");
		}

		input.close();

	}

}
