package HowToUseStatic;

/*
 *	main����ʹ��˵��:
 *	1.main()������Ϊ��������
 *	2.main()
 * 
 * 
 * 
 * 
 */
public class knowMain {
	public static void main(String[] args) {
		Main.main(new String[100]);
		
	}
}
class Main{
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			args[i] = "args_" + i;
			System.out.println(args[i]);
			
		}
	}
}
