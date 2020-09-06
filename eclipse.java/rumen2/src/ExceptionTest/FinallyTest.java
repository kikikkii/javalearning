package ExceptionTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * һ����ִ�еĴ���finally
 * ��ʹcatch�г����쳣,�����return���,finally�Կ���ִ��
 * 
 * ���ݿ����ӣ������������������socket����Դ��JVM�ǲ����Զ����յģ�Ҫ�ֶ�������Դ�ͷ�
 * �����Ҫfinally
 * 
 * ע:��������������ʱ�쳣�Ƚϳ���������һ�㲻��������ʱ�쳣
 * ��Ա���ʱ�쳣��һ��Ҫ�쳣����
 */
public class FinallyTest {
	@Test
	public void test1(){
		String str = "123";
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		}catch(ArithmeticException e) {
//			e.printStackTrace();
			int[] aa = new int[4];
			System.out.println(aa[4]);
		}finally {
			System.out.println("this is finally");
		}
	}
	@Test
	public void test2() {
		FileInputStream fis = null; 
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Ƕ��try-catch
			try {
				if(fis !=null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
