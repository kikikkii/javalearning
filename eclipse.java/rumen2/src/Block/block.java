package Block;

/*
 *  类的成员之四:代码块(或初始化块)
 * 作用:用来初始化类或对象
 * 静态方法随着类的加载而加载(并不执行)
 * 静态代码块随着类的加载而执行
 * 若一个类中定义多个静态代码块，则按照声明的先后顺序执行
 * 
 * 非静态代码块随着对象的创建而加载(类似于构造器)
 * 作用:初始化对象
 * 代码块的执行先于构造器
 * 
 * 
 * 先父后子，静态先行,静态代码块比main()更先运行
*/
public class block {
	public static void main(String[] args) {
		String desc = Person.desc;
	}
}
class Person{
	//属性
	String name;
	int age;
	static String desc = "I'a person";
	//构造器
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//代码块
	//静态代码块
	static {//代码块可用static修饰
		System.out.println("Hello static block");
	}
	//不用static修饰
	//非静态代码块
	{
		System.out.println("Hello block");
	}
	
	//方法
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
