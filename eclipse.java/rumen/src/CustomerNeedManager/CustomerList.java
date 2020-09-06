package CustomerNeedManager;

public class CustomerList {
	private Customer[] customers;
	private int total = 0;
	
	public CustomerList(int totalCustomer) {
		this.customers = new Customer[totalCustomer];
	}
	public boolean addCustomer(Customer customer){
		if(this.total<this.customers.length) {
			this.customers[this.total++] = customer;
			return true;
		}
		return false;
	}
	public boolean replaceCustomer(int index,Customer cust) {
		if(index < this.total && index >= 0) {
			this.customers[index] = cust;
			return true;
		}
		return false;
	}
	public boolean deleteCustomer(int index) {
		if(index < this.total && index >= 0) {
			for (int i = index; i < this.total-1; i++) {
				this.customers[i] = this.customers[i+1];
			}
			this.customers[--this.total] = null;
			return true;
		}
		return false;
	}
	public Customer[] getAllCustomers() {
		Customer[] cust = new Customer[this.total];
		for (int i = 0; i < cust.length; i++) {
			cust[i] = this.customers[i];
		}
		return cust;
	}
	public Customer getCustomer(int index) {
		if(index < this.total && index >= 0)
			return this.customers[index];
		else
			return null;
	}
	public int getTotal() {
		return this.total;
	}
	
}
