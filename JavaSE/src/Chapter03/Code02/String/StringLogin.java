package Chapter03.Code02.String;

import java.util.Scanner;

/**
 * 用户登录案例
 * 需求
 * 已知用户名和密码，请用程序实现模拟用户登录。
 * 总共给三次机会，登录之后，给出相应的提示
 * (1)用户名和密码都相同: 提示 "登录成功"
 * (2)用户名和密码有不相同: 提示 "登录失败",还要提示剩余xx次机会
 * <p>
 * 分析
 * 1.定义两个String类型的变量userName和passWord,分别表示用户名和密码，并进行初始化
 * 2.创建键盘录入的Scanner对象
 * 3.循环次数(总共可以登录3次)确定,所以使用for循环
 * 3.1获取键盘录入的用户名和密码,分别保存在String变量inUsername和inPassword中
 * 3.2判断 如果用户输入的用户名inUsername和已经注册的用户名Username相同 并且
 * 用户输入的密码inPassword和已经注册的密码Password也相同
 * 3.3提示 "登录成功" 结束for循环
 * 3.4 否则(要么用户名不相同,要么密码不相同) 提示 "登录失败","剩余登录次数"
 */
public class StringLogin {
    public static void main(String[] args) {
        //1.定义两个String类型的变量,并初始化
        String userName = "zhangsan";
        String passWord = "123456";
        //2.创建键盘录入的Scanner对象
        Scanner sc = new Scanner(System.in);
        //3.循环次数(总共可以登录3次)确定,所以使用for循环
        for (int times = 1; times <= 3; times++) {
            //3.1获取键盘录入的用户名和密码,分别保存在String变量inUsername和inPassword中
            System.out.println("请输入用户名: ");
            String inUsername = sc.nextLine();
            System.out.println("请输入密码: ");
            String inPassword = sc.nextLine();
            //3.2判断 如果用户输入的用户名inUsername和已经注册的用户名Username相同 并且
            //用户输入的密码inPassword和已经注册的密码Password也相同
            if (inUsername.equals(userName) && inPassword.equals(passWord)) {
                //3.3提示 "登录成功" 结束for循环
                System.out.println("登录成功~~~~");
                break;//结束循环
            } else {
                //3.4 否则(要么用户名不相同,要么密码不相同) 提示 "登录失败","剩余登录次数"
                System.out.println("用户名或者密码有误,登录失败~~~");
                if (times == 3) {
                    System.out.println("您的登录次数3次已经用完...");
                } else {
                    System.out.println("您还剩余: " + (3 - times) + " 次登录机会,请珍惜~~~~");
                }
            }
        }
    }
}
