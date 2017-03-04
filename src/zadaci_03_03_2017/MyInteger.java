package zadaci_03_03_2017;

public class MyInteger {
	
	
	private int value;
	public String name = "marko";

	/**
	 * A constructor that creates a MyInteger 
	 * object for the specified int value.
	 * @param value
	 */
	public MyInteger(int value) {
		this.value = value;
	}
	
	public boolean isEven(){
		
		if (this.value % 2 == 0) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean isOdd(){
		if (this.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean isPrime() {

		int sqrt = (int) Math.sqrt(this.value) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (this.value % i == 0 || this.value == 0 || this.value == 1) {
				return false;
			}
		}
		return true;

	}
	
	public static boolean isEven(int newValue){
		
		if (newValue % 2 == 0) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public static boolean isOdd(int newValue){
		if (newValue % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean isPrime(int newValue) {

		int sqrt = (int) Math.sqrt(this.value) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (newValue % i == 0 || newValue == 0 || newValue == 1) {
				return false;
			}
		}
		return true;

	}


}
