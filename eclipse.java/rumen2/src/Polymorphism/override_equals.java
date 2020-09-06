package Polymorphism;

public class override_equals {
	public static void main(String[] args) {
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		Object ob1 = new Object();
		Object ob2 = new Object();
		System.out.println(ob1 == ob2);
		System.out.println(ob1.equals(ob2));
		Object ob3 = str1;
		System.out.println(ob3.toString());
	}

}
