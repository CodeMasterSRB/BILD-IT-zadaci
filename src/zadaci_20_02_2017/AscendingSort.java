package zadaci_20_02_2017;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše
 * ta ista tri broja u rastuæem redosljedu. Bonus: Napisati metodu koja
 * prima tri cijela broja kao argumente te vraæa brojeve u rastuæem
 * redosljedu.
 */

public class AscendingSort {

	private static int[] sortNumber(int num1, int num2, int num3) {

		// inputed numbers put in array
		int[] array = { num1, num2, num3 };

		Arrays.sort(array);// sort array in ascending order

		return array;
	}

	public static void main(String[] args) {
		// test

		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
		try {
			System.out.println("Unesite prvi broj: ");
			num1 = input.nextInt();
			
			System.out.println("Unesite drugi broj: ");
			num2 = input.nextInt();
			
			System.out.println("Unesite treci broj: ");
			num3 = input.nextInt();
			
			int[] array = sortNumber(num1, num2, num3);
			
			System.out.println("Brojevi u rastucem redosledu: ");
			for (int i : array) {
				System.out.println(i);
			}
			
		} catch (Exception e) {
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}

	}

}
