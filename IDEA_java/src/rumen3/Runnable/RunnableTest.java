package rumen3.Runnable;
/*
 * 创建多线程
 * Runnable:实现Runnable接口
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法:run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
 * 5.通过此对象调用start()
 *
 * 比较Thread和Runnable方式
 * Thread 单继承
 * Runnable 多继承
 * 优先选择，实现Runnable接口的方式
 * 两种方式都需要重写run()方法,将线程要执行的逻辑都写在run()
 * 方法中
 *
 * */

public class RunnableTest {
    public static void main(String[] args) {
        MThread mThread = new MThread();
        Thread t1 = new Thread(mThread);
        t1.start();
    }
}

class MThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}