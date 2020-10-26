package Chapter02.Code.Collection.List;

import java.util.ArrayList;

public class TestArrayList {

  public static void main(String[] args) {
    //1.使用ArrayList
    ArrayList<String> arr = new ArrayList<String>();
    //2.增
    arr.add("java1");
    arr.add("java2");
    arr.add("java3");
    arr.add("java4");

    arr.add(2, "java99");
    System.out.println(arr);
    //[java1, java2, java99, java3, java4]
    //3.删
    arr.remove(3);
    System.out.println(arr);
    //[java1, java2, java99, java4]
    //4.修改
    arr.set(2, "java9");
    System.out.println(arr);
    //[java1, java2, java9, java4]
    //5.获取
    String s = arr.get(2);
    System.out.println(s);
  }
}
