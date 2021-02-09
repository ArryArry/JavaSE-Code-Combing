package Chapter05.Code01.demo03_NiMing;

public class TestDemo {

  public static void main(String[] args) {
    //1.继承方式创建线程
    new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 50; i++) {
          System.out.println(Thread.currentThread().getName() + "..." + i);
        }
      }
    }.start();

    //2.实现方式创建线程
    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 50; i++) {
          System.out.println(Thread.currentThread().getName() + "..." + i);
        }
      }
    }).start();

    //主线程不会等待子线程任务结束
    for (int i = 0; i < 50; i++) {
      System.out.println(Thread.currentThread().getName() + "..." + i);
    }
  }
}
