package zadaci_06_03_2017;

public class MyCharacter {

	/**
	 * Determines whether the specified char value is a letter.
	 * 
	 * @param c
	 * @return
	 */
	public static boolean isLetter(char c) {

		if ((c >= 65 && c <= 95) || (c >= 97 && c <= 122)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Determines whether the specified char value is a digit.
	 * 
	 * @param c
	 * @return
	 */
	public static boolean isDigit(char c) {

		if ((c >= 48 && c <= 57)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Determines whether the specified char value is white space.
	 * 
	 * @param c
	 * @return
	 */
	public static boolean isWhitespace(char c) {

		if (c == 32) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Determines whether the specified char value is uppercase.
	 * 
	 * @param c
	 * @return
	 */
	public static boolean isUpperCase(char c) {

		if ((c >= 65 && c <= 95)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isLowerCase(char c) {

		if ((c >= 97 && c <= 122)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Returns the uppercase form of the specified char value
	 * 
	 * @param c
	 * @return
	 */
	public static char toUpperCase(char c) {

		if (isUpperCase(c)) {
			return c;
		} else {
			return (char) (c - 32);
		}
	}
	
	/**
	 * Returns the lowercase form of the specified char value.
	 * @param c
	 * @return
	 */
	public static char toLowerCase(char c) {

		if (isLowerCase(c)) {
			return c;
		} else {
			return (char) (c + 32);
		}
	}
	
	public static String toString(char c){
		String s = "" + c;
		return s;
	}
}
