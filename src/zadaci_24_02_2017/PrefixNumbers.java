package zadaci_24_02_2017;

/*
 * Napisati metodu sa sljedecim headerom: public static String format(int
 * number, int width) koja vraca string broja sa prefiksom od jedne ili više
 * nula. Velicina stringa je width argument. Na primjer, ukoliko pozovemo
 * metodu format(34, 4) metoda vraca 0034, ukoliko pozovemo format(34, 5)
 * metoda vraca 00034. Ukoliko je uneseni broj veci nego width argument,
 * metoda vraca samo string broja. Npr. ukoliko pozovemo format(34, 1)
 * metoda vraca 34.
 */

public class PrefixNumbers {
	
	//method which print number with his prefix (number of zeroes)
	public static String format(int number, int width){
		
		String pNumber = Integer.toString(number);
		String zeroes = "";
		
		//add zeroes if is necessary
		for (int i = pNumber.length(); i < width; i++) {
			zeroes += "0";
		}
		
		
		return zeroes + pNumber;
	}

	public static void main(String[] args) {
		//Test
		
		try {
			//print results
			System.out.println(format(34, 5));
		} catch (Exception e) {
			System.out.println("Greska!!!");
		}

	}

}
