package ExceptionTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * throws �����׳��쳣,ֱ�����������쳣�ĺ���(����׵�main()����)
 * һ�������쳣�Ͳ�ִ���쳣�����Ĵ���
 * try-catch �����������쳣
 * throws ��û�����������쳣
 * �����쳣����Ĳ���:1��ϵͳ�Զ����ɵ��쳣 2���ֶ�����һ���쳣����,���׳�
 * 
 * 
 */
public class ThrowsTest {
	
	public static void main(String[] args) throws Exception {
		try {
			method2();
		}catch(IOException e){
			e.printStackTrace();
		}
		throw new Exception();
	}
	
	
	@Test
	public static void method2() throws IOException{
		method1();
	}
	
	@Test
	public static void method1() throws FileNotFoundException,IOException{
		FileInputStream fis = null; 
		File file = new File("hello.txt");
		//����ʱ�쳣
		fis = new FileInputStream(file);
		
		fis.close();
	
	}
}
