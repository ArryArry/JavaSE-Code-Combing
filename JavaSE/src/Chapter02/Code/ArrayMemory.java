package Chapter02.Code;

/**
 * JVM的内存分配:
 * 1.方法区: 存储.class文件的(.class文件中有很多方法)
 * 2.方法栈: 可以运行的方法所使用的内容空间,方法都在栈内存中执行⚠️
 * 比如: main方法在方法栈中执行
 * 3.堆内存: 存储所有new出来的内容⚠️
 * 4.寄存器/本地方法栈: 与我们无关
 * 一个数组内存图
 * 数组变量名称: 内部保存的是数组容器在内存中的地址值
 * 通过该地址值,可以找到数组的内存空间
 * 数组内存空间中有多个元素,再通过元素的索引编号找到具体的某个元素
 * 两个数组内存图
 * 数组变量名称: 内部保存的是数组容器在内存中的地址值
 * 通过该地址值,可以找到数组的内存空间
 * 数组内存空间中有多个元素,再通过元素的索引编号找到具体的某个元素
 * 两个引用(变量)指向一个数组的内存图
 * one是数组名称,代表数组的地址值,把one赋值给two之后,
 * 那么one和two中保存的是相同的地址值,指向了同一个数组
 * 不管通过one或者two修改了数组中元素的内容,再通过one或者two查看的都是变化后的数组内容
 * <p>
 * 引用类型变量:
 * 这种变量中存储的不是普通的数据值,而是内存中的地址值,通过该地址值可以找到对应的内存空间
 */
public class ArrayMemory {
    public static void main(String[] args) {
        //=========一个数组内存图==========
        int[] one = new int[2];
        System.out.println(one);//地址值
        System.out.println(one[0]);//0
        System.out.println(one[1]);//0
        //给数组元素赋值
        one[0] = 100;
        one[1] = 200;
        System.out.println(one);//地址值
        System.out.println(one[0]);//100
        System.out.println(one[1]);//200

        //=========两个数组内存图==========
        //又创建了一个int类型数组,名称为two,可以存储2个int数据
        int[] two = new int[2];
        System.out.println(two);//地址值
        System.out.println(two[0]);//0
        System.out.println(two[1]);//0
        //给数组元素赋值
        two[0] = 1000;
        two[1] = 2000;
        System.out.println(two);//地址值
        System.out.println(two[0]);//1000
        System.out.println(two[1]);//2000

        //两个引用(变量)指向一个数组的内存图
        /*
            one是数组名称,代表数组的地址值,把one赋值给two之后,
            那么one和twos中保存的是相同的地址值,指向了同一个数组
         */
        int[] twos = one;
        System.out.println(twos);//地址值
        System.out.println(twos[0]);//100
        System.out.println(twos[1]);//200
        //给数组元素赋值
        twos[0] = 1000;
        twos[1] = 2000;
        System.out.println(twos);//地址值
        System.out.println(twos[0]);//1000
        System.out.println(twos[1]);//2000

        System.out.println(one);//地址值
        System.out.println(one[0]);//1000
        System.out.println(one[1]);//2000
    }
}
