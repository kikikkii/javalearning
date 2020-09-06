package faceToObject;
/*
*  
*	成员变量(属性)
*	声明在类里
*
*
*	局部变量
*	声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
*	
*
*	成员变量和局部变量都有其对应的作用域
*
*
*	权限修饰符的不同
*		属性:可以在声明属性时，指明其权限，使用权限修饰符
*		private、public、default、protected
*	局部变量不能使用权限修饰符
*
*
*	类的属性都有默认初始化值
*	局部变量没有默认的初始化值，必须赋值
*
*	引用数据类型(类、数组、接口)	
*
*	属性:加载到heap(堆)中
*	局部变量:加载到stack(栈)中
*
*
*	在方法的使用中可以调用当前类的属性和方法
*	方法里不能再定义方法
*	可变个数形参在方法的形参中必须声明在参数列表的末尾，且只能有一个
*	Tips: static(静态)修饰的方法内部只能调用static方法
*  一般的方法(无static修饰)内部可以调用无static修饰的方法和有static修饰的方法
*  
*	缺省修饰符在不同的包里即使有import(引入)也无法调用	
*	this()可以直接调用构造器，但必须放在第一行
*  
*  
*/

public class UserTest {
	public static void main(String[] args) {
		int a = 0;
		System.out.println(a);
		User[] b = new User[5];
		//b[1] = new String;
		new User().sleep();
		int aa = 1;
		int bb = 2;
		UserTest p =new UserTest();
		p.swap(aa,bb);
		p.swap(1,2,3,4,5,6,7);
		System.out.println("aa: " + aa  + ", bb: " + bb);
	}
	public void swap(int a ,int b) {
		int temp = 0;
		temp = b;
		b = a;
		a = temp;
	}
	public void swap(int ... s) { //可变个数形参
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
	}
	//
}
class User {
	String name;
	int age;
	boolean isMale;
	User(){}
	
	public User(String name) {
		this();
		this.name = name;
		
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	public void say() {
		sleep();
	}
	
}
