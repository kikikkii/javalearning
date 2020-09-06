package interclass;

import interclass.inner.DD;

/*
 * 内部类:
 * java中允许将类A声明在类B中，则类A就称为内部类，B为外部类
 * 
 * 内部类的分类:成员内部类，局部内部类(方法内、代码块内、构造器内)
 * 
 * 成员内部类:
 * 	一方面，作为外部类的成员
 * 1、调用外部类的结构
 * 2、可以被static 修饰
 * 3、 可以被4种不同权限修饰(private、public、default、protected)
 * 另一方面,作为类:
 * 1、类内可以定义属性方法、构造器
 * 2、可以用final修饰
 * 3、可以被abstract修饰
 * 
 * 如何实例化成员内部类
 * 
*/
public class innerclassTest {
	public static void main(String[] args) {
		innerclassTest tt = new innerclassTest();
		//静态内部类的实例化
		DD dd = new inner.DD();
		//非静态内部类的实例化
		inner i = new inner();
		inner.EE e = i.new EE();
		e.EEf();
	}
}
class inner{
	String name;
	//静态成员内部类
	static class DD{
		
	}
	//成员内部类
	class EE{
		String name;
		public void EEf(){
			System.out.println("this is innerclass EE");
		}
		public void display(String name) {
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(inner.this.name);
		}
	}
	//局部内部类
	//方法内
	public void method() {
		class AA{
			
		}
	}
	//代码块内
	{
		class BB{
			
		}
	}
	//构造器内
	public  inner() {
		class CC{
			
		}
	}	
}