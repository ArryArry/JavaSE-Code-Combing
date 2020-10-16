package Chapter03.Code01.String;

/*
    创建字符串对象两种方式的区别
        1.使用new关键字创建字符串对象: 只要new就会在堆内存中开辟空间
        2.使用""写的字符串常量的形式: 字符串常量在常量池中

    ==的使用:
        1.基本类型: 比较的是变量中具体的数据是否相同
        2.引用类型: 比较的地址值是否相同
            如果想比较字符串的内容,需要使用equals方法
            public boolean equals(Object obj): 判断调用equals方法的字符串和参数字符串的内容是否一模一样(区分大小写的)
            比如:
                s1.equals(s2): 比较字符串s1和s2的内容是否相同,如果相同返回true,如果不相同返回false

        new String(chs):
            最终是一个"abc"一个字符串,首先检查常量池中是否具有该字符串"abc"
            如果没有,在常量池中创建一个字符串"abc",然后堆内存空间中保存的常量池中"abc"的地址值
            如果有,不会在常量池中重新创建一个字符串"abc",直接在堆内存空间中保存的常量池中"abc"的地址值
 */
public class EqualsDiff {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);//"abc"
        String s2 = new String(chs);
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//true
        System.out.println("-------------------------");


        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true
    }
}
