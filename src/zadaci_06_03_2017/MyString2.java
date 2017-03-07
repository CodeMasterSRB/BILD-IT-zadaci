package zadaci_06_03_2017;

public class MyString2 {

	String s;

	public MyString2(String s) {
		this.s = s;
	}

	/**
	 * Compare two strings
	 * 
	 * @param s
	 * @return
	 */
	public int compare(String s) {
		int index = 0;
		if (this.s.length() < s.length())
			index = -1;
		if (s.length() < this.s.length())
			index = 1;

		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) < s.charAt(i))
				index = -(i + 1);
			if (this.s.charAt(i) > s.charAt(i))
				index = i + 1;
		}
		return index;
	}

	/**
	 * Create new MyString2 from substring
	 * 
	 * @param begin
	 * @return
	 */
	public MyString2 substring(int begin) {
		String string = "";

		for (int i = begin; i < this.s.length(); i++) {

			string += s.charAt(i);

		}

		return new MyString2(string);
	}

	/**
	 * Return new MyString2 with letters of s converted to uppercase
	 * 
	 * @return
	 */
	public MyString2 toUpperCase() {

		String string = "";

		for (int i = 0; i < s.length(); i++) {

			string += Character.toUpperCase(s.charAt(i));

		}

		return new MyString2(string);

	}

	/**
	 * Convert s to char Array
	 * 
	 * @return
	 */
	public char[] toChars() {

		char[] chars = new char[s.length()];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = s.charAt(i);
		}

		return chars;

	}

	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}

}
