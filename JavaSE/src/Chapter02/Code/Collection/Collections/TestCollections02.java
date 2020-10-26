package Chapter02.Code.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections中还有一个sort方法: public static <T> void sort(List<T> list,Comparator<T> com); 带有比较器的排序方法
 *
 * 这个比较器:Comparator长啥样?? public interface Comparator<T> { int compare(T o1, T o2); }
 * 我们注意到,Comparator实际上是一个接口,那么我们在调用sort方法时 需要传入一个该接口的实现类对象(匿名内部类)
 */
public class TestCollections02 {

  public static void main(String[] args) {
    //1.创建一个集合
    ArrayList<Integer> arr = new ArrayList<Integer>();
    //2.添加点元素
    arr.add(2);
    arr.add(8);
    arr.add(3);
    arr.add(9);
    arr.add(4);
    arr.add(1);
    arr.add(6);
    arr.add(7);
    arr.add(5);
    System.out.println(arr);
    //3.使用带有比较器的sort方法
    Collections.sort(arr, new Comparator<Integer>() {
      /**
       * 该方法就是比较方法
       * @param o1 第一元素
       * @param o2 第二元素
       * @return 返回值代表谁大谁小, 如果是正数代表o1大, 如果适合负数代表o2大, 如果是0代表一样大
       *
       * 口诀:
       *  升序 前-后
       */
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });

    System.out.println(arr);
  }
}
