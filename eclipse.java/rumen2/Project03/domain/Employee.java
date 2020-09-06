package domain;
/*
 * domain模块为Employee及其子类等javaBean类所在的包
 * 	
 * 
 */
public class Employee {
	private int ID;
	private String name;
	private int age;
	private double salary;
	public Employee(int iD, String name, int age, double salary) {
		super();
		this.ID = iD;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDetails() {
		return  ID + "\t" + name + "\t" + age + "\t" + salary;
	}
	
	@Override
	public String toString() {
		return this.getDetails();
	}
	

}
