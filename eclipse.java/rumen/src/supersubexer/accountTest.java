package supersubexer;

import java.util.Random;

public class accountTest {
	public static void main(String[] args) {
		//��̬��:
		/*���������ָ������Ķ���
		 *�������Ӹ���ͬ��ͬ�����ķ����ǣ�ʵ��ִ�е���������д����ķ���
		 *����ʱ������ӵ�еķ���������ʱʹ�õ���������д����ķ���
		 * ���޷������������еķ���
		 * 
		 * ����Ķ�̬��ֻ��������д�ķ�����������������
		 * 
		 * 
		 	*/
		int key = new Random().nextInt(3);
		account ac = new checkaccount(1122, 20000, 0.045,5000);
		ac.withdraw(30000);
		System.out.println("�����˻����Ϊ" + ac.getBalance());
		ac.withdraw(2500);
		System.out.println("�����˻����Ϊ" + ac.getBalance());
		ac.deposit(3000);
		System.out.println("�����˻����Ϊ" + ac.getBalance());
		System.out.println("����������Ϊ" + ac.getMonthlyInterest());
	}
}
