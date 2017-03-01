package zadaci_28_02_2017;

import java.util.Arrays;

public class StopWatchMain {

	/*
	 * (Stopwatch) Design a class named StopWatch. The class contains:  Private
	 * data fields startTime and endTime with getter methods.  A no-arg
	 * constructor that initializes startTime with the current time.  A method
	 * named start() that resets the startTime to the current time.  A method
	 * named stop() that sets the endTime to the current time.  A method named
	 * getElapsedTime() that returns the elapsed time for the stopwatch in
	 * milliseconds. Draw the UML diagram for the class and then implement the
	 * class. Write a test program that measures the execution time of sorting
	 * 100,000 numbers using selection sort.
	 */
	public static void main(String[] args) {

		StopWatch stopWatch = new StopWatch();
		
		stopWatch.start();
		sortArray();
		stopWatch.stop();
		
		System.out.println("Elapsed time " + stopWatch.getElapsedTime());
		
	}
	
	public static void sortArray(){
		
		int[] array = new int[100000];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int)(Math.random() * 1000)+1;
			
		}
		
		Arrays.sort(array);
		
	}

}
