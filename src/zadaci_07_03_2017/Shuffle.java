package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	/**
	 * method that shuffles the elements in an ArrayList of integers.
	 * @param list
	 */
	public static void shuffle(ArrayList<Integer> list) {

		Collections.shuffle(list);
		
		System.out.println("Shuffled list: ");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(3);


		shuffle(list);
	}

}
