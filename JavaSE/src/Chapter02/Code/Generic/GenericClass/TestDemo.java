package Chapter02.Code.Generic.GenericClass;

import org.junit.Test;

public class TestDemo {

  /**
   *
   */
  @Test
  public void test() {
    //1.使用泛型类,MyArrayList
    MyArrayList<String> arr = new MyArrayList<String>();
    //此时arr中集合对象中没有E了!!所有E都变成String
    arr.setEe("java");
    String ee = arr.getEe();
    System.out.println(ee);

    //2.使用泛型类,MyArrayList
    MyArrayList<Integer> arr1 = new MyArrayList<Integer>();
    //此时arr1中集合对象中没有E了!!所有E都变成Integer
    arr1.setEe(100);
    System.out.println(arr1.getEe());
  }
}
