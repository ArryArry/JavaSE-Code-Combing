package Chapter02.Code;

/**
 * 数组使用的常见问题:
 * 1.索引越界异常
 * java.lang.ArrayIndexOutOfBoundsException
 * (1)原因:
 * 使用了不存在的索引,获取数组元素
 * 索引范围: 从0开始到数组长度-1
 * (2)解决方案:
 * 找到数组索引越界的地方,进行修改
 * <p>
 * 2.空指针异常
 * java.lang.NullPointerException
 * (1)原因:
 * null是一个引用类型的常量,可以赋值给任意引用类型的变量,
 * 但是一旦引用类型的变量的值是null,则说明该引用类型的变量不再执行堆内存中的任何空间
 * 所以将不能再通过该引用类型变量来访问堆内存空间中的数组元素
 * <p>
 * (2)解决方案:
 * a.找到引用变量的值是null的地方,进行修改不让引用变量的值是null
 * b.不通过值为null的引用变量,访问堆内存空间的内容
 */
public class ArrayProblems {
    public static void main(String[] args) {
        //创建int类型数组,名称array,存储int数据 10,20,30
        int[] array = {10, 20, 30};
        System.out.println(array);//地址值: [I@1540e19d
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println(array[5]);//索引5,不存在,报出索引越界异常

        array = null;
        System.out.println(array);//null
        //System.out.println(array[0]);//空指针异常
    }
}
