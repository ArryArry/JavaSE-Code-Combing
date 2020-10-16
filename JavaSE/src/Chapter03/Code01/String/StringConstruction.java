package Chapter03.Code01.String;


/*
    String类的构造方法
        1.public String(): 创建一个空白字符串对象，不含有任何内容.等价于""

        2.public String(char[] chs): 把构造方法参数字符数组,转换成字符串对象
            参数:
                char[] chs: 字符数组

        3.public String(byte[] bys): 把构造方法参数字节数组,转换成字符串对象
            参数:
                byte[] bys: 字节数组

        4.String s = "abc";
            直接赋值的方式创建字符串对象，内容就是abc
 */
public class StringConstruction {
    public static void main(String[] args) {
        //1.public String(): 创建一个空白字符串对象，不含有任何内容.等价于""
        String s1 = new String();
        System.out.println("hello" + s1 + "world");

        //创建字符数组
        char[] chs = {'a', 'b', 'c'};
        //2.public String(char[] chs): 把构造方法参数字符串,转换成字符串对象
        String s2 = new String(chs);
        System.out.println(s2);//abc

        //字节数组
        byte[] bs = {97, 98, 99};
        //3.public String(byte[] bys): 把构造方法参数字节数组,转换成字符串对象
        String s3 = new String(bs);//查看ASCII码表
        System.out.println(s3);//abc

        //4.""引起来的也是String的对象,而且非常常用
        String s4 = "abc";
        System.out.println(s4);//abc
    }
}
