package Chapter02.Code.Collection.Set;

import java.util.HashSet;

/**
 * 使用哈希表保存自定义类型的练习
 */
public class TestHashSetDemo {

  public static void main(String[] args) {
    //1.创建一个哈希表结构的集合
    HashSet<Dog> dogHashSet = new HashSet<Dog>();
    //2.保存对象
    dogHashSet.add(new Dog(10, "旺小财", 3));
    dogHashSet.add(new Dog(20, "旺中财", 4));
    dogHashSet.add(new Dog(30, "旺大财", 5));
    dogHashSet.add(new Dog(40, "旺老财", 6));

    //再添加一只狗
    dogHashSet.add(new Dog(30, "旺大财", 5));
    //哈希表判断两个元素重复or不重复的依据是什么??
    //  哈希表和equals
    //为了保证元素的唯一性,我们要重写hashCode和equals,根据内容来计算哈希值,equals也改成比较内容
    //3.打印
    for (Dog dog : dogHashSet) {
      System.out.println(dog);
    }
  }
}
