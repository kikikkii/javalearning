package ExceptionTest;

/*
 * 异常继承于Throwable
 * java.lang.Throwable
 * |-------java.lang.Error
 * |-------java.lang.Exception
 * 		|----编译时异常:执行javac命令时,可能出现的异常
 * 			|------IOException
 * 			|------ClasssNotFoundException
 * 			|------...
 * 		|----运行时异常:执行java.exe,可能出现的异常
 * 			|------NullPointerException
 * 			|------NumberFormatException
 * 			|------ClassCastException    类型不匹配
 * 			|------...
 * 
 * 
 * 
 * Error:java内部虚拟机的严重问题,一般不编写代码进行处理
 * 
 */
public class ExceptionTest {
	//NullPointerException
	public static void main(String[] args) {
		try {
			//int[] arr = null;
			String str = "abc";
			//System.out.println(arr[3]);
			System.out.println(str.charAt(3));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
