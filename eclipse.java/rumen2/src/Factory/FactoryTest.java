package Factory;

/*
 * ����ģʽ:�򵥹���ģʽ����������ģʽ
 * ʵ�ִ����ߺ͵����߷���
 * �򵥹���ȱ��:���ӹ������ѣ����޸Ĵ����޷���չ
 * ��������ģʽ:
*/

public class FactoryTest {
	public static void main(String[] args) {
		new carfactory();
		car a = carfactory.getcar("BDY");
	}
}
interface car{
	void run();
}
//��
class BDY implements car{

	@Override
	public void run() {
		System.out.println("BDY run");
	}
	
}
class audi implements car{

	@Override
	public void run() {
		System.out.println("audi run");
	}

}
//�򵥹���
class carfactory {
	public static car getcar(String type) {
		if("audi".equals(type)) {
			return new audi();
		}else if("BDY".equals(type)) {
			return new BDY();
		}else {
			return null;
		}
	}
}
//��������
interface Factory{
	car getcar();
}


