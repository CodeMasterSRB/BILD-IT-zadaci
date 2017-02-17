package zadaci_17_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u
 * stringu. Metoda treba da koristi sljedeæi header: public static int
 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na
 * sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. Napisati
 * program koji pita korisnika da unese string i koji karakter želi da
 * prebroji u datom stringu te mu ispiše koliko se puta odreðeni karakter
 * ponovio u zadatom stringu.
 */

public class CharsInString {

	//method which count number of selected char in string
	public static int count (String str, char a){
		
		int counter =0;
		
		for (int i = 0; i < str.length(); i++) {
			//if chars are equal
			if (str.charAt(i) == a) {
				counter++;//increment number of that char
			}
			
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// Test
		
		Scanner input = new Scanner(System.in);
		String str;
		char a;
		
		try {
			System.out.println("Prebrojavanje karaktera u stringu[Case Sensitive]\n");
			
			System.out.print("Unesite string: ");
			str = input.nextLine();
			
			System.out.print("\nKoji karakter zelite da prebrojite: ");
			a = input.nextLine().charAt(0);
			
			System.out.println("\nU stringu " + "\"" + str + "\"" + " ima " + count(str, a) + " " +"\""+ a + "\"" +" karaktera " );
		} catch (Exception e) {
			System.out.println("Greska");
			e.printStackTrace(System.out);
		}finally{
			input.close();
		}

	}

}
