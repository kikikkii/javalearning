package CustomerNeedManager;

public class CustomerView {
	private CustomerList customerlist = new CustomerList(10);
	public CustomerView(){
		Customer customer = new Customer("�ֱغ�", 20, "948677135@qq.com", '��', "18350102800");
		customerlist.addCustomer(customer);
	}
	public void enterMainMenu() {
		
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("----------------�ͻ���Ϣ�������----------------");
					
			System.out.println("					1 ��ӿͻ�");
			System.out.println("					2 �޸Ŀͻ�");
			System.out.println("					3 ɾ���ͻ�");
			System.out.println("					4 �ͻ��б�");
			System.out.println("					5 ��       ��");
			System.out.println("	��ѡ��(1-5)");
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
					System.out.println("ȷ���Ƿ��˳�?");
					char isExit = CustomerUtility.readConfirmSelection();
					if(isExit == 'Y')
						isFlag = false;
					else 
						break;
			}
		}
	}
	private void addNewCustomer() {
		System.out.println("��ӿͻ��Ĳ���");
		System.out.println("-----------------------------------");
		System.out.print("����:");
		String name = CustomerUtility.readString(10);
		System.out.print("�Ա�");
		char sex = CustomerUtility.readChar();
		System.out.print("����");
		int age = CustomerUtility.readInt();
		System.out.print("�绰:");
		String phoneNumber = CustomerUtility.readString(20);
		System.out.print("����");
		String email = CustomerUtility.readString(20);
		Customer customer = new Customer(name, age, email, sex, phoneNumber);
		boolean isFull = this.customerlist.addCustomer(customer);
		if(!isFull) {
			System.out.println("���ʧ��");
		}else {
			System.out.println("��ӳɹ�");
		}
			
	}
	private void modifyCustomer() {
		for(;;) {
			System.out.println("��������޸ĵĿͻ����(-1�˳�)");
			int number = CustomerUtility.readInt();
			if(number == -1) {
				break;
			}else if(number > this.customerlist.getTotal()) {
				System.out.println("�޷��ҵ����û�");
			}else{
				Customer customer = this.customerlist.getCustomer(number - 1);
				System.out.print("����:" + "(" + customer.getName() + ")");
				String name = CustomerUtility.readString(10,customer.getName());
				System.out.print("�Ա�" + "(" + customer.getSex() + ")");
				char sex = CustomerUtility.readChar(customer.getSex());
				System.out.print("����" + "(" + customer.getAge() + ")");
				int age = CustomerUtility.readInt(customer.getAge());
				System.out.print("�绰:" + "(" + customer.getPhoneNumber() + ")");
				String phoneNumber = CustomerUtility.readString(20,customer.getPhoneNumber());	
				System.out.print("����" + "(" + customer.getEmail() + ")");
				String email = CustomerUtility.readString(20,customer.getEmail());
				Customer newcustomer = new Customer(name, age, email, sex, phoneNumber);
				this.customerlist.replaceCustomer(number - 1, newcustomer);
				System.out.println("�޸ĳɹ�");
			}
		}
	}
	private void deletCustomer() {
		System.out.println("ɾ���ͻ��Ĳ���");
		for(;;) {
			System.out.println("��ѡ��Ҫɾ���Ŀͻ�(-1�˳�):");
			int number = CustomerUtility.readInt();
			if(number == -1) {
				break;
			}else if(number < 0 && number > this.customerlist.getTotal()) {
				System.out.println("�������");
			}else {
				this.customerlist.deleteCustomer(number - 1);
			}
		}
	}
	private void listAllCustomers(){
		System.out.println("��ʵ�ͻ��б�");
		System.out.println("-------------------------�ͻ��б�--------------------------");
		System.out.println("���\t\t����\t\t�Ա�\t\t����\t\t�绰\t\t\t\t����	");
		int total = customerlist.getTotal();
		if(total == 0) {
			System.out.println("û�пͻ�");
		}else {
			Customer[] custs = customerlist.getAllCustomers();
			for (int i = 0; i < custs.length; i++) {
				System.out.println((i + 1) + "\t\t" + custs[i].getName() + "\t\t" +
						custs[i].getSex() + "\t\t" + custs[i].getAge() + "\t\t" + custs[i].getPhoneNumber()
						+ "\t\t\t" + custs[i].getEmail());
			}
		}
		
		
		System.out.println("------------------------�ͻ��б����-----------------------");
	}
	public static void main(String[] args) {
		CustomerView  view = new CustomerView();
		view.enterMainMenu();
	}
}
