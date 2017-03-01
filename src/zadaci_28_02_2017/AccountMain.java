package zadaci_28_02_2017;

public class AccountMain {
	
	public static void main(String[] args){
		//test
		
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		
		System.out.println("Date created: " + myAccount.getDateCreated());
		System.out.println("ID: " + myAccount.getId() + "\nBalance: " 
							+ myAccount.getBalance() + "\nMontly interest: " 
							+ myAccount.getMontlyinterest());
		
	}

}
