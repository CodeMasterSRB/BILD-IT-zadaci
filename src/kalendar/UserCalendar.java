package kalendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.GregorianCalendar;

public class UserCalendar {

	GregorianCalendar gcDate;
	SimpleDateFormat sdf;

	public UserCalendar() {
		gcDate = new GregorianCalendar();
		sdf = new SimpleDateFormat("MMMMM yyyy");
	}

	public void printMonth(int year, int month) throws Exception {

		// validaton
		if ((month > 12 || month <= 0) || (year <= 0 || year > 5000)) {
			throw new Exception();
		}

		// set year on calendar
		gcDate.set(1, year);

		// set month on calendar
		gcDate.set(2, --month);

		// format date  in type "MMMM yyyy"
		System.out.println("\n\t" + sdf.format(gcDate.getTime()));
																	
		System.out.println("_________________________________");
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

		// get number of days in selected month
		int daysInMonth = gcDate.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

		// get first day of current month
		LocalDate today = LocalDate.of(gcDate.get(1), gcDate.get(2) + 1, 5);
		LocalDate firstOfCurrentMonth = today.with(ChronoField.DAY_OF_MONTH, 1);

		// get first day of month(Sunday 1, Monday 7)
		int firstDayInMonth = firstOfCurrentMonth.getDayOfWeek().getValue();

		//set date on correct day in week
		for (int i = 0; i < firstDayInMonth; i++) {
			System.out.printf("%-5s", " ");
		}

		int temp = firstDayInMonth;
		
		// print all days in selected month
		for (int i = 1, j = 0 + firstDayInMonth + 1; i <= daysInMonth; i++, j++) {
			
			//in case first day in week is 7
			if (temp % 7 ==0) {
				System.out.println();
				temp++;
			}
			
			System.out.printf("%-5d", i);// print one day in month per iteration

			// print new line for each week
			if (j % 7 == 0 && j != 0) {
				System.out.println();
			}
			
			
		}
		System.out.println("\n_________________________________");

	}

}
