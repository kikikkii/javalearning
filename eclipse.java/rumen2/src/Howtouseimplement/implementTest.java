package Howtouseimplement;
/*
 * �ӿ��������ı���Ϊȫ�ֳ���
 * �ӿ��������ı���ȫΪȫ�ֳ����������ķ���Ϊ���󷽷�
 * �����ӿ�����ͬ���ֵĺ���ʵ����һ������ʱ����д�����������ӿ�ͬʱʵ��
 * 
 * 
 * java8 �ӿ�������
 * ���˶���ȫ�ֱ����ͳ��󷽷��⣬�����Զ��徲̬������Ĭ�Ϸ���
 * Ĭ�Ϸ����;�̬��������ӵ�к�����
 * ���ʵ�����ж����˶���ӿڣ��ҽӿ�����ͬ��ͬ�ε�Ĭ�Ϸ����򱨴�
 * �ӿ��ж���ľ�̬����ͨ���ӿڵ���
 * 
 * 
 * 
*/

public interface implementTest {
	//��̬����
	public static void method1() {
		System.out.println("ComparaA");
	}
	//Ĭ�Ϸ���
	public default void method2() {
		System.out.println("ComparaB");
	}
	
}
