package Chapter02.Code.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

  public static void main(String[] args) {
    //1.创建一个LinkedHashSet对象
    LinkedHashSet<String> set = new LinkedHashSet<String>();
    //2.添加,没有带索引的方法,证明无索引
    set.add("php");
    set.add("python");
    set.add("c++");
    set.add("java");
    set.add("c#");
    //3.直接的打印,证明有序
    System.out.println(set);//[php, python, c++, java, c#]
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
