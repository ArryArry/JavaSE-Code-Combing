package Chapter02.Code.Generic.GenericOthers;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class GenericWildcard {

  /**
   * a.什么是泛型统配符: 当集合中泛型不确定为何种类型时,那么我可以使用泛型通配符,表示何种泛型均可 ArrayList<String> ArrayList<Integer>
   * ArrayList<?>
   */
  @Test
  public void test01() {
//1.定义三个集合
    ArrayList<String> arr1 = new ArrayList<String>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    ArrayList<Double> arr3 = new ArrayList<Double>();
    //2.调用方法
    method(arr1);
    method(arr2);
    method(arr3);
    //Java要求调用方法时,不仅要数据类型一样,泛型必须也一样,否则编译报错!!
  }

  //方法,要求该方法可以接收 以上三个集合中的任意一个
  public static void method(Collection<?> arr) {

  }

  /**
   * 举例: 比我线下上课时候,你们班的辅导老师,邀请大家吃饭,消费金额每个人是50-1000RMB之间 下限:50RMB 上限:1000RMB
   *
   * 泛型上下限: <?> 什么泛型都是OK的 <? extends Animal>,叫泛型的上限,表示该泛型必须是Animal本类或者其子类(Dog,Cat) 我们可以理解为: "<? <=
   * Animal>"
   *
   * <? super Student>,叫泛型的下限, 表示该泛型必须是Student本类或者其父类(Person,Object) 我们可以理解为: "<? >= Student>"
   */

  @Test
  public void test02() {
    Collection<Integer> list1 = new ArrayList<Integer>();
    Collection<String> list2 = new ArrayList<String>();
    Collection<Number> list3 = new ArrayList<Number>();
    Collection<Object> list4 = new ArrayList<Object>();
    //Number是 Integer的父类
    // Object
    //   子类 String Number
    //               子类 Integer
    //调用方法1
    getElement1(list1); //OK
    //getElement1(list2);
    getElement1(list3); //OK
    //getElement1(list4);

    //调用方法2
    //getElement2(list1); // 0
    //getElement2(list2); // 0
    getElement2(list3); // 1
    getElement2(list4); // 1
  }

  //要求:泛型必须是Number 或者 Number的子类(上限)
  public static void getElement1(Collection<? extends Number> coll) {

  }

  //要求:泛型必须是Number 或者 Number的父类(下限)
  public static void getElement2(Collection<? super Number> coll) {

  }
}
