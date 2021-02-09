package Chapter05.Code01.demo04_ThreadSafe;

public class MyThread extends Thread {

  //无论创建多个MyThread对象,他们共性一个静态变量a
  public volatile static int a = 0;

  @Override
  public void run() {
    System.out.println("线程启动，休息2秒...");
    try {
      Thread.sleep(1000 * 2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("将a的值改为1");
    a = 1;
    System.out.println("线程结束...");
  }
}