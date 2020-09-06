package CustomerNeedManager;

public class Customer {
	private String name;
	private int age;
	private String email;
	private char sex;
	private String phoneNumber;	
	public Customer(String name, int age, String email, char sex, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
	}
	//get and set
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer() {
	}
	
}
