package zadaci_08_02_2017;

import java.util.ArrayList;
import java.util.Collections;

public class MaxValue {

	// find and return max value in ArrayList
	public static Integer max(ArrayList<Integer> list) {

		// return null if list is empty or is null
		if (list.size() == 0 || list.equals(null)) {
			return null;
		} else {

			// sorting list in ascending order
			Collections.sort(list);

			// return last element in ArrayList
			return list.get(list.size() - 1);

		}

	}

	public static void main(String[] args) {
		// Testing

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(-1);
		list.add(-2);
		list.add(-3);
		list.add(0);
		
		try {
			System.out.println("Max value in ArrayList is " + max(list));
		} catch (NullPointerException e) {
			System.out.println("null");
		}
	}

}
