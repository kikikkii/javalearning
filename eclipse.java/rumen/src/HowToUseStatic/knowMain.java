package HowToUseStatic;

/*
 *	main方法使用说明:
 *	1.main()方法作为程序的入口
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
