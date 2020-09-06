package domain;

public class Designer extends Programmer implements Equipment{
	private double bonus;

	public Designer() {
		super();
	}
	

	public Designer(int iD, String name, int age, double salary,Equipment equipment,double bonus) {
		super(iD, name, age, salary,equipment);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}


	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return  getDetails() + "\t设计师\t"  + super.getStatus() + "\t" + bonus + "\t\t" + super.getEquipment().getDescrpition();
	}
	
	public String getDetailsForTeam() {
		return this.getMemberID() + "/" + getID() + "\t" +  getName() + "\t" + getAge() + "\t" + getSalary() + "\t设计师\t" + getBonus();
	}
}
