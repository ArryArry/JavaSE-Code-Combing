package Chapter05.Code01.demo07_AtomicIntegerArray;

import java.util.Arrays;

public class TestDemo01 {

  public static void main(String[] args) throws InterruptedException {
    //创建1000个线程，每个线程为数组的每个元素+1
    for (int i = 0; i < 1000; i++) {
      new MyThread().start();
    }

    Thread.sleep(1000 * 5);//让所有线程执行完毕
    System.out.println("主线程休息5秒醒来");
//        for (int i = 0; i < MyThread.intArray.length; i++) {
//            System.out.println(MyThread.intArray[i]);
//        }
    for (int i = 0; i < MyThread.arr.length(); i++) {
      System.out.println(MyThread.arr.get(i));
    }
  }
}
