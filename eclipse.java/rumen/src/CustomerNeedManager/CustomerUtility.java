package CustomerNeedManager;

import java.util.*;

public class CustomerUtility {
	public static Scanner scanner =new Scanner(System.in);
	
	public static char readMenuSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1,false);
			c= str.charAt(0);
			if(c != '1' && c != '2' && c != '3' &&
				c != '4' && c != '5') {
				System.out.println("ѡ���������������");
			}else break;
		}
		return c;
	}
	
	public static char readChar() {
		String str = readKeyBoard(1, false);
		return str.charAt(0);
	}
	//�޸��Ա�
	public static char readChar(char defaultValue) {
		String str = readKeyBoard(1, true);
		return (str.length() == 0) ? defaultValue : str.charAt(0); 
	}
	//����
	public static int readInt() {
		int n;
		for(;;) {
			String str = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(str);
				break;
			}catch (NumberFormatException e) {
				System.out.println("���������������������:");
			}
		}
		return n;
	}
	//�޸�����
	public static int readInt(int defaultValue) {
		int n;
		for(;;) {
			String str = readKeyBoard(2,true);
			if(str.equals("")) {
				return defaultValue;
			}
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e) {
				System.out.println("��������������������룬");
			}
		}
		return n;
	}
	//�绰�������
	public static  String readString(int limit) {
		return readKeyBoard(limit,false);
	}
	//�޸ĵ绰������
	public static String readString(int limit, String defaultValue) {
		String str = readKeyBoard(limit, true);
		return str.equals("") ? defaultValue :str ;
	}
	//ȷ������Y/N
	public static char readConfirmSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false);
			c = str.charAt(0);
			if(c == 'Y' || c == 'N' || c == 'y' || c == 'n') {
				break;
			}else {
				System.out.println("ѡ��������������룬");
			}
		}
		return c;
	}
	private static String readKeyBoard(int limit,boolean blankReturn) {
		String line = "";
		
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			if(line.length() == 0) {
				if(blankReturn) return line;
				else continue;
			}
			
			if(line.length() < 1 || line.length() > limit) {
				System.out.println("���볤�ȣ�������" + limit + ")��������������");
				continue;
			}
			break;
		}
		return line;
	}
}
