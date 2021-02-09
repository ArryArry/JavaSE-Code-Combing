package Chapter02.Code.Array;

import java.util.Arrays;
import org.junit.Test;

/**
 * 数组的基本语法
 * 数组概念： 数组就是存储数据长度固定的容器，保证多个数据的数据类型要一致。
 * <p>
 * 数组的定义：
 * 方式一：数组存储的数据类型[] 数组名字;
 * 方式二：数组存储的数据类型 数组名字[];
 * <p>
 * 数组的初始化：
 * 方式一 数组动态初始化（只给定数组的长度，由系统给出默认初始化值）
 * 数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度];
 * int[] arr = new int[3];
 * 方式二 数组静态初始化（在创建数组时，直接确定数组元素）
 * 标准格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
 * 简化格式：数据类型[] 数组名 = {元素1,元素2,元素3...};
 * ⚠️注意:
 * (1)数组长度省略,根据{}中的元素计算出来
 * (2)虽然没有写new,但是底层仍然有new的过程
 * (3)动态初始化/标准格式的静态初始化数组,可以分为两步完成
 * (4)简化格式的静态态初始化数组,不可以分为两步完成
 * 数组的访问：
 * 标准/简化格式静态初始化数组的使用
 * 1.数组名: 代表数组容器在内存空间的地址值,是一个十六进制的数据
 * 2.数组中的每个元素都有一个唯一的编号: 称为索引,但是索引编号从0开始,索引编号的最大值(数组长度-1)
 * 3.数组元素的访问:
 * 数组名[索引编号];
 * array[2]: 数组array中索引编号为2的元素
 * 4.获取数组的长度(数组中存储的元素的数量)
 * 数组有个属性length,使用格式:
 * int size = 数组名称.length;
 * 注意:
 * length是数组的属性,所以使用时后面没有()
 * 总结:
 * 数组元素的索引编号范围:
 * 从0开始,到最大索引(数组长度-1: 数组名称.length)
 * 5.索引访问数组中的元素：
 * 数组名[索引]=数值，为数组中的元素赋值
 * 变量=数组名[索引]，获取出数组中的元素
 * <p>
 * 动态初始化(指定数组长度)初始化数组的使用
 * 动态初始化数组,元素有默认值
 * 基本类型:
 * 整数 byte/short/int/long:     0
 * 小数 float/double:            0.0
 * 布尔 boolean:                 false
 * 字符 char:                    空白字符
 * 引用类型:
 * 默认值都是null
 */
public class ArraySyntax {

  public static void main(String[] args) {
    //==========数组的定义==========
    int[] arr;
    int arrs[];

    //==========数组的初始化==========
    //1.创建一个int类型的数组,该数组名称arrayA,可以存储3个int数据
    int[] arrayA = new int[3];
    //2.创建一个char类型的数组,该数组名称arrayB,存储3个char数据
    char[] arrayB = {'a', 'b', 'c'};
    //3.创建一个boolean类型的数组,该数组名称arrayC,可以存储2个boolean数据
    boolean[] arrayC = new boolean[2];
    //4.创建一个String类型的数组,该数组名称arrayD,存储3个String数据
    String[] arrayD = new String[]{"a", "b", "c"};

    System.out.println("-----------------------");
    //动态初始化数组,可以分为两步完成
    float[] arrA;
    arrA = new float[3];
    arrA = new float[30];

    //标准格式的静态初始化数组,可以分为两步完成
    int[] arrB;
    arrB = new int[]{10, 20};
    arrB = new int[]{100, 200, 300};
    //arrB = new double[]{100,200,300};//错误的,数据类型不匹配

    //简化格式的静态态初始化数组,不可以分为两步完成
    int[] arrC;
    //arrC = {1,2,3,5};//不允许

    //==========数组的访问==========
    //定义int变量num,存储100
    int num = 100;
    System.out.println(num);//100

    //创建int类型的数组,名称为array,存储int数据 10,20,30
    int[] array = {10, 20, 30};//10的编号0,20的编号1,30的编号2

    System.out.println(array);//在内存空间的地址值: [I@1540e19d

    //打印10
    System.out.println(array[0]);//打印数组array中的索引编号为0的元素值:10
    //打印20
    System.out.println(array[1]);//打印数组array中的索引编号为1的元素值:20
    //打印30
    System.out.println(array[2]);//打印数组array中的索引编号为2的元素值:30

    //把10 改成 100
    array[0] = 100;//把int数字100赋值给数组array中的索引为0的元素中
    //把20 改成 200
    array[1] = 200;//把int数字200赋值给数组array中的索引为1的元素中
    //把30 改成 300
    array[2] = 300;//把int数字300赋值给数组array中的索引为2的元素中

    System.out.println(array);//在内存空间的地址值: [I@1540e19d

    //打印100
    System.out.println(array[0]);//打印数组array中的索引编号为0的元素值:100
    //打印200
    System.out.println(array[1]);//打印数组array中的索引编号为1的元素值:200
    //打印300
    System.out.println(array[2]);//打印数组array中的索引编号为2的元素值:300

    //获取数组的长度
    int count = array.length;
    System.out.println("数组中元素的个数: " + count);

  }

  /**
   * Java数组的三种打印方式
   */
  @Test
  public void printArray() {
    int[] array = {1, 2, 3, 4, 5, 6};
    //传统的for循环方式
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    //for each循环
    for (int i : array) {
      System.out.println(array[i]);
    }
    //利用Array类中的toString方法
    System.out.println(Arrays.toString(array));
  }
}
