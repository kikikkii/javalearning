package Wrapper_class;

import org.junit.Test;

public class test {
	@Test
	public void test1() {
		int i = 10;
		Integer int1 = new Integer("123");
		System.out.println(int1.toString());
	}
	//�����������͡���װ��---->String
	@Test
	public void test2() {
		//��ʽ1:��������
		int num1 = 10;
		String str1 = num1 + "";
		System.out.println(str1.toString());
		//��ʽ2:
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
	}
	//String---->�����������͡���װ��    parsexxxx()
	/**
	 * 
	 */
	@Test
	public void test3() {
		String str3 = "12345";
		int i = Integer.parseInt(str3);
		
	}
}
