package HowToUsefinal;

/*
 *	final 可以用来修饰类、方法、变量 
 * 
 * final修饰类 : 该类无法被继承
 * 	比如:String、System、stringBUffer
 * final 修饰方法:该方法无法重写
 * final 修饰变量: 变量成为常量
 * 	final 修饰属性: 可以在构造器中初始化，代码块中初始化,显示初始化
 * 	final 修饰形参: 形参无法改变
 * 
 * static final: 用来修饰属性:全局常量 
 * 
 * 
*/
public class finaltest {

}
final class FA{
	
}
/*
 * class FB extends FA{
 * 
 * }
 */
class FC{
	final void show() {
		
	}
}
class FD extends FC{
	/*
	 * void show() {
	 * 
	 * }
	 */
}