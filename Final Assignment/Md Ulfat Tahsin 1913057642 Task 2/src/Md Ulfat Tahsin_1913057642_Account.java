import java.util.ArrayList;
import java.util.Date;

public class Account {

	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	String name;
	private ArrayList <Transaction> transaction;
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		transaction = new ArrayList<Transaction>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
		transaction = new ArrayList<Transaction>();
	}
	
	Account(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
		transaction = new ArrayList<Transaction>();
	}

	public ArrayList<Transaction> getTransaction() {
		return transaction;
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
		this.annualInterestRate = annualInterestRate/100;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	} 

	public double getMonthlyInterestRate() {
		annualInterestRate/=100;
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest() {
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest;
	}
	
	public void withdraw(double amount) {
		balance-=amount;
		transaction.add(new Transaction('w', amount, balance, "Withdraw from account"));
	}
	
	public void deposit(double amount) {
		balance+=amount;
		transaction.add(new Transaction('d', amount, balance, "Deposited to account"));
	}
}