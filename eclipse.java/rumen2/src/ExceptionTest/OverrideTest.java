package ExceptionTest;

import java.io.IOException;

/*
 * ������д����֮һ:
 * ������д�ķ����׳����쳣�����ڸ��౻��д�����׳����쳣
 * ������಻��throws�׳��쳣����������д�ķ���Ҳ�޷�ʹ��throws��ֻ����try-catch
 * 
 * 
 */
public class OverrideTest {
	public static void main(String[] args) {
		
	}
	public void display(superclass s) {
		try {
			s.method();
		}catch ( IOException e) {
			// TODO: handle exception
		}
		
	}
}
class superclass{
	public void method() throws IOException{
		
	}
}
class subclass extends superclass{
	@Override
	public void method()  {
		// TODO Auto-generated method stub
	}
}
