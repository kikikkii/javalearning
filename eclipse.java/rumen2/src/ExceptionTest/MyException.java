package ExceptionTest;

public class MyException extends Exception {

	/**�Զ����쳣��
	 * 1���̳������е��쳣�ṹ RuntimeException\Exception
	 * 
	 * throw �ֶ��׳�һ���쳣/����һ���쳣����
	 * throws �׳����ܲ������쳣
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
