package Chapter02.Code02.Collection.Exercise01.Demo01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import org.junit.Test;

public class DemoTest {

  /**
   * 需求：
   * 创建一个类，提供一个功能，向LinkedList集合中添加自定义的Person类对象；
   * Person应该具有姓名、性别和年龄三个属性；
   * 添加对象时，如果容器中已存在该对象，就不添加；（要求：不能使用集合提供的contains方法）
   * 如果Person对象的姓名和性别相同，就认为是同一个人；
   *
   * 需求分析：
   * LinkedList集合要存储自定义类型的数据，重写hashCode()方法、equals()方法。
   * 因为要求只要姓名和性别相同，就认为是同一个人，所以重写方法时只需要考虑姓名和性别两个属性
   *
   */
  @Test
  public void test01() {
  }

  /**
   * 需求：使用ArrayList集合，模拟实现一个队列；要求： 提供入队、出队和获取队列长度的功能；
   *
   * 需求分析：ArrayList集合的结构特点是有序列表 因为队列具有先进先出的特点，入队就好比往ArrayList中添加元素，出队就就好比从ArrayList中删除元素，
   * ⚠️：移除数据时需要移除最后一个下标上的数据
   */
  @Test
  public void test02() {
    MyStack<String> myStack = new MyStack();
    myStack.add("111");
    myStack.add("222");
    myStack.add("333");
    while (myStack.size() > 0) {
      System.out.println("模拟出队（删除）：" + myStack.remove());
    }

  }

  class MyStack<T> {

    //创建一个ArrayList集合
    ArrayList<T> list = new ArrayList<T>();

    //模拟入队
    public void add(T t) {
      list.add(t);
      for (T t1 : list) {
        System.out.println("模拟入队（添加）：" + t1);
      }
    }

    //模拟出队
    public T remove() {
      return list.remove(list.size() - 1);
    }

    //获取队列的长度
    public int size() {
      return list.size();
    }
  }

  /**
   * 需求：ArrayList有以下元素: "a","f","b","c","a","d"利用HashSet对ArrayList集合去重(最终结果: ArrayList中没有重复元素)。
   *
   * 需求分析： ArrayList是一个有序、有索引、可重复的容器。HashSet是一个有序、有索引、不可重复的容器。 先将要添加的“水”（元素）加入到ArrayList中，将ArrayList中的“水”全部倒到HashSet中经过“过滤”后又将“水”倒回。
   * （⚠️倒水的过程是将容器内的元素进行了复制，如果要倒回就要清空原容器的内容） API总结： ArrayList() HashSet() addAll() clear()
   */
  @Test
  public void test03() {
    //定义一个ArrayList集合容器，并往里添加带有重复的元素
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("a");
    arrayList.add("a");
    arrayList.add("b");
    arrayList.add("b");
    arrayList.add("c");
    arrayList.add("c");
    System.out.println("ArrayList中原始的元素：" + arrayList);
    //定义一个HashSet集合容器
    HashSet<String> stringHashSet = new HashSet<>();
    //遍历arrayList集合，将集合元素添加到HashSet中
    for (String string : arrayList) {
      stringHashSet.add(string);
    }
    //清除arrayList集合中原始数据
    arrayList.clear();
    //遍历HashSet集合，将去重后的元素存储到arrayList集合中
    for (String string : stringHashSet) {
      arrayList.add(string);
    }
    System.out.println("HashSet中的元素" + stringHashSet);
    System.out.println("ArrayList中去重的元素" + arrayList);
  }

}
