package Chapter03.Code02.String;

import java.util.Scanner;

/**
 * String类的练习-统计字符次数
 * 需求
 * 键盘录入一个字符串，统计该字符串中大写字母，小写字母，数字字符以及其它字符出现的次数
 * <p>
 * 实现步骤:
 * 1.创建键盘录入Scanner对象
 * 2.获取键盘录入的字符串,保存到String变量str中
 * 3.定义四个int类型的变量,初始化值分别为0,用来统计不同类型的字符的个数
 * int bigCount = 0;//统计大写字母的数量
 * int smallCount = 0;//统计小写字母的数量
 * int numCount = 0;//统计数字字符的数量
 * int otherCount = 0;//统计其它字符的数量
 * 4.使用for循环遍历字符串
 * 4.1 获取当前索引对应的字符,保存到char类型的变量ch中
 * 4.2 判断 如果 ch中是大写字母(ch>= 'A' && ch<='Z'): bigCount++
 * 4.3 判断 如果 ch中是小写字母(ch>= 'a' && ch<='z'): smallCount++
 * 4.4 判断 如果 ch中是数字字符(ch>= '0' && ch<='9'): numCount++
 * 4.5 否则(其它字符): otherCount++
 * 5.for循环结束,打印四个计数器的值
 */
public class StringCount {
    public static void main(String[] args) {
        int bigCount = 0;//统计大写字母的数量
        int smallCount = 0;//统计小写字母的数量
        int numCount = 0;//统计数字字符的数量
        int otherCount = 0;//统计其它字符的数量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行任意的字符串：");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            } else {
                otherCount++;
            }
        }
        //System.out.println("大写字母的数量:"+bigCount+"小写字母的数量:"+smallCount+"数字字符的数量:"+numCount+"其它字符的数量:"+otherCount);
        //for循环结束,打印四个计数器的值
        System.out.println("字符串" + str + "中大写字母数量:" + bigCount + "个");
        System.out.println("字符串" + str + "中小写字母数量:" + smallCount + "个");
        System.out.println("字符串" + str + "中数字字符数量:" + numCount + "个");
        System.out.println("字符串" + str + "中其它字符数量:" + otherCount + "个");
    }
}
