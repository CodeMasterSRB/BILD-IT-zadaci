package hangman;

public class HangMan {

	/**
	 * hangs
	 */
	public void printBasic() {
		for (int i = 0; i < 12; i++) {
			System.out.print("_");
		}

		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.println("|\t   |");
		}
	}

	/**
	 * print empty hangs
	 */
	public void printHang0() {

		printBasic();

		for (int i = 0; i < 10; i++) {
			System.out.println("|");
		}

	}

	/**
	 * add head
	 */
	public void printHang1() {

		printBasic();

		for (int i = 0; i < 10; i++) {
			System.out.print("|");

			if (i == 0) {
				System.out.print("\t  ____");
			} else if (i == 1) {
				System.out.print("\t  |  |");
			} else if (i == 2) {
				System.out.print("\t  ¯¯¯¯");
			}

			System.out.println();
		}

	}

	/**
	 * add body
	 */
	public void printHang2() {

		printBasic();

		for (int i = 0; i < 10; i++) {
			System.out.print("|");

			if (i == 0) {
				System.out.print("\t  ____");
			} else if (i == 1) {
				System.out.print("\t  |  |");
			} else if (i == 2) {
				System.out.print("\t  ¯¯¯¯");
			} else if (i == 3) {
				System.out.print("\t   []");
			} else if (i == 4) {
				System.out.print("\t   []");
			} else if (i == 5) {
				System.out.print("\t   []");
			}

			System.out.println();
		}

	}

	/**
	 * add left arm
	 */
	public void printHang3() {

		printBasic();

		for (int i = 0; i < 10; i++) {
			System.out.print("|");

			if (i == 0) {
				System.out.print("\t  ____");
			} else if (i == 1) {
				System.out.print("\t  |  |");
			} else if (i == 2) {
				System.out.print("\t  ¯¯¯¯");
			} else if (i == 3) {
				System.out.print("\t___[]");
			} else if (i == 4) {
				System.out.print("\t   []");
			} else if (i == 5) {
				System.out.print("\t   []");
			}

			System.out.println();
		}

	}
	
	/**
	 * add right arm
	 */
	public void printHang4() {

		printBasic();

		for (int i = 0; i < 10; i++) {
			System.out.print("|");

			if (i == 0) {
				System.out.print("\t  ____");
			} else if (i == 1) {
				System.out.print("\t  |  |");
			} else if (i == 2) {
				System.out.print("\t  ¯¯¯¯");
			} else if (i == 3) {
				System.out.print("\t___[]___");
			} else if (i == 4) {
				System.out.print("\t   []");
			} else if (i == 5) {
				System.out.print("\t   []");
			}

			System.out.println();
		}

	}
	
	
	/**
	 * add left leg
	 */
	public void printHang5(){
		printBasic();

		for (int i = 0; i < 10; i++) {
			System.out.print("|");

			if (i == 0) {
				System.out.print("\t  ____");
			} else if (i == 1) {
				System.out.print("\t  |  |");
			} else if (i == 2) {
				System.out.print("\t  ¯¯¯¯");
			} else if (i == 3) {
				System.out.print("\t___[]___");
			} else if (i == 4) {
				System.out.print("\t   []");
			} else if (i == 5) {
				System.out.print("\t   []");
			} else if (i == 6) {
				System.out.print("\t  /");
			}

			System.out.println();
		}

	}
	
	/**
	 * add right leg
	 */
	public void printHang6(){
		printBasic();

		for (int i = 0; i < 10; i++) {
			System.out.print("|");

			if (i == 0) {
				System.out.print("\t  ____");
			} else if (i == 1) {
				System.out.print("\t  |  |");
			} else if (i == 2) {
				System.out.print("\t  ¯¯¯¯");
			} else if (i == 3) {
				System.out.print("\t___[]___");
			} else if (i == 4) {
				System.out.print("\t   []");
			} else if (i == 5) {
				System.out.print("\t   []");
			} else if (i == 6) {
				System.out.print("\t  /  \\");
			}

			System.out.println();
		}

	}
	
	/**
	 * print hangs for every mistake
	 * @param counter
	 */
	public void print(int counter){
		if (counter == 0) {
			printHang1();
		} else if (counter == 1) {
			printHang2();
		}else if (counter == 2){
			printHang3();
		}else if(counter == 3){
			printHang4();
		}else if (counter == 4){
			printHang5();
		}else {
			printHang6();
		}
	}

}
