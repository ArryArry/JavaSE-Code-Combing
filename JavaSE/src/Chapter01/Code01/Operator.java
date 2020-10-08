package Chapter01.Code01;

/**
 * 算数运算符
 * 		运算符和表达式
 * 		运算符：对常量或者变量进行操作的符号
 * 		表达式：用运算符把常量或者变量连接起来符合java语法的式子就可以称为表达式。
 * 		不同运算符连接的表达式体现的是不同类型的表达式。
 * 		举例说明：
 * 		+：是运算符，并且是算术运算符。
 * 		a + b：是表达式，由于+是算术运算符，所以这个表达式叫算术表达式。
 *
 * 		+: 加法运算
 * 	    ⚠️
 *          1.在数学运算中,代表的是加法运算
 *          2.+符号在字符串中的作用在遇到字符串的时候，表示连接、拼接的含义。
 * 		-: 减法运算
 * 		*: 乘法运算
 * 		/: 除法运算
 * 			数学中:
 * 				被除数/除数 = 商(/: 求的就是商) ..... 余数
 * 		%:
 * 		取模运算(取余数)，两个数字相除取余数
 * 		数学中:
 * 				被除数/除数 = 商(/: 求的就是商) ..... 余数(%: 求的就是余数)
 *
 * 	%的作用:
 * 		1.判断数字的奇偶性:
 * 			偶数: 数字%2 结果  0
 * 			奇数: 数字%2 结果  1
 * 		2.判断一个数字能否被另外一个数字整除
 * 		3.使用/和% 可以 求出某个数字的每一位上的数字
 * 			比如:
 * 				1234
 * 				个位: 4
 * 				十位: 3
 * 				百位: 2
 * 				千位: 1
 *
 * 	赋值运算符
 * 		1.基本赋值运算符: =  只是完成赋值的动作
 * 		2.扩展赋值运算符:
 * 			a += b		a = a + b
 * 			a -= b		a = a - b
 * 			a *= b		a = a * b
 * 			a /= b		a = a / b
 * 			a %= b		a = a % b
 * 扩展赋值运算符的特点
 * 		+=,-=,/=,*=,%=:
 * 			如果左右两侧的数据类型不一致,隐藏进行强制类型转换
 * 		byte/short/char 只要参加运算,会自动转换为int类型
 *
 * 自增(++)自减(--)运算符
 * 		1.作用:
 * 			让变量的值增加(++)或者减少(--)1
 *
 * 		2.使用格式:
 * 			(1)可以写在变量的前面:	++a,--a
 * 			(2)可以写在变量的后面:	a++,a--							最常用的
 *
 * 		3.使用特点:
 * 			(1)单独使用: 没有其它的运算参与
 * 				前++/-- 或者 后++/--: 作用相同,都是让变量的值增加1或者减少1
 *
 * 			(2)混合使用: 和其它运算符(赋值/打印)一起进行运算
 * 				有重大区别
 * 				前++/--: 先给变量++/--,然后再使用变量
 * 				后++/--: 先使用变量,后给变量++/--
 *
 * 		最常用的:
 * 			a++:	a的值增加1
 * 			a--:	a的值减少1
 */
public class Operator {
    public static void main(String[] args) {
        /**
         * %的作用
         * =============
         */
        System.out.println(6%2);//0  说明6是偶数
        System.out.println(11%2);//1  说明1是奇数
        System.out.println(100%25);//0  说明100可以被25整除
        System.out.println(101%25);//1  说明101不可以被25整除
        System.out.println("---------------------");//1  说明101不可以被25整除

        //定义int变量
        int num = 1234;
        //个位
        int ge = num%10;
        //十位
        //System.out.println(123%10);//如何获取123?
        //System.out.println(1234/10);//123
        int shi = num/10%10;
        //百位
        //System.out.println(1234/100);//12
        //System.out.println(1234/100%10);
        int bai = num/100%10;
        //千位
        int qian = num/1000%10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        System.out.println(qian);

        /**
         * 赋值运算符
         * =============
         */
        int a = 20,b = 10;
        a += b;//a = a + b = 20 + 10
        System.out.println(a);//30
        System.out.println(b);//10

        int c = 100,d = 25;
        c /= d; //c = c / d = 100 / 25 = 4

        System.out.println(c);//4
        System.out.println(d);//25

        int e = 101,f = 25;
        e %= f; //e = e % f = 101 % 25 = 1
        System.out.println(e);//1
        System.out.println(f);//25

        /**
         * 扩展赋值运算符的特点
         * ===============
         */
        short s = 2;
        //short + int --> int + int --> int  结果int类型(4个字节) 不能直接赋值给左侧 short类型(2个字节)的变量
        //s = s + 1;

        //需要强制类型转换
        //s = (short)(s + 1);
        s += 1;//s = (short)(s + 1);
        System.out.println(s);


        /**
         * 自增(++)自减(--)运算符
         * ===================
         */
        int a1 = 2;
        //单独使用
        a1++;//a = a + 1
        System.out.println(a1);//3

        int b1 = 2;
        ++b1;//b = b + 1
        System.out.println(b1);
        System.out.println("--------------------------");


        int c1 = 5;
        //因为++在c的后面,所以先使用c的值(5)赋值给变量d,这样d的值就是5,然后c的值再+1,c变成6
        int d1 = c1++;
        System.out.println(c1);//6
        System.out.println(d1);//5
        System.out.println("--------------------------");


        int e1 = 10;
        //因为++在e的前面,所以先给e的值+1,e变成11,然后把11赋值给f,这样f的值11
        int f1 = ++e1;
        System.out.println(e1);//11
        System.out.println(f1);//11


        int g1 = 6;
		/*
			从左向右计算
			先计算++g: 因为++在前面,所以先给g的值+1,g变成7,在使用g的值和后面的表达式进行运算
			7 + (g++):
			(g++): 因为++在后面,先使用g的值(7)和前面的数字7进行运算 7+7 = 14,把14赋值给变量h ,最后g的值再+1,g变成8
		*/
        int h1 = (++g1) + (g1++);
        System.out.println(h1);//14
        System.out.println(g1);//8

    }
}
