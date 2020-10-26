package Chapter02.Code.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestCollections03 {

  public static void main(String[] args) {
    //1.创建一个集合
    ArrayList<Dog> arr = new ArrayList<Dog>();
    //2.加狗
    arr.add(new Dog(1, "jack", 4));
    arr.add(new Dog(4, "lilei", 3));
    arr.add(new Dog(2, "ady", 2));
    arr.add(new Dog(3, "hanmmeimei", 5));
    //3.对狗集合继续排序
    Collections.sort(arr, new Comparator<Dog>() {
      @Override
      public int compare(Dog o1, Dog o2) {
        //升序 前-后
        //按照狗的年龄降序
//                return o2.age-o1.age;
        //按照狗的名字的长度升序
//                return o1.name.length()-o2.name.length();
        //按照狗的年龄和腿数的总和,升序
        return (o1.age + o1.legs) - (o2.age + o2.legs);

      }
    });
    //4.打印
    for (Dog dog : arr) {
      System.out.println(dog);
    }
  }
}
