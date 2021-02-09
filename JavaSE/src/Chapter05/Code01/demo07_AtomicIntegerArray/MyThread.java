package Chapter05.Code01.demo07_AtomicIntegerArray;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class MyThread extends Thread {

  public static int[] intArray = new int[1000];//不直接使用数组
  public static AtomicIntegerArray arr = new AtomicIntegerArray(intArray);

  @Override
  public void run() {
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i]++;
//        }
    for (int i = 0; i < arr.length(); i++) {
      arr.addAndGet(i, 1);//将i位置上的元素 + 1,相当于 ++数组[i]
    }

  }
}