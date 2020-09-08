package rumen3;

/*
 *问题:当一个线程的操作尚未完成时，另一个线程参与进来，导致共享的数据错误
 *当一个线程在操作公共数据时，其他线程不能参与进来，直到线程a
 * 操作完成时，其他线程才可以开始操作公共数据,这种情况即使a出现了阻塞
 * 也不能改变
 *在java中,我们通过同步机制,来解决线程的安全问题
 *
 * 方式一:同步代码块
 * synchronized(同步监视器){
 * //需要被同步的代码
 * }
 * 说明:操作共享数据的代码,即为需要被同步的代码
 * 方式二:同步方法
 *
 * */


public class ThreadSecurity {
    public static void main(String[] args) {
        
    }
}

class Window1 implements Runnable{
    public static int tickets = 100;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}