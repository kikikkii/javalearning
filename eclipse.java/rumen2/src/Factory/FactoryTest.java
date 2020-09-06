package Factory;

/*
 * 工厂模式:简单工厂模式、工厂方法模式
 * 实现创建者和调用者分离
 * 简单工厂缺点:增加功能困难，不修改代码无法扩展
 * 工厂方法模式:
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
//车
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
//简单工厂
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
//工厂方法
interface Factory{
	car getcar();
}


