package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Collections;

public class MaxElementInArrayList {
	
	/**
	 * method that returns the maximum value in an ArrayList of integers. The method returns null if the
     * list is null or the list size is 0.
	 * @param list
	 * @return
	 */
	public static Integer max(ArrayList<Integer> list){
		
		Collections.sort(list);
		
		return list.get(list.size()-1);
		
	}

	public static void main(String[] args) {
		// Test
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(3);
		
		System.out.println("Max element in list is : " + max(list));

	}

}
