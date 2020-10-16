package Chapter03.Code02.String;

import java.util.Scanner;

/**
 * String类的练习-字符串反转
 * 需求:
 * 定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
 * <p>
 * 分析:
 * 1.定义方法myReverseString,作用反转字符串
 * 2.创建键盘录入Scanner对象
 * 3.获取键盘录入的字符串,保存String变量str中
 * 4.调用方法myReverseString,传递键盘录入的字符串,获取反转后的字符串,保存到String变量newStr中
 * 5.打印变量newStr
 */
public class ReverseString {
    public static void main(String[] args) {
        //2.创建键盘录入Scanner对象
        Scanner sc = new Scanner(System.in);

        //3.获取键盘录入的字符串,保存String变量str中
        System.out.println("请输入您要反转的字符串:");
        String str = sc.nextLine();

        //4.调用方法myReverseString,传递键盘录入的字符串,获取反转后的字符串,保存到String变量newStr中
        String newStr = myReverseString(str);

        //5.打印变量newStr
        System.out.println("反转后的字符串内容: " + newStr);
    }

    /**
     * 定义方法myReverseString,作用反转字符串
     * 三要素:
     * 1.方法名称: myReverseString
     * 2.参数列表: String str
     * 3.返回值类型: String
     * <p>
     * 实现步骤:
     * 1.定义String变量newStr,用来拼接字符串,初始化值""
     * 2.倒着遍历字符串
     * 3.获取当前字符
     * 4.把当前字符拼接到String变量newStr
     * 5.for循环结束,直接返回String变量newStr
     *
     * @param str
     * @return newStr
     */
    public static String myReverseString(String str) {
        //1.定义String变量newStr,用来拼接字符串,初始化值""
        String newStr = "";
        //2.倒着遍历字符串
        for (int i = str.length() - 1; i >= 0; i--) {
            //3.获取当前字符
            char ch = str.charAt(i);
            //4.把当前字符拼接到String变量newStr
            //newStr = newStr + ch;
            newStr += ch;
        }
        //5.for循环结束,直接返回String变量newStr
        return newStr;
    }

}
