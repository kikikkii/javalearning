package faceToObject;
/*
*  
*	��Ա����(����)
*	����������
*
*
*	�ֲ�����
*	�����ڷ����ڡ������βΡ�������ڡ��������βΡ��������ڲ��ı���
*	
*
*	��Ա�����;ֲ������������Ӧ��������
*
*
*	Ȩ�����η��Ĳ�ͬ
*		����:��������������ʱ��ָ����Ȩ�ޣ�ʹ��Ȩ�����η�
*		private��public��default��protected
*	�ֲ���������ʹ��Ȩ�����η�
*
*
*	������Զ���Ĭ�ϳ�ʼ��ֵ
*	�ֲ�����û��Ĭ�ϵĳ�ʼ��ֵ�����븳ֵ
*
*	������������(�ࡢ���顢�ӿ�)	
*
*	����:���ص�heap(��)��
*	�ֲ�����:���ص�stack(ջ)��
*
*
*	�ڷ�����ʹ���п��Ե��õ�ǰ������Ժͷ���
*	�����ﲻ���ٶ��巽��
*	�ɱ�����β��ڷ������β��б��������ڲ����б��ĩβ����ֻ����һ��
*	Tips: static(��̬)���εķ����ڲ�ֻ�ܵ���static����
*  һ��ķ���(��static����)�ڲ����Ե�����static���εķ�������static���εķ���
*  
*	ȱʡ���η��ڲ�ͬ�İ��Ｔʹ��import(����)Ҳ�޷�����	
*	this()����ֱ�ӵ��ù���������������ڵ�һ��
*  
*  
*/

public class UserTest {
	public static void main(String[] args) {
		int a = 0;
		System.out.println(a);
		User[] b = new User[5];
		//b[1] = new String;
		new User().sleep();
		int aa = 1;
		int bb = 2;
		UserTest p =new UserTest();
		p.swap(aa,bb);
		p.swap(1,2,3,4,5,6,7);
		System.out.println("aa: " + aa  + ", bb: " + bb);
	}
	public void swap(int a ,int b) {
		int temp = 0;
		temp = b;
		b = a;
		a = temp;
	}
	public void swap(int ... s) { //�ɱ�����β�
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
	}
	//
}
class User {
	String name;
	int age;
	boolean isMale;
	User(){}
	
	public User(String name) {
		this();
		this.name = name;
		
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	public void say() {
		sleep();
	}
	
}
