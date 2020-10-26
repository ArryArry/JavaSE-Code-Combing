package Chapter02.Code.Collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet02 {

  public static void main(String[] args) {
    //1.创建一个TreeSet
    TreeSet<Integer> tree = new TreeSet<Integer>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        //口诀:升序 1-2
        return o2 - o1;
      }
    });
    //2.添加
    tree.add(4);
    tree.add(5);
    tree.add(1);
    tree.add(3);
    tree.add(2);
    //3.打印
    System.out.println(tree);

    //4.创建一个TreeSet
    TreeSet<Dog> dogTree = new TreeSet<Dog>(new Comparator<Dog>() {
      @Override
      public int compare(Dog o1, Dog o2) {
        //口诀:升序 1-2
        //按照狗的腿数降序
        return o2.legs - o1.legs;
      }
    });
    //5.加狗
    dogTree.add(new Dog(1, "jack", 5));
    dogTree.add(new Dog(4, "rose", 2));
    dogTree.add(new Dog(2, "tom", 4));
    dogTree.add(new Dog(3, "maryy", 3));
    //6.打印
    for (Dog dog : dogTree) {
      System.out.println(dog);
    }
  }
}
