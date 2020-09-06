package rumen;

import java.util.Scanner;

public class variable {
	public static int print(int i)
	{
		if(i<5) {
			System.out.println(i);
			print(++i);
			
		}
		return i;
	}
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}
	}
}
