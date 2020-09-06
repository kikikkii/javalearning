package Proxy;

public class ProxytTest {
	public static void main(String[] args) {
		server a = new server();
		Proxyserver proxyserver = new Proxyserver(a);
		proxyserver.browse();
	}
}
interface Network{
	public void browse();
}
//被代理类
class server implements Network{
	@Override
	public void browse() {
		System.out.println("server browse");
	}
}
//代理类
class Proxyserver implements Network{
	
	private Network work;
	
	public Proxyserver(Network work) {
		this.work=work;
	}
	
	public void check() {
		System.out.println("checking--------------ok!");
	}
	
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		check();
		work.browse();
	}
}