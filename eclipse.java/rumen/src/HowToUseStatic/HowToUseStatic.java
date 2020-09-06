package HowToUseStatic;

/*
 * 静态变量区别于实例变量
 * static静态变量随着类的加载而加载
 * stataic 可以修饰 属性，方法，内部类，代码块
 * “类名.属性”调用 static 修饰的属性 
 * 由于类只会加载一次，静态变量也只加载一次,存放于方法区(method area)的静态域中
 * 附:方法区:类的加载信息，静态域，常量池
 * 
 * 静态属性举例: System.out; Math.PI
 * 
 * 静态方法: 随着类的加载而加载
 * 静态方法中，只能调用静态的方法或属性
 * 非静态方法中，可以调用非静态的和静态的
 * 
 * 一个方法和属性是否应该声明为static
 * 工具类中的方法，习惯上声明为static的，如Array,Math
 * 
 * 单例设计模式：在整个软件系统中只存在一个对象实例
 * 《深入浅出设计模式》
 * 
*/
public class HowToUseStatic {
	public static void main(String[] args) {
		Circle ca = new Circle();
		Circle cb = new Circle();
		System.out.println("c1的id  " + ca.getId());
		System.out.println("c2的id  " + cb.getId());
		
		
		
		Bank bank1 = Bank.getInstance();
		
		
		System.out.println();
	}
}
class c1{
	String name;
	int age;
	static String nation = "China"; 
	public static void show() {
		// name = XXX 
		walk();
		c1.walk();
	}
	public static void walk() {
		
	}
}
//static application
class Circle{
	private double radius;
	private int id;
	
	private static int total;
	private static int init = 1001;
	
	public double findArea() {
		return 3.14 * radius * radius;
	}
	public Circle() {
		id = init++;
	}
	public int getId() {
		return this.id;
	}
}
//单例设计模式(singleton)
class Bank{
	//静止外部造对象
	private Bank() {
		
	}
	private static Bank instance = new Bank();
	//提供公共的方法，返回类的对象
	public static Bank getInstance() {
		return instance;
	}
}
//单例设计模式
class Order{
	private Order() {
		
	}
	private static Order instance = null;
	public static Order getInstance() {
		if(instance == null) {
			instance = new Order();
		}
		return instance;
	}
}


