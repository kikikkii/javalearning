package Howtouseimplement;

/*
 * ������ͽӿڵ���ͬ�㡢��ͬ��
 * ��ͬ��:����ʵ����,�����Ա��̳�
 * ��ͬ��:�������й�����,���̳�
 * �ӿ�:��������������,��̳�
 * 
 * 
 * 
*/
public class Subclass implements implementTest {
	public static void main(String[] args) {
		Subclass s = new Subclass();
		//ͨ��ʵ����Ķ�����Ե��ýӿ��е�Ĭ�Ϸ������Կ�����д�ӿ��еķ����� 
		s.method2();
		implementTest.method1();
		//���ӽӿ��ж���ľ�̬����
		//s.method1()
		//������ԭ��,������ͽӿ�����ͬ��ͬ�εĺ����������ȵ��ø���ķ���
		//
	}
	public void f() {
		//��ͨ�����ڵ��ýӿ��е�Ĭ�Ϸ���
		implementTest.super.method2();
	}
}
	