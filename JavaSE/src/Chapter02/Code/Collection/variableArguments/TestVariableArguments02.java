package Chapter02.Code.Collection.variableArguments;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 可变参数的应用场景
 */
public class TestVariableArguments02 {

  public static void main(String[] args) {
    //1.创建一个集合
    ArrayList<String> arr = new ArrayList<String>();
    //2.添加数据
//        arr.add("jack");
//        arr.add("rose");
//        arr.add("tom");
//        arr.add("lilei");
//        arr.add("mary");
    //3.Collections工具类又有一个方法,叫做addAll
    Collections.addAll(arr, "jack", "rose", "tom", "lilei", "marry");
    //4.打印
    System.out.println(arr);
  }
}
