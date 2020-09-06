package HowtoUseAbstract;

import java.io.InputStream;

/*
 * 1.abstract�����ࡢ����
 * abstract ������:�����޷�ʵ����
 * abstract ���η���:���󷽷�,����������д
 * �������󷽷����࣬һ����һ�������ࡣ��֮���������п���û�г��󷽷�
 * ���������д����ĳ��󷽷�
 * ������û����д���������еĳ��󷽷����������Ҳ��һ�������࣬��Ҫʹ��abstract;
 * 
 * 
 * ע��: abstract���������������ԡ�������
 * 		 abstract������������˽�з���,��̬������final���εķ���
 * 
 * private���ܱ���д
 * ��̬�������ܱ���д
 * final ���εķ������ܱ���д��final ���ε����޷����̳�
 * ������һ����϶�̬��
 * �����ڲ���
 * 
 * 
*/
public class AbstractTest {
	public static void main(String[] args) {
		student s1 = new student();
		/* Person p1 = new Person(); */
		//�����ڲ���
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