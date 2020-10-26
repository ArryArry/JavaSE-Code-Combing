package Chapter02.Code.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Collections 不是 Collection!!! 作用: Collections是一个集合的工具类,该类中有一堆静态方法,专门操作集合
 *
 * public static void shuffle(List<?> list); 随机打乱集合中元素的顺序 public static <T> void sort(List<T> list);
 * 将集合中元素进行升序排序
 *
 * 扩展:Collections的sort方法,默认是对集合中的元素进行升序排序 如果集合的泛型是数值类型,那么按照数值的大小升序 如果集合的泛型是Character类型,那么按照字符的码值升序
 * 如果集合的泛型是String类型,那么先按照首字母升序,首字母一样,按照次字母升序,依次类推 提示: Collections.sort方法结论和Arrays.sort()是一样的
 *
 * 问题: sort方法默认升序,想要降序怎么办?? sort方法能否排序其他类型(自定义的类型)?? 能,但是需要使用到sort方法另外一个重载方法!!
 */
public class TestCollections01 {

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
    //3.排序sort
    Collections.sort(arr);
    System.out.println(arr);
    //4.打乱 shuffle
    Collections.shuffle(arr);
    System.out.println(arr);
  }
}
