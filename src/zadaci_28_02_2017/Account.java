package zadaci_28_02_2017;

import java.sql.Date;

public class Account {
	
	private int id; 
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//set fields on default values
	public Account() {
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 0.0;
		this.dateCreated = new Date(System.currentTimeMillis());
	}

	//set id and balance for user
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0.0;
		this.dateCreated = new Date(System.currentTimeMillis());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	private double getMontlyinterestRate(){
		
		return (this.annualInterestRate / 12) / 100;
		
	}
	
	public double getMontlyinterest(){
		
		return balance * getMontlyinterestRate();		
	}
	
	
	//withdraw money from account
	public void withdraw(double amounth){
		this.balance-=amounth;
	}
	
	//deposit money in account
	public void deposit(double amounth){
		this.balance+=amounth;
	}
	
	
}
