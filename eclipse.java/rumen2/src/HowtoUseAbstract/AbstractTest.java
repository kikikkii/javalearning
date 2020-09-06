package HowtoUseAbstract;

import java.io.InputStream;

/*
 * 1.abstract修饰类、方法
 * abstract 修饰类:该类无法实例化
 * abstract 修饰方法:抽象方法,在子类中重写
 * 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法
 * 子类必须重写父类的抽象方法
 * 若子类没有重写父类中所有的抽象方法，则此子类也是一个抽象类，需要使用abstract;
 * 
 * 
 * 注意: abstract不能用来修饰属性、构造器
 * 		 abstract不能用来修饰私有方法,静态方法，final修饰的方法
 * 
 * private不能被重写
 * 静态方法不能被重写
 * final 修饰的方法不能被重写，final 修饰的类无法被继承
 * 抽象类一般配合多态性
 * 匿名内部类
 * 
 * 
*/
public class AbstractTest {
	public static void main(String[] args) {
		student s1 = new student();
		/* Person p1 = new Person(); */
		//匿名内部类
		Person p = new Person() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}

abstract class Person {
	String name;
	int age;

	public abstract void eat();
	public void walk() {
		System.out.println("Person walk");
	}
	public Person() {

	}
}

class student extends Person {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Student eat");
	}
	@Override
	public void walk() {
		super.walk();
		System.out.println("Student walk");
	}
}