package zadaci_09_03_2017;

public class TestLoan {

	public static void main(String[] args) {
		
		try {
			
			Loan loan = new Loan(5, 4, -2);
			
			loan.setLoanAmount(-5);
			
		} catch (Exception e) {
			System.out.println("Illegal");
		}

	}

}
