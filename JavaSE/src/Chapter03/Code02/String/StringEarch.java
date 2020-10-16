package Chapter03.Code02.String;

import java.util.Scanner;

/**
 * 案例需求
 * 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 * <p>
 * 方法:
 * public char charAt(int index): 获取调用方法的字符串中索引index处对应的一个字符
 * public int length(): 获取字符串中字符的个数
 * <p>
 * 遍历字符串快捷键:
 * 字符串对象.length().fori
 * 字符串对象.length()-1.forr
 * <p>
 * 实现步骤:
 * 1.创建键盘录入Scanner对象
 * 2.获取键盘录入的字符串
 * 3.使用for循环遍历字符串
 * 4.获取当前索引在字符串中对应的字符,保存到char变量ch中
 * 5.打印当前字符
 */
public class StringEarch {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner对象
        Scanner scanner = new Scanner(System.in);
        //2.获取键盘录入的字符串
        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();
        //3.使用for循环遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //4.获取当前索引在字符串中对应的字符,保存到char变量ch中
            char ch = str.charAt(i);
            //5.打印当前字符
            System.out.println(ch);
        }
    }
}
