package rumen3.Thread;

/*
 * 一个进程中可以分为多个线程
 * 每个线程都有独立的栈和独立的计数器,共享堆和方法区
 * 一个java.exe程序至少有3个线程：main()主线程，gc()垃圾回收线程，异常处理线程
 *java.lang.Thread
 *
 * main方法就是一条线程
 *线程创建 --> 启动
 *
 * */
/*多线程的创建
 *   方式一：继承于Thread类
 *       1.创建一个继承于Thread类的子类
 *       2.重写Thread类的run()方法 --> 将此线程执行的操作声明在run()方法中
 *       3.创建thread类的子类的对象
 *       4.通过此对象调用start()方法
 *       start():使得线程开始执行,java虚拟机开始调用当前线程的run()方法
 *       单独调用run()方法无法开启线程
 *       一个线程只能start()一次
 * */
class aThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        aThread t1 = new aThread();
        t1.start();
        aThread t2 = new aThread();
        t2.start();
        for (int i = 0; i < 100 ; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

    }
}
