package Chapter01.Code01;

/**
 * @author: ArryArry
 * @description: JavaSE基础语法之常量和变量
 * @data: 2020-10-08 16:38
 **/

/**
 * 注释: 对程序中的内容进行解释说明的,是给程序员看的,不参与编译和运行,不影响程序的执行效率
 * 注释的分类:
 * 单行注释:   // 后面只能写一行
 * 多行注释:      可以写多行内容
 * 这里定义了一个类 名字是 ConstantsAndVariables 而且public class 是固定写法
 * class 后面的名称 必须和文件名称保持一致
 **/

/**
 * 数学中常数
 * 		y = x + 10;//10 是一个常量  	整数
 * 		b = a + 6.6;//6.6 是一个常量 	小数
 *
 * 	常量:
 * 		1.概念: 在程序的执行过程中,值不可以发生改变的量
 * 		2.分类:
 * 			(1)整数:	100,-200
 * 			(2)小数:	6.6,-8.8
 * 			(3)字符:
 * 				字符常量必须使用单引号''引起来,而且''中只能有一个字符(不能没有字符,也不能有多个字符)
 * 				举例:
 * 					A:		'a'			正确
 * 					B:		''			错误,不能没有内容
 * 					C: 		' '			正确,有一个字符空格
 * 					D:		'ab'		错误,不能有2个字符
 * 					E:		'好'		正确
 *
 * 			(4)字符串:
 * 				字符串必须使用双引号""引起来,""中可以写多个字符(不写,1个,2个,...)
 * 					A:		"a"			正确
 * 					B:		""			正确
 * 					C: 		" "			正确,有一个字符空格
 * 					D:		"ab"		正确
 * 					E:		"好"		正确
 * 					F:		"真的好像你"		正确
 *
 * 			(5)布尔:
 * 				布尔常量只有两个值: true(正确的,对的,成立的),false(错误的,错的,不成立的)	不用加""
 *
 * 			(6)空常量: null	不用加""
 *
 *
 */

/*
	变量定义的注意事项:
		1.变量名称：在同一个大括号范围内，变量的名字不可以相同。
		2.定义的变量，不赋值不能使用。
		3.定义long类型的变量时，需要在整数的后面加L（大小写均可，建议大写）。
			因为整数默认是int类型，整数太大可能超出int范围。
		4.定义float类型的变量时，需要在小数的后面加F（大小写均可，建议大写）。因为浮点数的默认类型是double，
			double的取值范围是大于float的，类型不兼容。
*/
public class ConstantsAndVariables {
    /**
     * main 是程序的入口
     * public static void main 目前是固定写法
     * String[] args 目前是固定写法
     * @param args
     */
    public static void main(String[] args) {
        //这是输出语句
        System.out.println("内容原样输出到控制台");

        /**
         * 打印6种类型的常量
         * ===============
         */
        //整数
        System.out.println("正整数："+100);
        System.out.println("负整数"+ -100);

        //小数
        System.out.println("正小数"+6.6);
        System.out.println("负小数"+-8.8);

        //字符
        //System.out.println('');//错误的,不能没有字符
        System.out.println('a');
        //System.out.println('ab');//错误的,不能有2个及以上的字符
        System.out.println('好');//

        //字符串
        System.out.println("");
        System.out.println("a");
        System.out.println("ab");
        System.out.println("好");
        System.out.println("真的好想你!!!!");

        //布尔
        System.out.println(true);
        System.out.println(false);

        //空常量
        //System.out.println(null);//错误的,不能直接输出空常量

        /**
         * 定义所有基本数据类型的变量
         * ===============
         */
        //定义字节型变量
        byte b = 100;
        System.out.println(b);
        //定义短整型变量
        short s = 1000;
        System.out.println(s);
        //定义整型变量
        int i = 123456;
        System.out.println(i);
        //定义长整型变量
        long l = 12345678900L;
        System.out.println(l);
        //定义单精度浮点型变量
        float f = 5.5F;
        System.out.println(f);
        //定义双精度浮点型变量
        double d = 8.5;
        System.out.println(d);
        //定义布尔型变量
        boolean bool = false;
        System.out.println(bool);
        //定义字符型变量
        char c = 'A';
        System.out.println(c);

        /**
         * 变量定义的注意事项
         * ===============
         */
        int a = 10;
        System.out.println(a);
        //错误,变量的名字不可以相同。
        //int a = 20;
        //System.out.println(a);

        //定义int类型的变量h,未赋值
        int h;
        //System.out.println(h);//错误的,没有值,不能使用

        //long num = 6000000000;//6000000000: 60亿,错误: 6000000000默认是int类型(21亿),但是已经远远超过int类型的取值范围了
        long num = 6000000000L;//6000000000L: long类型了
        System.out.println(num);

        //float f = 6.6;//错误的,6.6默认double类型,占8个字节,而左侧float占4个字节
        float g = 6.6F;
        System.out.println(f);

    }
}
