package rumen3.Thread;

/*
* Thread 类的常用方法
* start():启动线程并调用线程的run()方法
* run(): 线程在被调度时执行的操作
* getname()：返回线程的名称
* setName(String name): 设置该线程的名称
* static Thread currentThread(): 返回当前线程
* yield():释放当前CPU的执行权
* join():在线程a中调用线程b的jion(),此时线程a就进入阻塞状态,直到线程b完全执行完以后,线程a才结束阻塞状态
* stop():强制结束线程生命
* sleep(long millitime):让当前线程"睡眠"指定的millitime,在指定的millitime毫秒时间内,当前线程是阻塞状态
* isAlive():判断当前线程是否存活
*
* */
public class ThreadFunction {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());
        myThread h1 = new myThread("mt-1");
        try {
            h1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        h1.start();
        System.out.println(h1.isAlive());
    }
}
class myThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
    public myThread(String name){
        super(name);
    }

}

