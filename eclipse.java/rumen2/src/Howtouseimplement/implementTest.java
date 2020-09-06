package Howtouseimplement;
/*
 * 接口内声明的变量为全局常量
 * 接口内声明的变量全为全局常量，声明的方法为抽象方法
 * 两个接口内相同名字的函数实现于一个类中时，重写函数则两个接口同时实现
 * 
 * 
 * java8 接口新特性
 * 除了定义全局变量和抽象方法外，还可以定义静态方法和默认方法
 * 默认方法和静态方法可以拥有函数体
 * 如果实现类中定义了多个接口，且接口中有同名同参的默认方法则报错
 * 接口中定义的静态方法通过接口调用
 * 
 * 
 * 
*/

public interface implementTest {
	//静态方法
	public static void method1() {
		System.out.println("ComparaA");
	}
	//默认方法
	public default void method2() {
		System.out.println("ComparaB");
	}
	
}
