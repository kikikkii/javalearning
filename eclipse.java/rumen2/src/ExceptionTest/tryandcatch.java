package ExceptionTest;

import org.junit.Test;

/*
 * �쳣�Ĵ���,ץ��ģ��
 * ����һ,"��",����������ִ�еĹ����У�һ�������쳣���ͻ����쳣���봦����һ��Ӧ���쳣�Ķ���
 * 				�����˶����׳�
 * 				һ���׳������Ժ�,���Ĵ���Ͳ���ִ��
 * 
 * ���̶�,"ץ",�������Ϊ�쳣�Ĵ���ʽ;1,try-catch-finally  2,throw
 * 
 * try{
 * 		//���ܳ����쳣�Ĵ���
 * }catch(�쳣����1 ������1){
 * 		//�����쳣�ķ�ʽ1
 * }catch(�쳣����2 ������2){
 * 		//�����쳣�ķ�ʽ2
 * }
 * ...
 * finally{
 * 		//һ����ִ�еĴ���,finally��ѡ
 * }
 * 
 * 
 * ʹ��try�����ܳ����쳣�����װ����,��ִ�й�����,һ�������쳣�������쳣����,��catch�н���ƥ��,
 * һ��ƥ��ɹ���������ǰtry-catch,catch�е��쳣�������û���Ӹ����ϵ������ν,��������Ӹ����ϵ
 * ������һ��Ҫд�ڸ���ǰ
 * 
 * ���õ��쳣����ʽ
 * 1.e.getMessage
 * 2.printStackTrace
 * 
 */


public class tryandcatch {
	@Test
	public void test1(){
		String str = "123";
		try {
			System.out.println(str.charAt(3));
			System.out.println("����û���쳣");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("����Խ����");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("���ﲻ��ִ��");
		}
	}
	
	
}
