package Chapter05.Code01.demo05_ThreadSafe;

public class MyThread extends Thread {

  public volatile static int a = 0;

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      a++;
    }
    System.out.println("修改完毕！");
  }
}
