package zadaci_23_02_2017;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
/*Napisati metodu koja vraca datum i trenutacno vrijeme.*/

public class DateAndTime {
	
	//Method which return currect date and time
	private static Date getDate(){
		
		GregorianCalendar gc = new GregorianCalendar();
		
		return gc.getTime();
		
	}

	public static void main(String[] args) {
		// Test
		
		try{
		//format date
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy   HH:mm:ss");

		//print results
		System.out.println("Trenutni datum i vrijeme je: "+sfd.format(getDate()));
		}catch(Exception e){
			System.out.println("Greska!!!");
		}
	}

}
