package ExceptionTest;

public class MyException extends Exception {

	/**自定义异常类
	 * 1、继承于现有的异常结构 RuntimeException\Exception
	 * 
	 * throw 手动抛出一个异常/生成一个异常对象
	 * throws 抛出可能产生的异常
	 * 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * public MyException(String message, Throwable cause, boolean
	 * enableSuppression, boolean writableStackTrace) { super(message, cause,
	 * enableSuppression, writableStackTrace); // TODO Auto-generated constructor
	 * stub }
	 */

	/*
	 * public MyException(String message, Throwable cause) { super(message, cause);
	 * // TODO Auto-generated constructor stub }
	 */

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * public MyException(Throwable cause) { super(cause); // TODO Auto-generated
	 * constructor stub }
	 */
	

}
