package zadaci_06_03_2017;

public class TestMyString {

	
	public static void main(String[] args){
		
		 char[] chars ={'a','b','c','d'};
		 MyString1 myString = new MyString1(chars);
		
		System.out.println(myString.charAt(2));
		System.out.println(myString.length());
		
		MyString1 newString = myString.subString(1, 3);
		
		System.out.println(myString.equals(newString));

		
	}

}
