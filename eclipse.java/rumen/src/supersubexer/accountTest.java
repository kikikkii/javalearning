package supersubexer;

import java.util.Random;

public class accountTest {
	public static void main(String[] args) {
		//多态性:
		/*父类的引用指向子类的对象
		 *当调用子父类同名同参数的方法是，实际执行的是子类重写父类的方法
		 *编译时看父类拥有的方法，运行时使用的是子类重写父类的方法
		 * 但无法调用子类特有的方法
		 * 
		 * 对象的多态性只适用于重写的方法，不适用于属性
		 * 
		 * 
		 	*/
		int key = new Random().nextInt(3);
		account ac = new checkaccount(1122, 20000, 0.045,5000);
		ac.withdraw(30000);
		System.out.println("您的账户余额为" + ac.getBalance());
		ac.withdraw(2500);
		System.out.println("您的账户余额为" + ac.getBalance());
		ac.deposit(3000);
		System.out.println("您的账户余额为" + ac.getBalance());
		System.out.println("您的月利率为" + ac.getMonthlyInterest());
	}
}
