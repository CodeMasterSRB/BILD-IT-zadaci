package zadaci_16_02_2017;

import java.util.Scanner;

/*
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na
 * površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
 * širinu i dužinu dvije taèke. Great circle distance izmeðu ove dvije taèke
 * može biti izraèunata koristeæi se sljedeæom formulom: d = radius * arccos
 * (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program
 * koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije
 * taèke na površini zemlje te mu ispisuje great circle distance. Prosjeèni
 * radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo
 * promijeniti u radianse koristeæi se Math.toRadians metodom jer Java
 * trigonometrijske metode koriste radianse. Širina i dužina u ovoj formuli
 * se odnose na zapad i sjever. Koristimo negativne vrijednosti da oznaèimo
 * istok i jug.
 */

public class GreatCircle {
	
	//method which count great circle
	private static double countGreatCircle(double x1, double  y1, double x2, double y2)throws Exception{
		
		if ((x1 < -90 || x1> 90) || (x2 < -90 || x2> 90) || (y1 < -180 || y1> 180) || (y2 < -180 || y2> 180) ) {
			throw new Exception();
		}
		
		//convert degrees to radians
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		
		y1= Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		
		
		//count result
		return 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)) ; 
		
	}


	public static void main(String[] args) {
		// Test
		
		Scanner input = new Scanner(System.in);
		
		//latitude and longitude for 2 spots 
		double x1,y1,x2,y2;
		
		try {
			System.out.println("Great Circle Distance\n");
			System.out.print("Unesite geografsku sirinu za prvu tacku[u stepenima]: ");
			x1 = input.nextDouble();
			
			System.out.print("Unesite geografsku duzinu za prvu tacku[u stepenima]: ");
			y1 = input.nextDouble();
			
			System.out.print("Unesite geografsku sirinu za drugu tacku[u stepenima]: ");
			x2 = input.nextDouble();
			
			System.out.print("Unesite geografsku duzinu za drugu tacku[u stepenima]: ");
			y2 = input.nextDouble();
			
			//print results
			System.out.println("\n\nGreat Circle Distance: "+countGreatCircle(x1, y1, x2, y2) + " km");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Pogresan unos!!!");
		}finally{
			input.close();
		}

	}

}
