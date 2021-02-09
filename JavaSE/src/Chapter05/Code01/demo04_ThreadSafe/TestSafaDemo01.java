package Chapter05.Code01.demo04_ThreadSafe;

public class TestSafaDemo01 {

  public static void main(String[] args) {
    //1.启动线程
    MyThread t = new MyThread();
    t.start();
    //2.主线程继续
    while (true) {
      if (MyThread.a == 1) {
        System.out.println("主线程读到了a = 1");
      }
    }
  }
}
