package Howtouseimplement;

public class implementTest3 {
	public static void main(String[] args) {
		P a = new T();
		a.f();
	}
}
interface P {
	default void f() {
		System.out.println("this is a implement function");
	}
}
class T implements P{
	
}