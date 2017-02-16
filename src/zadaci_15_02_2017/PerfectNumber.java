package zadaci_15_02_2017;

/*
 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih
 * pozitivnih djelilaca, iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni
 * broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4
 * + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite
 * program koji ispisuje sva 4.
 */
public class PerfectNumber {

	// method which print all perfect numbers in range from 1 to 10 000
	private static void printPerfectNumbers() {

		int min = 1;
		int max = 10000;

		for (min = 1; min <= max; min++) {
			int sum = 0;
			int e = 1;
			for (e = 1; e < min; e++) {
				int a = min % e;

				if (a == 0) {
					sum += e;
				}
			}
			if (sum == min) {
				System.out.println(sum);
			}
		}

	}

	public static void main(String[] args) {
		// test
		printPerfectNumbers();
	}

}
