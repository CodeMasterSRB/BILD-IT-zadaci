package zadaci_13_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje
 * najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. Na
 * primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai"
 * i "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki
 * prefix za dva stringa je "Dobrodošli u".
 */

public class MaxPrefix {


	private static String findMaxCommonPrefix(String s1, String s2){
		
		String prefix = "";//start value for prefix
		
		for (int i = 0; i < s1.length() && i<s2.length(); i++) {
			
			//check for equals of prefix
			if (Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s2.charAt(i))) {
				prefix+=s1.charAt(i);//add common char
			}else{
				//there is no more common chars
				break;
			}
			
			
			
		}
		
		//if inputed strings have no common prefix
		if (prefix.length()==0) {
			prefix = "Nema zajednickog prefiksa";
		}
		
		return prefix;
		
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s1,s2;
		
		try {
			//input first string
			System.out.print("Unesite prvi string: ");
			s1 = input.nextLine();
			
			//input second string
			System.out.print("Unesite drugi string: " );
			s2 = input.nextLine();
			
			//print results
			System.out.println(findMaxCommonPrefix(s1, s2));
		} catch (Exception e) {
			System.out.println("Greska");
		}
		
		input.close();

	}

}
