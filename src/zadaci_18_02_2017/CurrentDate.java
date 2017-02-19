package zadaci_18_02_2017;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi
 * od 1. januara 1970 do trenutka pozivanja metode. Napisati program koji
 * ispisuje trenutaèni datum i vrijeme u formatu
 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */

public class CurrentDate {

	//method which set and return current date
	private static GregorianCalendar getCurrectDate(){
	
		// set current date
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(new Date(System.currentTimeMillis()));
		
				return gc;
	}

	//method which print date in correct format
	private static void printCurrectDate() {

		//format date like  22. juli, 2015 19:59:47
		SimpleDateFormat sdf = new SimpleDateFormat("dd. MMMM, yyyy HH:mm:ss");
		
		//print result
		System.out.println("Trenutni datum i vrijeme: " + sdf.format(getCurrectDate().getTime()));
		
		
	}

	public static void main(String[] args) {
		//Test
		
		try {
			//print results
			printCurrectDate();
		} catch (Exception e) {
			//System.out.println("Greska!!!");
			e.printStackTrace(System.out);
		}

	}

}
