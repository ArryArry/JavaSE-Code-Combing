package Chapter05.Code01.demo02_CreateThread;

//i.创建实现类 实现 Runnable接口(实际上接口中一个任务方法,run方法)
public class MyRunnable implements Runnable {

  //ii.实现类重写run方法(run中编写具体的任务代码)
  @Override
  public void run() {
    //run中写任务代码
    for (int i = 0; i < 50; i++) {
//            System.out.println("子线程..."+i);
      System.out.println(Thread.currentThread().getName() + "..." + i);
    }
  }
}
