package Chapter02.Code.Collection.CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

/**
 * a.迭代器(iterator): 用于遍历集合的对象(集合有无索引,均可使用迭代器来遍历,迭代器遍历集合时是不需要索引的!!!) b.如何使用迭代器? i.获取要遍历的集合的迭代器对象
 * ii.调用迭代器对象.hasNext(); iii.调用迭代器对象.next();
 *
 * ⚠️事项 a.NoSuchElementException: 没有此元素异常 出现原因: 迭代器的hasNext返回false,再调用next方法,就会出现此异常
 * b.ConcurrentModificationException: 并发修改异常 出现原因: Java的迭代器规定,使用迭代器的过程中,不能向集合中增删元素(不能影响集合的长度)
 * 否则就会抛出并发修改异常 结论: a.使用迭代器时,必须先使用hasNext方法判断,且判断结果为true,才能调用next方法 b.使用迭代器时,我们应该尽量只做遍历(绝对不允许直接向集合中增删元素)
 */
public class Iterator {

  @Test
  public void test() {
    //1.创建一个集合
    Collection<String> cc = new ArrayList<String>();
    //添加
    cc.add("java");
    cc.add("php");
    cc.add("python");
    cc.add("c++");
    cc.add("c");
    cc.add("c#");
    cc.add("Objective-C");
    //使用迭代器
//        i.获取要遍历的集合的迭代器对象
    java.util.Iterator<String> it = cc.iterator();
//        ii.调用迭代器对象.hasNext();
//        iii.调用迭代器对象.next();
    //需求:在遍历元素的过程,如果发现是"php",那么向集合中添加一个"PHP"
    while (it.hasNext()) {
      String ss = it.next();
      //判断是否为php
      if ("php".equals(ss)) {
        //向集合中添加一个"PHP"
        cc.add("PHP");
      }
      System.out.println(ss);
    }
    //当hasNext返回false,我再调用next方法,会怎么样呢??
    String next = it.next();
    System.out.println(next);

  }
}

