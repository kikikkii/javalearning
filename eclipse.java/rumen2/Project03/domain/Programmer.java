package domain;

import service.Status;

public class Programmer extends Employee implements Equipment{
	private int memberID; //开发团队中的ID
	private Status status = Status.FREE;
	private Equipment equipment;
	
	public Programmer(int iD, String name, int age, double salary,Equipment equipment) {
		super(iD, name, age, salary);
		this.equipment = equipment;
		// TODO Auto-generated constructor stub
	}
	
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getDescrpition() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public int getMemberID() {
		return memberID;
	}
	
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Equipment getEquipment() {
		return equipment;
	}
	
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		return super.toString() + "\t程序员\t" + status.toString() + "\t\t\t" + equipment.getDescrpition();
	}
	public String getDetailsForTeam() {
		return this.memberID + "/" + getID() + "\t" +  getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员\t";
	}
}
