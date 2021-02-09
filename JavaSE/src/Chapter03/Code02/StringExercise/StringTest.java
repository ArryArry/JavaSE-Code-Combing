package Chapter03.Code02.StringExercise;

import org.junit.Test;

/**
 * Java String常用方法的五道练习题: https://blog.csdn.net/qq_43437122/article/details/108428002
 * Java常用类_String练习题： https://blog.csdn.net/zxdspaopao/article/details/100806715 String 常用方法练习题目，解析。
 * https://blog.csdn.net/qq_41833400/article/details/89202391
 */
public class StringTest {

  /**
   * 模拟一个trim方法，去除字符串两端的空格
   */
  @Test
  public void test01() {
    String str = " abcd ";
    int len = str.length();
    int cur = 0;
    char[] val = str.toCharArray();
    // 先查找开头的空格
    while (cur < len && val[cur] <= ' ') {
      cur++; // 如果是空格则游标往后移一位
    }
    while (cur < len && val[cur] <= ' ') {
      len--;
    }
    //如果cur的值大于0或者len的值小于s.length()，那就说明trim首尾有空格，需要返回截取后的字符子串，否则不需要
    System.out.println((cur > 0) || (len < str.length()) ? str.substring(cur, len) : str);
  }

  /**
   * 将一个字符串进行反转。将字符串中指定部分进行反转。 比如"abcdefg"，反转子串"cdef"，转为"abfedcg"
   */
  @Test
  public void test02() {
    String str = "abcdefg";
    //截取要反转的字符串并转为数组
    char[] reverArr = str.substring(2, 6).toCharArray();
    //反转字符数组
    for (int i = 0; i < (reverArr.length / 2); i++) {
      char temp = reverArr[i];
      reverArr[i] = reverArr[reverArr.length - 1 - i];
      reverArr[reverArr.length - 1 - i] = temp;
    }
    //替换掉原数组中对应的字符串
    String resStr = str.replace("cdef", String.valueOf(reverArr));
    //打印
    System.out.println(resStr);
  }


  /**
   * 获取一个字符串在另一个字符串中出现的次数。 比如：获取"ab"在"abkkcadkabkebfkabkskab"中出现的次数
   */
  @Test
  public void test03() {

  }
  /*
   模拟一个trim方法，去除字符串两端的空格。
   反转键盘录入的字符串。
   将一个字符串的指定部分进行反转。
   获取一个字符串在另一个字符串中出现的次数。
   获取两个字符串中最大相同子串。
   对字符串中字符进行自然排序。
   键盘录入QQ号码，验证格式的正确性。
   统计小字符串在大字符串中出现的次数。
   生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
   判断回文字符串。如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，比如mom，dad，noon。
   校验密码是否合法。  必须至少9个字符。  必须至少2个大写字符。  必须包含小写字母和数字。
   筛选字符串。  - 定义数组，存入多个字符串。  - 删除长度大于5的字符串，打印删除后的数组。
   替换某字符串中的某字符串。 - 键盘录入一个srcStr字符串，再录入一个delStr字符串。 - 删除该字srcStr符串中的所有delStr字符串。 - 并且统计delStr字符串在srcStr中出现的次数。
   定义Handleable接口，具备一个处理字符串数字的抽象方法方法String handleString(String num);  处理方式1：取整数部分。  处理方式2：保留指定位小数，四舍五入。
   已知一个字符串String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";  要求统计出现次数最多的字母及其出现的次数。不区分大小写。
   已知字符串String str = "1.hello2.world3.java4.string";要求拆分出每一个单词，并遍历显示
   给出一个随机字符串，判断有多少字母？多少数字？
   题目：如：请输入一个日期（格式如：**月**日****年）经过处理得到：****年**月**日  
   题目以下是一段歌词，请从这段歌词中统计出朋友出现的次数。
   编写敏感词过滤程序
   计算并输出21世纪的闰年，计算程序的执行时间。
   编写一个程序，设定一个有大小写字母的字符串，先将字符串的大写字符输出，再将字符串中的小写字符输出。
   编写程序，(Scanner)当以年-月-日的格式输入一个日期时，输出其该年是否为闰年，该月有几天，该日是星期几
   计算某年、某月、某日和某年、某月、某日之间的天数间隔和周数。
   */

}
