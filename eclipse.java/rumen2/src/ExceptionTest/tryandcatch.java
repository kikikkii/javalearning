package ExceptionTest;

import org.junit.Test;

/*
 * 异常的处理,抓抛模型
 * 过程一,"抛",程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个应对异常的对象
 * 				并将此对象抛出
 * 				一旦抛出对象以后,其后的代码就不再执行
 * 
 * 过程二,"抓",可以理解为异常的处理方式;1,try-catch-finally  2,throw
 * 
 * try{
 * 		//可能出现异常的代码
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }
 * ...
 * finally{
 * 		//一定会执行的代码,finally可选
 * }
 * 
 * 
 * 使用try将可能出现异常代码包装起来,在执行过程中,一旦出现异常就生成异常对象,和catch中进行匹配,
 * 一旦匹配成功就跳出当前try-catch,catch中的异常类型如果没有子父类关系则无所谓,如果满足子父类关系
 * 则子类一定要写在父类前
 * 
 * 常用的异常处理方式
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
			System.out.println("这里没有异常");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("数组越界了");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("这里不会执行");
		}
	}
	
	
}
