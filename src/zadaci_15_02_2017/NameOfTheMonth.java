package zadaci_15_02_2017;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese godinu i prva tri slova
 * imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom
 * mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec
 * Jan program mu ispisuje da Jan 2011 ima 31 dan.
 */


public class NameOfTheMonth {

	//find specific month
	private static int findMonth(String month){
       
        //if month does not start with upper case or his length is wrong
        if ((!Character.isUpperCase(month.charAt(0))) || month.length() != 3) {
        	System.out.println("\nNiste dobro unijeli mjesec!!!");
			System.exit(0);
		}
        

        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        
        for (int i = 0; i < 12; i++) {
        	
        	months[i] = months[i].substring(0, 3);
        	
        	//if months are equal return number of that month
			if (months[i].equals(month.toLowerCase())) {	
				return i;
			}
			
		}
        
        return 0;
		
	}
	
	// method which return number of days in specific month
	private static void getDaysInMonth(int month, int year) {
		
		

		GregorianCalendar gc = new GregorianCalendar(year, month, 10);
		
		// format date in type Februar 2018
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
		
		

		gc.setLenient(false);

		try {
			gc.getTime();
		} catch (Exception e) {// invalid date like 31.02.2017
			System.out.println("\n\nDatum je pogresno unesen");
			System.exit(0);// terminate program immediately
		}

		// print result
		System.out.println("\n" + sdf.format(gc.getTime()) + " ima "
				+ gc.getActualMaximum(java.util.Calendar.DAY_OF_MONTH) + " dan/a");

	}

	public static void main(String[] args) {
		// test
		Scanner input = new Scanner(System.in);

		int year;
		String month;
		
		

		try {
			System.out.print("Unesite godinu: ");
			year = input.nextInt();
			input.nextLine();

			System.out.print("Unesite mjesec: ");
			month = input.nextLine();

			// get results
			getDaysInMonth(findMonth(month), year);

		} catch (Exception e) {
			System.out.println("\nPogresan unos!!!\n");
			
		} finally {
			input.close();
		}

	}
}
