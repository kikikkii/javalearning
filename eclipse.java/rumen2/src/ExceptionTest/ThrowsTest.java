package ExceptionTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * throws 向上抛出异常,直到遇见处理异常的函数(最高抛到main()函数)
 * 一旦生成异常就不执行异常后续的代码
 * try-catch 真正处理了异常
 * throws 并没有真正处理异常
 * 关于异常对象的产生:1、系统自动生成的异常 2、手动生成一个异常对象,并抛出
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
		//编译时异常
		fis = new FileInputStream(file);
		
		fis.close();
	
	}
}
