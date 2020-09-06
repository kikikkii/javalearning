package CustomerNeedManager;

public class CustomerView {
	private CustomerList customerlist = new CustomerList(10);
	public CustomerView(){
		Customer customer = new Customer("林必涵", 20, "948677135@qq.com", '男', "18350102800");
		customerlist.addCustomer(customer);
	}
	public void enterMainMenu() {
		
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("----------------客户信息管理软件----------------");
					
			System.out.println("					1 添加客户");
			System.out.println("					2 修改客户");
			System.out.println("					3 删除客户");
			System.out.println("					4 客户列表");
			System.out.println("					5 退       出");
			System.out.println("	请选择(1-5)");
			char menu = CustomerUtility.readMenuSelection();
			switch (menu) {
				case '1':
					this.addNewCustomer();
					break;
				case '2':
					this.modifyCustomer();
					break;
				case '3':
					this.deletCustomer();
					break;
				case '4':
					this.listAllCustomers();
					break;
				case '5':
					System.out.println("确认是否退出?");
					char isExit = CustomerUtility.readConfirmSelection();
					if(isExit == 'Y')
						isFlag = false;
					else 
						break;
			}
		}
	}
	private void addNewCustomer() {
		System.out.println("添加客户的操作");
		System.out.println("-----------------------------------");
		System.out.print("姓名:");
		String name = CustomerUtility.readString(10);
		System.out.print("性别");
		char sex = CustomerUtility.readChar();
		System.out.print("年龄");
		int age = CustomerUtility.readInt();
		System.out.print("电话:");
		String phoneNumber = CustomerUtility.readString(20);
		System.out.print("邮箱");
		String email = CustomerUtility.readString(20);
		Customer customer = new Customer(name, age, email, sex, phoneNumber);
		boolean isFull = this.customerlist.addCustomer(customer);
		if(!isFull) {
			System.out.println("添加失败");
		}else {
			System.out.println("添加成功");
		}
			
	}
	private void modifyCustomer() {
		for(;;) {
			System.out.println("请输入待修改的客户编号(-1退出)");
			int number = CustomerUtility.readInt();
			if(number == -1) {
				break;
			}else if(number > this.customerlist.getTotal()) {
				System.out.println("无法找到该用户");
			}else{
				Customer customer = this.customerlist.getCustomer(number - 1);
				System.out.print("姓名:" + "(" + customer.getName() + ")");
				String name = CustomerUtility.readString(10,customer.getName());
				System.out.print("性别" + "(" + customer.getSex() + ")");
				char sex = CustomerUtility.readChar(customer.getSex());
				System.out.print("年龄" + "(" + customer.getAge() + ")");
				int age = CustomerUtility.readInt(customer.getAge());
				System.out.print("电话:" + "(" + customer.getPhoneNumber() + ")");
				String phoneNumber = CustomerUtility.readString(20,customer.getPhoneNumber());	
				System.out.print("邮箱" + "(" + customer.getEmail() + ")");
				String email = CustomerUtility.readString(20,customer.getEmail());
				Customer newcustomer = new Customer(name, age, email, sex, phoneNumber);
				this.customerlist.replaceCustomer(number - 1, newcustomer);
				System.out.println("修改成功");
			}
		}
	}
	private void deletCustomer() {
		System.out.println("删除客户的操作");
		for(;;) {
			System.out.println("请选择要删除的客户(-1退出):");
			int number = CustomerUtility.readInt();
			if(number == -1) {
				break;
			}else if(number < 0 && number > this.customerlist.getTotal()) {
				System.out.println("输入错误");
			}else {
				this.customerlist.deleteCustomer(number - 1);
			}
		}
	}
	private void listAllCustomers(){
		System.out.println("现实客户列表");
		System.out.println("-------------------------客户列表--------------------------");
		System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱	");
		int total = customerlist.getTotal();
		if(total == 0) {
			System.out.println("没有客户");
		}else {
			Customer[] custs = customerlist.getAllCustomers();
			for (int i = 0; i < custs.length; i++) {
				System.out.println((i + 1) + "\t\t" + custs[i].getName() + "\t\t" +
						custs[i].getSex() + "\t\t" + custs[i].getAge() + "\t\t" + custs[i].getPhoneNumber()
						+ "\t\t\t" + custs[i].getEmail());
			}
		}
		
		
		System.out.println("------------------------客户列表完成-----------------------");
	}
	public static void main(String[] args) {
		CustomerView  view = new CustomerView();
		view.enterMainMenu();
	}
}
