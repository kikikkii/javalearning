package ExceptionTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * 一定会执行的代码finally
 * 即使catch中出现异常,或出现return语句,finally仍可以执行
 * 
 * 数据库连接，输入输出流，网络编程socket等资源，JVM是不能自动回收的，要手动进行资源释放
 * 因此需要finally
 * 
 * 注:开发中由于运行时异常比较常见，所以一般不处理运行时异常
 * 针对编译时异常，一定要异常处理，
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
			//嵌套try-catch
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
