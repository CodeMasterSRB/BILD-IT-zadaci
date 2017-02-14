package bonusZadaci_13_02_2017;

import java.util.Scanner;

public class TimeTravel {

	// count time travel in seconds,minuts and hours
	private static void countSecMinHou(long years) {

		long seconds = years;
		long tempSeconds = seconds;
		long minutes = 0;
		long hours = 0;
		long days = 0;
		long months =0;
		long pYears =0;
		long decades=0;
		long centurys =0;
		long mil =0;
		
		for (int i = 1; i <= tempSeconds; i++) {
			
			if (i % 60 == 0) {
				minutes++;
				seconds-=60;
			}else if(minutes == 60){
				hours++;
				minutes = 0;
			}else if (hours == 24) {
				days++;
				hours=0;
			}else if (days == 31) {
				months++;
				days=0;
			}else if(months ==12){
				pYears++;
				months=0;
			}else if(pYears ==10){
				decades++;
				years =0;
			}else if(decades ==10){
				centurys++;
				decades=0;
			}else if(centurys == 10){
				mil++;
				centurys=0;
			}
			
		}

		

		System.out.println("Trebali bi ste putovati (Vremenski):\n" + seconds + " sekundi\n" + minutes + " minuta\n" + hours + " sati\n" +
		days + " dana\n" + months + " mjeseci\n" + pYears +" godina\n" + decades + " decenija\n" + centurys + " vijekova\n" + mil + " milenijuma");

	}
	
	private static void countFeets(long years){
		
		long cm = years*75;
		long tempCM = cm;
		long m =0;
		long mTotal=0;
		long km=0;
		long stadiums = 0;
		long earth = 0;
		
		for (int i = 1; i <= tempCM; i++) {
			
			if (i % 100 == 0) {
				m++;
				cm-=100;
				mTotal++;
				
			}else if(m == 1000){
				km++;
				m=0;
				
			}
			
		}
		
		stadiums = mTotal / 105;
		earth = km / 45000;
		
		System.out.println("\n\nDa bi ste se vratili " + years + " godina u proslost morate preci:\n" + 
		cm + " cm\n" + m +" m\n" + km + " km\n");
		
		System.out.println("A to je " + stadiums + " stadiona, i mogli bi ste " + earth + " puta prehodat zemlju");
	
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		long years;

		try {
			System.out.print("Koliko zelite godina da se vratite: ");
			years = input.nextLong();
			
			countSecMinHou(years);
			countFeets(years);
		} catch (Exception e) {
			System.out.println("Greska!!!!!!!");
			input.nextLine();
		}finally {
			input.close();
		}

	}

}
