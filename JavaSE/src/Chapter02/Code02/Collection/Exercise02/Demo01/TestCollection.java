package Chapter02.Code02.Collection.Exercise02.Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
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
    //定义int数组
    int[] arr = {1, 2, 3, 4, 5};
    //调用方法将数组的元素传递到集合中
    ArrayList<Integer> list = arryToCollection(arr);
    System.out.println("集合的内容为：" + list);
  }

  //数组转集合
  public ArrayList<Integer> arryToCollection(int[] arr) {
    //定义集合
    ArrayList<Integer> arrayList = new ArrayList<>();
    //遍历数组，把元素依次添加到集合中
    for (int i : arr) {
      arrayList.add(i);
    }
    //返回集合
    return arrayList;
  }

  /**
   * 集合转数组 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。 （可以使用Object[]数组类型接收转换的数组）
   */
  @Test
  public void test03() {
    //定义一个集合，并添加元素
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(200);
    arrayList.add(300);
    //调用集合的toString()方法将集合转换成数组
    Object[] toArray = arrayList.toArray();
    //遍历数组
    for (int i = 0; i < toArray.length; i++) {
      System.out.println("数组的元素为：" + toArray[i]);
    }
  }

  /**
   * contains()方法使用 定义一个方法listTest(ArrayList<String> al, String s), 要求使用contains()方法判断al集合里面是否包含s
   */
  @Test
  public void test04() {
    ArrayList<String> al = new ArrayList<>();
    al.add("100");
    al.add("200");
    al.add("300");
    boolean b = containsTest(al, "100");
    System.out.println("集合中是否有字符100：" + b);
  }

  public static boolean containsTest(ArrayList<String> al, String s) {
    /*boolean contains = al.contains(s);
    return contains;*/
    if (al.contains(s)) {
      return true;
    }
    return false;
  }

  /**
   * isEmpty()方法的使用 六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
   */

  @Test
  public void test05() {
    ArrayList<String> al = new ArrayList<>();
    al.add("100");
    al.add("200");
    al.add("300");
    boolean b = isEmptyTest(al);
    System.out.println("al集合中是否有元素：" + b);
  }

  public static boolean isEmptyTest(ArrayList<String> al) {
    if (al.isEmpty()) {
      return false;
    }
    return true;
  }

  /**
   * 简述迭代器的实现原理
   *
   * 当遍历集合时，首先通过调用集合的iterator()方法获得迭代器对象，然后使用hashNext()方法判断集合中是否存在下一个元素，
   * 如果存在，则调用next()方法将元素取出，否则说明已到达了集合末尾，停止遍历元素。
   * Iterator迭代器对象在遍历集合时，内部采用指针的方式来跟踪集合中的元素，
   * 在调用Iterator的next()方法之前，迭代器的索引位于第一个元素之前，不指向任何元素，
   * 当第一次调用迭代器的next方法后，迭代器的索引会向后移动一位，指向第一个元素并将该元素返回，
   * 当再次调用next方法时，迭代器的索引会指向第二个元素并将该元素返回，
   * 依此类推，直到hasNext方法返回false，表示到达了集合的末尾，终止对元素的遍历。
   */

  /**
   * 返回首次出现索引 定义一个方法listTest(ArrayList<Integer> al, Integer s)， 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
   */
  @Test
  public void test06() {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(100);
    al.add(200);
    al.add(300);
    int i = indexTest(al, 300);
    System.out.println("集合中数值100的索引位置：" + i);
  }

  public static int indexTest(ArrayList<Integer> al, int s) {
    //遍历集合，获取元素，判断元素是否与s相等，相等返回索引
    for (int i = 0; i < al.size(); i++) {
      if (al.get(i).equals(s)) {
        return i;
      }
    }
    return -1;
  }

  /**
   * (复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。 A：遍历集合遍历输出。
   * B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
   */
  @Test
  public void test07() {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    studentArrayList.add(new Student("张三", 23, "男"));
    studentArrayList.add(new Student("王五", 28, "男"));
    studentArrayList.add(new Student("李四", 25, "男"));
    for (Student student : studentArrayList) {
      System.out.println(student);
    }
    findMax(studentArrayList);
  }

  public static void findMax(ArrayList<Student> studentArrayList) {
    //定义存放年龄的变量
    int age = 0;
    //定义存放年龄最大的索引值
    int index = 0;
    //遍历集合获取年龄值，与max比较
    for (int i = 0; i < studentArrayList.size(); i++) {
      //如果年龄大于age记录次数
      if (studentArrayList.get(i).getAge() > age) {
        index = i;
        //并把年龄最大的值赋给age
        age = studentArrayList.get(i).getAge();
      }
    }
    System.out.println("年龄最大的学生是：" + studentArrayList.get(index).getName());
    //将年龄最大的改为姓名为：小猪佩奇
    studentArrayList.get(index).setName("小猪佩奇");
  }

  /**
   * 产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台
   */
  @Test
  public void test08() {
    //定义一个长度为10的int数组
    int[] arr = new int[10];
    //创建一个生成随机数的对象
    Random random = new Random();
    //在1-100内生成10个随机数并存放到数组当中
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    //创建一个list集合
    ArrayList<Integer> arrayList = new ArrayList<>();
    //遍历数组中的数字
    for (int i : arr) {
      //判断大于等于10的数，并将其存储到list集合当中
      if (i >= 10) {
        arrayList.add(i);
      }
    }
    //打印集合中的数字
    System.out.println("产生的随机数是：" + arrayList.toString());

  }

  /**
   * 编写一个泛型方法，实现任意引用类型数组指定位置元素交换
   */
  @Test
  public void test09() {
    Integer[] a = {1, 2, 3, 4, 5, 6};
    method(a, 0, 1);
  }

  //编写泛型的方法
  public static <E> void method(E[] e, int a, int b) {
    //元素互换
    E temp = e[a];
    e[a] = e[b];
    e[b] = temp;
    for (int i = 0; i < e.length; i++) {
      System.out.println(e[i]);
    }
  }

  /**
   * 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有
   */
  @Test
  public void test10() {
    Integer[] a = {1, 2, 3, 4, 5, 6};
    methods(a);

  }

  public static <E> void methods(E[] e) {
    //元素反转
    for (int min = 0, max = e.length - 1; min < max; min++, max--) {
      E temp = e[min];
      e[min] = e[max];
      e[max] = temp;
    }
    for (int i = 0; i < e.length; i++) {
      System.out.println(e[i]);
    }
  }

}
