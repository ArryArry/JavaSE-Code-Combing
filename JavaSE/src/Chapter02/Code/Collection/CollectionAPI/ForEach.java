package Chapter02.Code.Collection.CollectionAPI;

import java.util.ArrayList;
import org.junit.Test;

public class ForEach {

  /**
   * a.什么是增强for循环 实际上是一种简便格式(语法糖),实际上是迭代器的语法糖
   *
   * b.增强for循环的用法: for(数据类型 变量名:集合/数组){ System.out.println(变量名); } c.增强for循环底层使用的就是迭代器 怎么证明呢??
   * a.看源码(目前你是看不懂) b.如果在使用增强for的过程中向集合中添加或者删除元素会怎么样?? 和使用迭代器时一样也会抛出 ConcurrentModificationException
   * 注意:和使用迭代器一样,增强for就是用于单纯的遍历集合,不要在遍历的过程中增删元素!!
   */
  @Test
  public void test() {
    //1.增强for循环,可以快速遍历集合/数组
    //a.数组
    int[] arr = {10, 20, 30, 40, 50, 60, 70};

    for (int num : arr) {
      System.out.println(num);
    }
    //b.集合
    ArrayList<String> arr2 = new ArrayList<String>();
    arr2.add("java1");
    arr2.add("java2");
    arr2.add("java3");
    arr2.add("java4");
    arr2.add("java5");
    arr2.add("java6");

    for (String s : arr2) {
      System.out.println(s);
      if ("java3".equals(s)) {
        arr2.add("JAVA3");
      }
    }
  }
}
