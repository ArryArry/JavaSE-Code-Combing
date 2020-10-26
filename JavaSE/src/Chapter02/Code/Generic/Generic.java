package Chapter02.Code.Generic;

import java.util.ArrayList;
import org.junit.Test;

/**
 * 泛型是JDK1.5的新特性 比如: 在JDK1.5之前,创建集合: ArrayList arr = new ArrayList(),集合中可以保存任意的对象 在JDK1.5时候,创建集合:
 * ArrayList<具体的引用类型> arr = new ArrayList<具体的引用类型>();
 *
 * 什么是泛型: 是一种不确定的类型,程序员使用时再确定下来 泛型的格式:
 * <E>,<P>,<MVP>
 * <K,V>
 *
 * 总结泛型的好处: a.避免了强转(向下转型)的麻烦 b.将运行时期的ClassCastException，转移到了编译时期变成了编译失败。 c.总之:
 * JDK1.5之后,Java强烈推荐(必须)使用泛型!!!!
 *
 * ⚠️在开发我们很少自定义泛型类.泛型方法,泛型接口,所以我们的重点是别人定义好了一个泛型类(ArrayList<E>) 我们会使用它即可!! ArrayList<具体的类型> arr = new
 * ArrayList<具体的类型>();
 */
public class Generic {

  @Test
  //不使用泛型
  public void method1() {
    //1.创建集合,但是不用泛型
    ArrayList arr = new ArrayList();
    //问题: 没写泛型,集合可以保存什么类型?? Object类型
    arr.add("java");
    arr.add(10);
    arr.add(3.14);
    arr.add(true);
    arr.add('A');
    //2.取出
    for (Object s : arr) {
      String ss = (String) s;
      System.out.println("ss的长度是:" + ss.length());
    }
    //不使用泛型,就必须用到向下转型,可能转型的过程中还会引发ClassCastException
    //添加元素一时爽,取出元素火葬场
  }

  @Test
  //使用泛型
  public void method2() {
    //1.创建集合,并且使用泛型
    ArrayList<String> arr = new ArrayList<String>();
    //2.添加
    arr.add("java");
    arr.add("10");
    arr.add("3.14");
    arr.add("true");
    arr.add("A");
    //3.取出
    for (String s : arr) {
      //a.避免向下转型的麻烦
      //b.也避免了类型转换异常
      System.out.println(s + "的长度是:" + s.length());
    }
  }
}
