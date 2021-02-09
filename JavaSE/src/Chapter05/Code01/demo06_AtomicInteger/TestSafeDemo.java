package Chapter05.Code01.demo06_AtomicInteger;

public class TestSafeDemo {

  public static void main(String[] args) throws InterruptedException {
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    t1.start(); //线程1 对a加了10000次
    t2.start(); // 线程2 对a加了 10000次
    Thread.sleep(1000);
    System.out.println("获取a最终值：" + MyThread.a);
    //总是不准确的。原因：两个线程访问a 的步骤不具有：原子性
  }
}
