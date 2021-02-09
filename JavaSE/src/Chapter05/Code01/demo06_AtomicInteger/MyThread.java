package Chapter05.Code01.demo06_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

  public static AtomicInteger a = new AtomicInteger(0);

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      a.getAndIncrement();//相当于 a++
    }
    System.out.println("修改完毕！");
  }
}
