package faceToObject;

/*
 * 
 * 
 * 
 * 
 * person.cal
 * //���� = ��Ա���� = field = ���ֶ�
 * //���� = ��Ա���� = ���� = method
 * //�����ж���ı������Ǿֲ�����
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
		System.out.println("�˿��ԳԷ�");
	}
	public void sleep() {
		System.out.println("�˿���˯��");
	}
	public void talk(String language) {
		System.out.println("�˿���˵����ʹ�õ���" + language);
	}
	
}
