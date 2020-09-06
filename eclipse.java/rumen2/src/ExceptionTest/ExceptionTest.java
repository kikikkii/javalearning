package ExceptionTest;

/*
 * �쳣�̳���Throwable
 * java.lang.Throwable
 * |-------java.lang.Error
 * |-------java.lang.Exception
 * 		|----����ʱ�쳣:ִ��javac����ʱ,���ܳ��ֵ��쳣
 * 			|------IOException
 * 			|------ClasssNotFoundException
 * 			|------...
 * 		|----����ʱ�쳣:ִ��java.exe,���ܳ��ֵ��쳣
 * 			|------NullPointerException
 * 			|------NumberFormatException
 * 			|------ClassCastException    ���Ͳ�ƥ��
 * 			|------...
 * 
 * 
 * 
 * Error:java�ڲ����������������,һ�㲻��д������д���
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
