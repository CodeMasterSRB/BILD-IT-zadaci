package zadaci_03_03_2017;

public class DisplayingThePrimeNumbers {
	
	// is prime or not
		private static boolean isPrime(int number) {
			
			if(number <= 1 ){
				return false;
			}
			
			int sqrt = (int) Math.sqrt(number) + 1;
			for (int i = 2; i < sqrt; i++) {
				if (number % i == 0) {
					return false; // number is not prime
				}
			}
			return true; // number is prime
		}


	public static void main(String[] args) {
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 1; i <= 120; i++) {
			
			if (isPrime(i)) {
				stack.push(i);
			}
			
		}
		
		 while (!stack.empty())
		      System.out.print(stack.pop() + " ");

	}

}
