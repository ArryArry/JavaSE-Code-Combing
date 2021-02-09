package Chapter05.Code01.demo01_CreateThread;

//i.创建子类 继承 Thread
public class MyThread extends Thread {

  public MyThread() {

  }

  public MyThread(String name) {
    super(name); //将名字通过调用父类构造,传给父类即可
  }

  //ii.子类中重写run方法(在run中编写线程要执行的任务代码)
  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
//            System.out.println("子线程..."+i);
//            System.out.println(getName()+"..."+i);
      System.out.println(Thread.currentThread().getName() + "..." + i);

    }
  }
}
