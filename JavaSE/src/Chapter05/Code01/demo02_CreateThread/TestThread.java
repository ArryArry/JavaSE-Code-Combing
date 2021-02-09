package Chapter05.Code01.demo02_CreateThread;

public class TestThread {

  public static void main(String[] args) {
    //iii.创建实现类对象(该实现类对象并不是线程对象,我们称为任务对象)
    MyRunnable mr = new MyRunnable();
    //iv. 创建Thread对象,同时传入实现类对象
//        Thread tt = new Thread(mr);
    Thread tt = new Thread(mr, "小强");
    //v. 启动该线程(调用线程对象的start方法)
    tt.start();

    //主线程不会等待子线程执行完毕
    for (int i = 0; i < 50; i++) {
//            System.out.println("主线程..."+i);
      System.out.println(Thread.currentThread().getName() + "..." + i);
    }
  }
}
