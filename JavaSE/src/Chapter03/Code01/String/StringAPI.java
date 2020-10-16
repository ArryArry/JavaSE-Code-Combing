package Chapter03.Code01.String;

/*
    java.lang.String类: 代表字符串
        1.API文档中的描述:
            String 类代表字符串。Java 程序中的所有字符串字面值（常量: 如 "abc" ）都作为此类的实例实现(对象)。
            字符串是常量；它们的值在创建之后不能更改(但凡是你感觉它要变化的时候,其实都是产生了一个新的字符串)。
            因为字符串很常用,所以所有使用双引号""引起来的内容,都作为字符串String类的对象

        2.特点:
            (1)字符串不变：字符串的值在创建后不能被更改。
                String s1 = "abc";
                s1 += "d";//s1 = s1 + "d"; //s1 = "abcd"
                System.out.println(s1); // "abcd"
                // 内存中有"abc"，"abcd"两个对象，s1从指向"abc"，改变指向，指向了"abcd"。

            (2)因为String对象是不可变的，所以它们可以被共享。
                String s1 = "abcde";
                String s2 = "abcde";
                //内存中只有一个"abcde"对象被创建，同时被s1和s2共享。

            (3) "abc" 等效于 char[] data = { 'a' , 'b' , 'c' }
                jdk8及以前版本,String内部使用的是字符数组


        查看源代码:
            ctrl + n --> 输入类名 --> 回车

     String类的成员方法:
        1.public boolean equals(Object obj):
            将此字符串(调用方法的字符串)与指定对象(方法参数指定的字符串)进行比较,
            如果内容一模一样,返回true,否则,返回false(区分大小的)
            举例:
                s1.equals(s2): 比较s1和s2这两个字符串的内容,
                        是否一模一样,如果一样,返回true,如果不一样,返回false

        2.public boolean equalsIgnoreCase​(String str):
            将此字符串(调用方法的字符串)与指定对象(方法参数指定的字符串)进行比较,
            忽略大小写后,内容一样返回true,内容不一样返回false
            举例:
                s1.equalsIgnoreCase​(s2): 比较s1和s2这两个字符串的内容,
                忽略大小写后是否一模一样,如果一样,返回true,如果不一样,返回false

        3.public int length​(): 返回此字符串的长度(字符串中包含的字符的数量)。
            比如:
                s1.length(): 获取字符串s1中的字符数量
            注意:
                数组的长度使用length属性,用的时候后面不写()

        4.String类的底层采用的是字符数组,而数组有索引,索引从0开始,到数组长度-1
          所以字符串中的每个字符也有索引,从0开始,到字符串的长度-1
          比如:
            "abcd": 'a'--> 索引是0   'b'--> 索引是1 'c'--> 索引是2   'd'--> 索引是3

          public char charAt(int index):获取调用方法的字符串中索引编号为index处对应的字符
 */
public class StringAPI {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);//abc
        String s2 = new String(chs);//abc
        String s3 = "abc";
        String s4 = "Abc";
        String s5 = "abc";
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//true
        System.out.println("-----------------");
        //1.public boolean equals(Object obj)
        boolean result = s1.equals(s2);
        System.out.println(result);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s3.equals(s4));//false
        System.out.println(s3.equals(s5));//true
        System.out.println("-----------------");
        //2.public boolean equalsIgnoreCase​(String str)
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s1.equalsIgnoreCase(s4));//true
        System.out.println(s3.equalsIgnoreCase(s4));//true
        System.out.println(s3.equalsIgnoreCase(s5));//true

        /**
         * public int length​(): 返回此字符串的长度(字符串中包含的字符的数量)
         */
        System.out.println("".length());//0
        System.out.println(" ".length());//1
        System.out.println("hello world".length());//11

        /**
         * public char charAt(int index):获取调用方法的字符串中索引编号为index处对应的字符
         */
        String s6 = "hello";
        System.out.println(s6.length());//5
        char ch = s6.charAt(0);
        System.out.println(ch);//h
        System.out.println(s6.charAt(1));//e
        System.out.println(s6.charAt(4));//o
        System.out.println(s6.charAt(s6.length() - 1));//o
    }
}
