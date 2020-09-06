package faceToObject;

/*
 * 
 * 
 * 
 * 
 * person.cal
 * //属性 = 成员变量 = field = 域、字段
 * //方法 = 成员方法 = 函数 = method
 * //方法中定义的变量都是局部变量
 * 
 * 
*/
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 18;
		Person p2 = new Person();
		System.out.println(p2);
		
	}
}
class Person{
	String name;
	int age;
	boolean isMale;
	
	public void eat() {
		System.out.println("人可以吃饭");
	}
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	public void talk(String language) {
		System.out.println("人可以说话，使用的是" + language);
	}
	
}
