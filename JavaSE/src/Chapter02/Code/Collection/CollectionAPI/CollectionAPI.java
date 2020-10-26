package Chapter02.Code.Collection.CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

/**
 * a.什么是集合? 集合就是Java用来保存数据的容器 b.我们学过哪些容器?? 数组,ArrayList 数组定义: 数据类型[] 变量名 = new 数据类型[数组的长度]; 集合定义:
 * ArrayList<数据类型> 变量名 = new ArrayList<数据类型>(); c.数组和集合的区别在吗??【面试题】 i.数组长度是固定的,集合的长度是可变的
 * ii.数组中元素类型可以是基本类型,也可以是引用类型 但是集合中元素类型必须只能是引用类型,如果想保持基本类型,要写该基本类型对应的包装类 比如: ArrayList<int> arr =
 * new ArrayList<int>();//报错!! ArrayList<Integer> arr = new ArrayList<Integer>();//对的 d.常用API 增:增加
 * public boolean add(E e);  添加元素,返回值表示是否添加成功! 删:删除 public boolean remove(E e); 删除元素,返回值表示是否删除成功!
 * 改:修改 无! 查:获取 无! 其他: public boolean contains(Object obj); 判断集合中是否包含某个元素 public void clear();
 * 清空集合(把集合的元素全部删除,不是把集合置为null) public boolean isEmpty(); 判断集合是否为空(是指集合中是否没有元素,并不是值集合是否为null) public
 * int size(); 返回集合中元素的个数 public Object[] toArray(); 将集合转成数组
 */
public class CollectionAPI {

  @Test
  public void test() {
    //1.创建一个ArrayList
    Collection<String> cc = new ArrayList<String>(); //多态
    //2.测试方法
    //添加
    cc.add("java1");
    cc.add("java2");
    cc.add("java3");
    cc.add("java4");
    System.out.println(cc);//不会打印出来地址,而是打印出来集合中的元素内容
    //删除
    boolean b = cc.remove("java4");
    System.out.println("是否删除成功:" + b);
    System.out.println(cc);
    //其他方法
    //判断是否包含
    boolean b1 = cc.contains("java2");
    System.out.println("是否包含:" + b1);
    //清空集合
    cc.clear();
    System.out.println(cc);
    //判断是否集合没有元素
    boolean b2 = cc.isEmpty();
    System.out.println("集合是否为空集合:" + b2);
    //获取集合的长度
    int size = cc.size();
    System.out.println("集合中元素的个数:" + size);
    //将集合转成数组
    Object[] objects = cc.toArray();
    System.out.println(objects[0]);
    System.out.println(objects[1]);
    System.out.println(objects[2]);
  }
}
