package ExceptionTest;

import java.io.IOException;

/*
 * 方法重写规则之一:
 * 子类重写的方法抛出的异常不大于父类被重写方法抛出的异常
 * 如果父类不用throws抛出异常，则子类重写的方法也无法使用throws。只能用try-catch
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
