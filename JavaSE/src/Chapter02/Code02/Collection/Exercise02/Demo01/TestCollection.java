package Chapter02.Code02.Collection.Exercise02.Demo01;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class TestCollection {

  /**
   * 请定义方法public static int listTest(Collection<String> list,String s)
   * 统计集合中指定元素出现的次数，如"a":2,"b":2,"c" :1, "xxx":0
   */
  @Test
  public void test01() {
    Collection<String> list = new ArrayList<>();
    list.add("a");
    list.add("a");
    list.add("b");
    list.add("b");
    list.add("c");
    System.out.println("a:" + listTest(list, "a"));
    System.out.println("b:" + listTest(list, "b"));
    System.out.println("c:" + listTest(list, "c"));
    System.out.println("xxx:" + listTest(list, "xxx"));

  }

  //定义方法统计集合中指定元素出现的次数
  public static int listTest(Collection<String> list, String s) {
    //定义计数器，初始化为0
    int count = 0;
    //增强for遍历集合
    for (String s1 : list) {
      //判断传入方法的字符与遍历集合中的元素是否一致
      if (s.equals(s1)) {
        //如果一致就+1
        count++;
      }
    }
    //返回统计的结果
    return count;
  }

  /**
   * 定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
   */
  @Test
  public void test02() {

  }
  //Collection集合数组转集合

}
