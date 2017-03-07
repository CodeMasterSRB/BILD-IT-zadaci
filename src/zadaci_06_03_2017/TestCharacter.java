package zadaci_06_03_2017;

public class TestCharacter {
	
	public static void main(String[] args){
		
		char a = 'D';
		
		System.out.println(a + " is letter " + MyCharacter.isLetter(a));
		System.out.println(a + " is digit " + MyCharacter.isDigit(a));
		System.out.println(a + " is upper case " + MyCharacter.isUpperCase(a));


		char b = '0';
		System.out.println(b + " is digit " + MyCharacter.isDigit(b));
		System.out.println(b + " is white space " + MyCharacter.isWhitespace(b));
		
		System.out.println('a' + " is upper case " + MyCharacter.isUpperCase('a'));
		System.out.println('a' + " is lower case " + MyCharacter.isLowerCase('a'));



		char c =' ';
		System.out.println(c + " is white space " + MyCharacter.isWhitespace(c));

		
		char d='z';
		System.out.println(d + " to upper case " + MyCharacter.toUpperCase(d));
		System.out.println(a + " to lower case " + MyCharacter.toLowerCase(a));
	
		String s = MyCharacter.toString(d);
		System.out.println(s);
		
	}


}
