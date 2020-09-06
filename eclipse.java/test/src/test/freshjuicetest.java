package test;
import java.io.*;

class freshjuice {
	enum freshjuicesize{ small,medium,large}
	freshjuicesize size;
}

public class freshjuicetest{
	public static void main(String []args) {
		freshjuice juice =new freshjuice();
		juice.size=freshjuice.freshjuicesize.medium;
		System.out.println(juice.size);
	}
}
