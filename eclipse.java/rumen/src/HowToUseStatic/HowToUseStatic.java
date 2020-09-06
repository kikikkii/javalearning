package HowToUseStatic;

/*
 * ��̬����������ʵ������
 * static��̬����������ļ��ض�����
 * stataic �������� ���ԣ��������ڲ��࣬�����
 * ������.���ԡ����� static ���ε����� 
 * ������ֻ�����һ�Σ���̬����Ҳֻ����һ��,����ڷ�����(method area)�ľ�̬����
 * ��:������:��ļ�����Ϣ����̬�򣬳�����
 * 
 * ��̬���Ծ���: System.out; Math.PI
 * 
 * ��̬����: ������ļ��ض�����
 * ��̬�����У�ֻ�ܵ��þ�̬�ķ���������
 * �Ǿ�̬�����У����Ե��÷Ǿ�̬�ĺ;�̬��
 * 
 * һ�������������Ƿ�Ӧ������Ϊstatic
 * �������еķ�����ϰ��������Ϊstatic�ģ���Array,Math
 * 
 * �������ģʽ�����������ϵͳ��ֻ����һ������ʵ��
 * ������ǳ�����ģʽ��
 * 
*/
public class HowToUseStatic {
	public static void main(String[] args) {
		Circle ca = new Circle();
		Circle cb = new Circle();
		System.out.println("c1��id  " + ca.getId());
		System.out.println("c2��id  " + cb.getId());
		
		
		
		Bank bank1 = Bank.getInstance();
		
		
		System.out.println();
	}
}
class c1{
	String name;
	int age;
	static String nation = "China"; 
	public static void show() {
		// name = XXX 
		walk();
		c1.walk();
	}
	public static void walk() {
		
	}
}
//static application
class Circle{
	private double radius;
	private int id;
	
	private static int total;
	private static int init = 1001;
	
	public double findArea() {
		return 3.14 * radius * radius;
	}
	public Circle() {
		id = init++;
	}
	public int getId() {
		return this.id;
	}
}
//�������ģʽ(singleton)
class Bank{
	//��ֹ�ⲿ�����
	private Bank() {
		
	}
	private static Bank instance = new Bank();
	//�ṩ�����ķ�����������Ķ���
	public static Bank getInstance() {
		return instance;
	}
}
//�������ģʽ
class Order{
	private Order() {
		
	}
	private static Order instance = null;
	public static Order getInstance() {
		if(instance == null) {
			instance = new Order();
		}
		return instance;
	}
}


