package zadaci_15_02_2017;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu
 * ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao
 * godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012
 * imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3,
 * program treba ispisati da je Mart 2015 imao 31 dan.
 */


public class Calendar {

	// method which return number of days in specific month
	private static void getDaysInMonth(int month, int year) {

		GregorianCalendar gc = new GregorianCalendar(year, month - 1, 10);

		//format date in type Februar 2018
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
		
		gc.setLenient(false);

		try {
			gc.getTime();
		} catch (Exception e) {// invalid date like 31.02.2017
			System.out.println("\n\nDatum je pogresno unesen");
			System.exit(0);//terminate program immediately
		}

		//print result
		System.out.println("\n"+sdf.format(gc.getTime())+ " ima " + gc.getActualMaximum(java.util.Calendar.DAY_OF_MONTH)+ " dan/a");

	}

	public static void main(String[] args) {
		//test 
		Scanner input = new Scanner(System.in);

		int year, month;

		try {
			System.out.print("Unesite godinu: ");
			year = input.nextInt();

			System.out.print("Unesite mjesec: ");
			month = input.nextInt();
			
			//get results
			getDaysInMonth(month, year);

		}catch (Exception e) {
			System.out.println("\nPogresan unos!!!\n");
		}finally{
			input.close();
		}

	}

}
