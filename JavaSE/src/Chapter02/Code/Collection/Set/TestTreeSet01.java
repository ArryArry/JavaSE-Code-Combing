package Chapter02.Code.Collection.Set;

import java.util.TreeSet;

public class TestTreeSet01 {

  public static void main(String[] args) {
    //1.创建一个TreeSet
    TreeSet<Integer> tree = new TreeSet<Integer>();
    //2.添加元素,没有带索引的方法,证明无索引
    tree.add(6);
    tree.add(4);
    tree.add(1);
    tree.add(5);
    tree.add(7);
    tree.add(2);
    //3.打印,打印的结果就是[1, 2, 4, 5, 6, 7],证明其是无序的(有自然顺序的)
    System.out.println(tree);//[1, 2, 4, 5, 6, 7]
    //4.再添加一个
    tree.add(4);
    tree.add(4);
    tree.add(4);
    tree.add(4);
    System.out.println(tree);//添加了多个4元素,集合中只保留一个,说明元素是唯一的
  }
}
