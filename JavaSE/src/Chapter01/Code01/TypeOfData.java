package Chapter01.Code01;

/**
 *     Java的数据类型分为两大类：
 *     基本数据类型：包括 整数 、 浮点数 、 字符 、 布尔 。
 *     引用数据类型：包括 类 、 数组 、 接口 。
 */

/**
 * 	Java程序中要求参与的计算的数据，必须要保证数据类型的一致性，如果数据类型不一致将发生类型的转换。
 *
 * 	自动类型转换
 * 		1.概念: 取值范围小的数据或者变量 可以 直接赋值给取值范围大的变量 (小萝卜可以直接放在大坑中)
 * 		2.特点:
 * 			(1)是自动完成的,不需要代码的干预
 * 			(2)byte/short/char 类型 只要参加运算,会自动转换为int类型
 * 			(3)转换规则
 * 				byte、short、char-->int-->long-->float-->double
 * 			注意:
 * 				自动类型转换,就是在数据前面按照要求补充若干字节的0
 *
 * 	强制类型转换:
 * 		1.概念:
 * 			取值范围大的数据或者变量,不能直接赋值给取值范围小的变量(大萝卜不能直接放入小坑中)
 * 			必须进行强制类型转换
 * 		2.强制类型转换格式:
 * 			转后类型 变量名称 = (转后类型)转前的数据或者变量;
 *
 * 			注意:
 * 				强制类型转换,根据要求砍掉数据前面的若干字节,如果被砍掉的字节都是0,对数据没有影响
 * 				只要被砍掉的数据中包含1,对数据没有影响
 * */
public class TypeOfData {
    public static void main(String[] args) {
        /**
         * 自动类型转换
         * ===========
         */
        //int --> long --> 自动类型转换 --> int --> long类型
        //int --> long --> long --> long
        long num = 3;//右:int类型(4个字节),左: long类型(8个字节)
        System.out.println(num);

        int i = 1;
        byte b = 2;
        //byte + int --> int + int --> int(4个字节) 结果为4个字节的int数据不能赋值给左侧 byte类型(1个字节)变量
        //大萝卜不能放入小坑中
        //byte x = b + i;
        //byte + int --> int + int --> int(4个字节) 结果为4个字节的int数据能赋值给左侧 int类型(4个字节)变量
        int x = b + i;
        System.out.println(x);

        int m = 1;
        double n = 2.5;
        //int + double --> double + double --> double(8个字节) 结果为8个字节的double数据不能赋值给左侧 int类型(4个字节)变量
        //大萝卜不能放入小坑中
        //int k = m + n;

        //int + double --> double + double --> double(8个字节) 结果为8个字节的double数据能赋值给左侧 double类型(8个字节)变量
        double k = m + n;
        System.out.println(k);

        /**
         * 强制类型转换
         * ===========
         */
        //定义变量,表示世界人口
        //int num = 6000000000;//6000000000(60亿) 默认int类型,但是已经超出了int的取值范围(21亿)

        //错误
        //大萝卜不能直接放入小坑中
        //int num = 6000000000L;//右: long(8个字节),左: int(4个字节)

        //解决方案一: 把坑变大
        //long num = 6000000000L;

        //解决方案二: 把萝卜变小
        int nums = (int)6000000000L;//把long数据,强制类型转换为int类型
        System.out.println(nums);//1705032704

        short s = 1;
        //short + int --> int + int --> int		结果为int类型(4个字节),不能赋值给左侧的short(2个字节)类型的变量
        //s = s + 1;//错误
        //强制类型转换
        s = (short)(s + 1);
        System.out.println(s);
    }
}
