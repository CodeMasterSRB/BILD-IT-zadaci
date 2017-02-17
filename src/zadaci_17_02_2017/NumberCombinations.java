package zadaci_17_02_2017;

/*
 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva
 * broja u rasponu od 1 do 7. Tako�er, program ispisuje broj svih mogu�ih
 * kombinacija. Dakle, program treba da ispi�e sve mogu�e parove brojeva u
 * datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija
 * je 21.
 */

public class NumberCombinations {

	//method which count and print all number combinations from 1 to 7
	private static void printAllCombinations(){
		
int counter = 0;
		
		System.out.println("Kombinacije za biranje dva broja u rasponu od 1 do 7: ");
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= 7; j++) {
				
				if(i == j){
				
				}else if(i>j){
					
				}else{
					//print one combination
					System.out.print(i+",");
					System.out.print(j);
					System.out.println();
					counter++;
				}
			}
			
		}
		//print number of combination
		System.out.println("Broj mogucih kombinacija je: "+ counter);
		
	}
	
	public static void main(String[] args) {
		//test
		
		//print result
		printAllCombinations();

	}

}
