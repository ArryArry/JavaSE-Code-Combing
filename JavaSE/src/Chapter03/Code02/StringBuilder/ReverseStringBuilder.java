package Chapter03.Code02.StringBuilder;

import java.util.Scanner;

/**
 * 需求
 * 定义一个方法，实现字符串反转。
 * 键盘录入一个字符串，调用该方法后，在控制台输出结果
 * 例如，键盘录入abc，输出结果 cba
 * <p>
 * 实现步骤:
 * 1.定义方法myReverseString,完成字符串反转,并返回反转后的字符串
 * 2.创建键盘录入Scanner对象
 * 3.获取键盘录入的字符串,保存到String变量str中
 * 4.调用方法myReverseString,传递字符串str,获取反转后的结果,保存到新的字符串newStr中
 * 5.打印翻转后的结果newStr
 */
public class ReverseStringBuilder {
    public static void main(String[] args) {
        //2.创建键盘录入Scanner对象
        Scanner sc = new Scanner(System.in);

        //3.获取键盘录入的字符串,保存到String变量str中
        System.out.println("请输入您要反转的字符串:");
        String str = sc.nextLine();

        //4.调用方法myReverseString,传递字符串str,获取反转后的结果,保存到新的字符串newStr中
        String newStr = myReverseString(str);

        //5.打印翻转后的结果newStr
        System.out.println("反转后的字符串内容: " + newStr);
    }

    /**
     * 定义方法myReverseString,完成字符串反转,并返回反转后的字符串
     * 三要素:
     * 方法名称:   myReverseString
     * 参数列表:   String str
     * 返回值类型: String
     * 实现步骤:
     * 1.把方法参数String变量str,转换成StringBuilder对象
     * 2.StringBuilder对象调用reverse方法,进行反转
     * 3.StringBuilder对象调用toString方法,把StringBuilder对象转换成String对象
     * 4.返回转换后的String对象
     *
     * @param str
     * @return
     */
    public static String myReverseString(String str) {
        //1.把方法参数String变量str,转换成StringBuilder对象
        StringBuffer newStr = new StringBuffer();
        //2.倒着遍历字符串
        for (int i = str.length() - 1; i >= 0; i--) {
            //3.获取当前字符
            char ch = str.charAt(i);
            //4.把当前字符追加到String变量newStr
            newStr.append(ch);
        }
        //5.for循环结束,直接返回String变量newStr
        return newStr.toString();

        //一句话搞定
        //return new StringBuilder(str).reverse().toString();
    }
}
