package Block;

/*
 *  ��ĳ�Ա֮��:�����(���ʼ����)
 * ����:������ʼ��������
 * ��̬����������ļ��ض�����(����ִ��)
 * ��̬�����������ļ��ض�ִ��
 * ��һ�����ж�������̬����飬�����������Ⱥ�˳��ִ��
 * 
 * �Ǿ�̬��������Ŷ���Ĵ���������(�����ڹ�����)
 * ����:��ʼ������
 * ������ִ�����ڹ�����
 * 
 * 
 * �ȸ����ӣ���̬����,��̬������main()��������
*/
public class block {
	public static void main(String[] args) {
		String desc = Person.desc;
	}
}
class Person{
	//����
	String name;
	int age;
	static String desc = "I'a person";
	//������
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//�����
	//��̬�����
	static {//��������static����
		System.out.println("Hello static block");
	}
	//����static����
	//�Ǿ�̬�����
	{
		System.out.println("Hello block");
	}
	
	//����
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
