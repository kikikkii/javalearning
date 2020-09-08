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
* 线程的调度:同优先级线程组先进先出队列，对高优先级，使用优先调度的抢占式策略
* 线程的优先级等级：
*   MAX_PRIORITY:10
*   MIN_PRIORITY:1
*   NORM_PRIORITY:5
*获取和设置当前线程的优先级:
*   getPriority():获取
*   setPriority():设置
*
*   说明:高优先级的线程要抢占低优先级线程的cpu的执行权。但是从概率上来讲并不是高优先
*   级的比低优先级的
*
*
*/
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
        h1.setPriority(Thread.MAX_PRIORITY);
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

