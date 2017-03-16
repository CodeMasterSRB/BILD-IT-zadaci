package zadaci_14_03_2017;

import java.util.Scanner;

import kalendar.UserCalendar;

public class PrintCalendar {

	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// Prompt the user to enter year
			System.out.print("Enter full year (e.g., 2012): ");
			int year = input.nextInt();

			// Prompt the user to enter month
			System.out.print("Enter month as a number between 1 and 12: ");
			int month = input.nextInt();

			// Print calendar for the month of the year
			UserCalendar uc = new UserCalendar();
			uc.printMonth(year, month);
		} catch (Exception e) {
			System.out.println("Wrong input!!!");
		} finally {
			input.close();

		}

	}

	/** A stub for printMonthTitle may look like this */
	public static void printMonthTitle(int year, int month) {
	}

	/** A stub for getMonthBody may look like this */
	public static void printMonthBody(int year, int month) {
	}

	public static String getMonthName(int month) {
		return "January"; // A dummy value
	}

	/** A stub for getStartDay may look like this */
	public static int getStartDay(int year, int month) {
		return 1; // A dummy value
	}

	/** A stub for getTotalNumberOfDays may look like this */
	public static int getTotalNumberOfDays(int year, int month) {
		return 10000; // A dummy value
	}

	/** A stub for getNumberOfDaysInMonth may look like this */
	public static int getNumberOfDaysInMonth(int year, int month) {
		return 31; // A dummy value
	}

	/** A stub for isLeapYear may look like this */
	public static Boolean isLeapYear(int year) {
		return true; // A dummy value
	}
}
