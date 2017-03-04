package zadaci_03_03_2017;

public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger integer = new MyInteger(50);
		System.out.println("Is prime :" +integer.isPrime(45));
		
		System.out.println("Is even :" + MyInteger.isEven(45));
		
		System.out.println("Is even :" + MyInteger.isOdd(45));

		
		integer.name = "Sasa";
		System.out.println(integer.name);
		
		MyInteger newInteger = new MyInteger(40);
		System.out.println(newInteger.name);
	}

}
