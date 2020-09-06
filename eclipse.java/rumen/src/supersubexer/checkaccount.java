package supersubexer;

public class checkaccount extends account{
	private double overdraft;
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(getBalance() >= amount) {
			super.withdraw(amount);
		}else if(overdraft >= amount - getBalance()){
			overdraft -= (amount - getBalance());
			setBalance(0);
			
		}else {
			System.out.println("超过可透支限额");
		}
	}
	public checkaccount(int id, double balance, double annualInterstRate,double overdraft) {
		super(id, balance, annualInterstRate);
		this.overdraft = overdraft;
	}
}
