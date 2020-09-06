package supersubexer;

public class account {
	private int id;
	private double balance;
	private double annualInterstRate;
	public account(int id, double balance, double annualInterstRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterstRate = annualInterstRate;
	}
	public account() {}
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
	public double getAnnualInterstRate() {
		return annualInterstRate;
	}
	public void setAnnualInterstRate(double annualInterstRate) {
		this.annualInterstRate = annualInterstRate;
	}
	public double getMonthlyInterest() {
		return this.annualInterstRate/12;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return;
		}
		System.out.println("Óà¶î²»×ã");
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
}
