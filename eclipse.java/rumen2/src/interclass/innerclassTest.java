package interclass;

import interclass.inner.DD;

/*
 * �ڲ���:
 * java��������A��������B�У�����A�ͳ�Ϊ�ڲ��࣬BΪ�ⲿ��
 * 
 * �ڲ���ķ���:��Ա�ڲ��࣬�ֲ��ڲ���(�����ڡ�������ڡ���������)
 * 
 * ��Ա�ڲ���:
 * 	һ���棬��Ϊ�ⲿ��ĳ�Ա
 * 1�������ⲿ��Ľṹ
 * 2�����Ա�static ����
 * 3�� ���Ա�4�ֲ�ͬȨ������(private��public��default��protected)
 * ��һ����,��Ϊ��:
 * 1�����ڿ��Զ������Է�����������
 * 2��������final����
 * 3�����Ա�abstract����
 * 
 * ���ʵ������Ա�ڲ���
 * 
*/
public class innerclassTest {
	public static void main(String[] args) {
		innerclassTest tt = new innerclassTest();
		//��̬�ڲ����ʵ����
		DD dd = new inner.DD();
		//�Ǿ�̬�ڲ����ʵ����
		inner i = new inner();
		inner.EE e = i.new EE();
		e.EEf();
	}
}
class inner{
	String name;
	//��̬��Ա�ڲ���
	static class DD{
		
	}
	//��Ա�ڲ���
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
	//�ֲ��ڲ���
	//������
	public void method() {
		class AA{
			
		}
	}
	//�������
	{
		class BB{
			
		}
	}
	//��������
	public  inner() {
		class CC{
			
		}
	}	
}