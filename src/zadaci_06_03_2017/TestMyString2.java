package zadaci_06_03_2017;

public class TestMyString2 {

	public static void main(String[] args) {

		MyString2 myString = new MyString2("Abrakadabraka");
		
		String s = "affa";
		
		//System.out.println(myString.compare(s));
		
		MyString2 newMyString = myString.substring(2);
		//newMyString = newMyString.toUpperCase();
		
		char[] chars = newMyString.toChars();
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		
		newMyString = newMyString.toUpperCase();
		System.out.println(newMyString.s);
		
	}

}
