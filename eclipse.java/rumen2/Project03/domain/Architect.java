package domain;

public class Architect extends Designer implements Equipment{
	private int stock;//股票
	

	public Architect(int iD, String name, int age, double salary,Equipment equipment, double bonus,int stock) {
		super(iD, name, age, salary,equipment, bonus);
		this.stock = stock;
		// TODO Auto-generated constructor stub
	}

	public Architect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + this.stock + "\t" + super.getEquipment().getDescrpition();
	}
	public String getDetailsForTeam() {
		return this.getMemberID() + "/" + getID() + "\t" +  getName() + "\t" + getAge() + "\t" + getSalary() + "\t架构师\t" + getBonus() + "\t" + getStock();
	}
}
