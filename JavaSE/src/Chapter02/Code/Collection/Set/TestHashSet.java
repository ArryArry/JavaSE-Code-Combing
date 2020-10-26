package Chapter02.Code.Collection.Set;

import java.util.HashSet;

public class TestHashSet {

  public static void main(String[] args) {
    //1.创建一个HashSet对象
    HashSet<String> set = new HashSet<String>();
    //2.添加,没有带索引的方法,证明无索引
    set.add("php");
    set.add("java");
    set.add("python");
    set.add("c++");
    set.add("c#");
    //3.直接的打印,证明无序
    System.out.println(set);//[c#, python, c++, java, php]
    //4.再加一个一样元素,证明唯一
    set.add("php");
    set.add("php");
    set.add("php");
    set.add("php");
    set.add("php");
    set.add("php");
    System.out.println(set);
  }
}
