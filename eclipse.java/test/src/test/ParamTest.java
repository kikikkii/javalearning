package test;

public class ParamTest{
	public static void main(String[] args) {
		  ParamTest pt = new ParamTest();
		  pt.sout("Hollis");//实际参数为 Hollis
		}

		public void sout(String name) { //形式参数为 name
		  System.out.println(name);
		}
}