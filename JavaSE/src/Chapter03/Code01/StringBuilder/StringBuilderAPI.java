package Chapter03.Code01.StringBuilder;

import org.junit.Test;

/**
 * 1⃣ java.lang.StringBuilder类: 代表字符串缓冲区,支持可以改变的字符串
 * 底层: 是一个默认长度为16的字符数组
 * 构造方法:
 * public StringBuilder() ：构造一个空的StringBuilder容器,内部是一个长度为16的字符数组
 * public StringBuilder(String str) ：把构造方法参数String对象str,转换成为StringBuilder对象
 * ⚠️打印引用变量,默认调用toString方法
 * <p>
 * 2⃣ StringBuilder的常用方法
 * public StringBuilder append(...) ：添加任意类型数据的字符串形式，并返回当前对象自身。做原样添加
 * public StringBuilder reverse() ：返回反转的字符序列
 * public String toString() ：将当前StringBuilder对象转换为String对象。
 * <p>
 * ⚠️StringBuilder类的append方法,reverse方法有返回值,返回的就是当前调用方法的StringBuilder对象
 * StringBuilder支持链式编程
 * 前提: 对象调用方法后,方法返回调用方法的对象本身
 * <p>
 * 3⃣ StringBuilder和String相互转换
 * 1.String --> StringBuilder
 * 构造方法:
 * public StringBuilder(String str): 把构造方法String参数str,转换成StringBuilder对象
 * <p>
 * 构造方法:
 * public StringBuilder(): 创建一个空的StringBuilder对象
 * 再调用append()方法
 * <p>
 * 2.StringBuilder --> String
 * 成员方法:
 * public String toString(): 把调用toString方法的StringBuilder对象,转换成String对象
 */
public class StringBuilderAPI {

    /**
     * @title: StringBuilder构造方法
     * @description: public StringBuilder() 、public StringBuilder(String str)
     * @date: 2020-10-16 15:00
     */
    @Test
    public void test01() {
        //public StringBuilder() ：构造一个空的StringBuilder容器,内部是一个长度为16的字符数组
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        /*String s = sb2.toString();
        System.out.println("hello"+s+"world");//helloworld*/
        System.out.println(sb.toString());

        //public StringBuilder(String str) ：把构造方法参数String对象str,转换成为StringBuilder对象
        StringBuilder s = new StringBuilder("HelloWorld");
        System.out.println(s);
        System.out.println(s.toString());
    }

    /**
     * @title: StringBuilder的常用方法
     * @description: append(...)、 reverse() 、toString()
     * @date: 2020-10-16 15:01
     */
    @Test
    public void test02() {
        //创建StringBuilder对象
        StringBuilder sb2 = new StringBuilder();
        sb2.append(97);
        sb2.append('a');
        sb2.append("hello");
        sb2.append(true);
        System.out.println(sb2.toString());//97ahellotrue

        //public StringBuilder reverse()：返回反转的字符序列
        sb2.reverse();
        System.out.println(sb2.toString());//toString方法可以省略

        //public String toString() ：将当前StringBuilder对象转换为String对象。
        String str = sb2.toString();
        System.out.println(str);
    }

    /**
     * @title: StringBuilder链式编程
     * @description: 对象调用方法后, 方法返回调用该方法的对象本身
     * @date: 2020-10-16 15:02
     */
    @Test
    public void test03() {
        StringBuilder sb = new StringBuilder("A");
        StringBuilder sb2 = sb.append("B");
        StringBuilder sb3 = sb2.append("C");
        System.out.println(sb);//ABC
        System.out.println(sb2);//ABC
        System.out.println(sb3);//ABC
        //发现结果都是true
        //那么sb,sb2,sb3指向的是同一个StringBuilder对象
        System.out.println(sb == sb2);//true
        System.out.println(sb == sb3);//true
        System.out.println(sb2 == sb3);//true
        System.out.println("------------------");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("hello").append(97).append('a').append(false).append(8.8);
        System.out.println(sb4);//hello97afalse8.8
    }

    /**
     * @title: StringBuilder和String相互转换
     * @description: 1.String --> StringBuilder    2.StringBuilder --> String
     * @date: 2020-10-16 15:15
     */
    @Test
    public void test04() {
        //StringBuilder sb = "hello";//左右类型不匹配,错误的

        //public StringBuilder(String str): 把构造方法String参数str,转换成StringBuilder对象
        StringBuilder sb = new StringBuilder("hello");

        //public StringBuilder(): 创建一个空的StringBuilder对象
        StringBuilder sb2 = new StringBuilder();
        //再调用append()方法
        sb2.append("hello");


        //public String toString(): 把调用toString方法的StringBuilder对象,转换成String对象
        String s1 = sb.toString();
        String s2 = sb2.toString();

        System.out.println(s1);
        System.out.println(s2);
    }

}
