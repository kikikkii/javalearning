package Howtouseimplement;

/*
 * 抽象类和接口的相同点、不同点
 * 相同点:不能实例化,都可以被继承
 * 不同点:抽象类有构造器,单继承
 * 接口:不能声明构造器,多继承
 * 
 * 
 * 
*/
public class Subclass implements implementTest {
	public static void main(String[] args) {
		Subclass s = new Subclass();
		//通过实现类的对象可以调用接口中的默认方法，仍可以重写接口中的方法， 
		s.method2();
		implementTest.method1();
		//无视接口中定义的静态方法
		//s.method1()
		//类优先原则,若父类和接口中有同名同参的函数，则优先调用父类的方法
		//
	}
	public void f() {
		//普通函数内调用接口中的默认方法
		implementTest.super.method2();
	}
}
	