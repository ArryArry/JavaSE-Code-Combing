package Chapter02.Code.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * 数组和集合效率比较 使用数组和集合创建字符串，比较两者的性能区别
 */
public class ArrayVSList {

  private static boolean isArrayEfficient() {
    //创建字符型数组
    char[] array = new char[1000];
    //创建保存字符型元素的列表
    List<Character> list = new ArrayList<>(array.length);
    //向数组和列表当中添加元素
    for (int i = 0; i < array.length; i++) {
      array[i] = (char) (65 + i % 26);
      list.add((char) (65 + i % 26));
    }
    //保存系统当前的纳秒数
    long currentTime = System.nanoTime();
    //使用字符数组创建字符串
    new String(array);
    //清理内存
    System.gc();
    //计算消耗时间
    long arrayTime = System.nanoTime() - currentTime;
    //保存系统当前时间的纳秒数
    currentTime = System.nanoTime();
    //将列表内容转换成字符串
    list.toString();
    //计算消耗时间
    long listTime = System.nanoTime() - currentTime;
    return arrayTime < listTime;
  }

  public static void main(String[] args) {
    int counter = 0;
    for (int i = 0; i < 100; i++) {
      if (isArrayEfficient()) {
        counter++;
      }
    }
    System.out.println("比较次数：" + 100);
    System.out.println("数组效率大于列表次数" + counter);
    System.out.println("数组效率小于列表次数" + (100 - counter));
  }

  /**
   * 数组转集合类 使用asList方法生成的列表是不可变的，如果再向其中增加元素会抛出异常
   */
  @Test
  public void ArrayToList() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.add(1, 2); //java.lang.UnsupportedOperationException
    System.out.println("list:" + list);
  }

  /**
   * 集合转数组
   */
  @Test
  public void ListToArray() {
    //创建列表
    List<Integer> arrayList = new ArrayList<>();
    //向列表中增加元素
    for (int i = 0; i < 5; i++) {
      arrayList.add(i);
    }
    //将列表转换成数组
    Integer[] array = arrayList.toArray(new Integer[]{});
    System.out.println("array:" + Arrays.toString(array));
  }

  /**
   * 数组和ArrayList的区别 错误测试
   *
   * 解析：当从列表当中删除一个元素时，后面的元素会向前移动填充空位。 这点与数组完成不同
   */
  @Test
  public void WrongRemove() {
    //创建列表
    ArrayList<Integer> arrayList = new ArrayList<>();
    //向列表当中增加元素
    for (int i = 0; i < 5; i++) {
      arrayList.add(i);
    }
    //移除列表当中第二个元素
    arrayList.remove(1);
    //移除列表当中第三个元素
    arrayList.remove(2);
    //打印移除后的元素列表
    System.out.println(arrayList.toString());
  }

  /**
   * 数组和ArrayList的区别 正确测试
   */
  @Test
  public void RightRemove() {
    //创建列表
    ArrayList<Integer> arrayList = new ArrayList<>();
    //向列表当中增加元素
    for (int i = 0; i < 5; i++) {
      arrayList.add(i);
    }
    //移除列表当中第二个元素
    arrayList.remove(1);
    //移除列表当中第三个元素
    arrayList.remove(1);
    //打印移除后的元素列表
    System.out.println(arrayList.toString());

  }
}
