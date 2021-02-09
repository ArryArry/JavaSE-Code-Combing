package Chapter05.Code01.demo01_CreateThread;

public class ThreadDemo02 {

  public static void main(String[] args) {
    // iii.创建子类对象(实际上就是创建一个线程对象)
    MyThread mt = new MyThread("旺财");
    //iv. 调用线程对象的start方法(启动该线程)
    mt.start();

    MyThread mt2 = new MyThread("小强");
    mt2.start();

    //主线程 不会等待子线程任务结束
    for (int i = 0; i < 50; i++) {
//            System.out.println("主线程..."+i);
      System.out.println(Thread.currentThread().getName() + "..." + i);
    }
  }
}
