package howToUseInstanceof;

/*
 * 多态性父类引用子类时，无法调用子类方法
 * 有了对象的多态性以后，内存中实际是加载了子类特有的属性和方法，但是由于
 * 变量声明为父类类型，导致编译时只能调用父类中声明的属性和方法。子类特有的属性
 * 和方法不能调用。
 * 利用强制类型转换符
 * 例:Student->Person 多态/向上转型
 * Person->Student 向下转型
 * 强制类型转换具有风险:可能出现异常:ClassCastException
 * 利用Instanceof可以判断是否能够强制转换
 * a instanceof A 判断对象a是否是类A的实例，是返回true，否返回false
 * 
 *  
 * 
*/
public class Instanceoftest {
	public static void main(String[] args) {
		
	}
}
class Person{
	public void eat() {
		
	}
	public void walk() {
		
	}
}