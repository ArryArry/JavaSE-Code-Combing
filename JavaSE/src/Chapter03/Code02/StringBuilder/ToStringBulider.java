package Chapter03.Code02.StringBuilder;

import java.util.Arrays;

/**
 * StringBuilder练习-字符串拼接
 * 需求
 * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法
 * 并在控制台输出结果。
 * 例如
 * 数组为int[] arr = {1,2,3};
 * 执行方法后的输出结果为：[1, 2, 3]
 * <p>
 * 实现步骤:
 * 1.定义方法myToString,功能是返回int数组的字符串表现形式
 * 2.定义int类型的数组array,并进行初始化
 * 3.调用方法myToString,传递int数组array,获取String结果,保存到String变量str中
 * 4.打印str
 */
public class ToStringBulider {
    public static void main(String[] args) {
        //2.定义int类型的数组array,并进行初始化
        int[] array = {1, 2, 3};
        //3.调用方法myToString,传递int数组array,获取String结果,保存到String变量str中
        String str = myToString(array);
        //4.打印str
        System.out.println(str);

        /**
         * 调用Arrays类中的方法toString:
         *   1.如果数组没有内容: 返回"[]"
         *   2.如果数组是null: 返回"null"
         */
        //调用方法myToString,传递int数组array,获取String结果,保存到String变量str中
        String strs = Arrays.toString(array);
        array = new int[]{};//没有元素的数组
        System.out.println(Arrays.toString(array));//[]
        array = null;
        System.out.println(Arrays.toString(array));//null
    }

    /**
     * 定义方法myToString,功能是返回int数组的字符串表现形式
     * 三要素:
     * 1.方法名称: myToString
     * 2.参数列表: int[] array
     * 3.返回值类型: String
     * <p>
     * 原数组: {1,2,3}
     * 字符串格式: [1, 2, 3]
     * 实现步骤:
     * 1.定义StringBuilder对象sb,用来拼接字符串,初始化值"["
     * 2.遍历数组
     * 2.1向StringBuilder对象sb中拼接数组元素
     * 2.2如果不是最后一个元素,向StringBuilder对象sb中拼接", "
     * 3.向StringBuilder对象sb中拼接"]"
     * 4.把StringBuilder对象sb,转换成String对象
     * 5.返回String对象
     *
     * @param array
     * @return
     */
    public static String myToString(int[] array) {
        //1.定义StringBuilder对象sb,用来拼接字符串,初始化值"["
        StringBuilder sb = new StringBuilder("[");

        //2.遍历数组
        for (int i = 0; i < array.length; i++) {
            //2.1向StringBuilder对象sb中拼接数组元素
            sb.append(array[i]);
            //2.2如果不是最后一个元素,向StringBuilder对象sb中拼接", "
            if (i != array.length - 1) {
                sb.append(", ");
            }
        }
        //3.向StringBuilder对象sb中拼接"]"
        sb.append("]");

        //4.把StringBuilder对象sb,转换成String对象
        String str = sb.toString();

        //5.返回String对象
        return str;
    }

    /**
     * 定义方法myToString,功能是返回int数组的字符串表现形式
     * 三要素:
     * 1.方法名称: myToString
     * 2.参数列表: int[] array
     * 3.返回值类型: String
     * <p>
     * 原数组: {1,2,3}
     * 字符串格式: [1, 2, 3]
     * 实现步骤:
     * 添加健壮性的判断
     * 1.获取数组的最大索引
     * 2.如果数组中没有元素(长度为0)
     * 3.定义StringBuilder对象sb,用来拼接字符串,初始化值"["
     * 4.遍历数组
     * 4.1向StringBuilder对象sb中拼接数组元素
     * 4.2如果是最后一个元素,向StringBuilder对象sb中拼接"]",直接返回StringBuilder对应的String对象
     *
     * @param array
     * @return
     */
    public static String myToStringPlus(int[] array) {
        //添加健壮性的判断
        if (array == null) {
            return "null";
        }

        //1.获取数组的最大索引
        int maxIndex = array.length - 1;

        //2.如果数组中没有元素(长度为0)
        if (maxIndex == -1) {
            return "[]";
        }

        //3.定义StringBuilder对象sb,用来拼接字符串,初始化值"["
        StringBuilder sb = new StringBuilder("[");

        //4.遍历数组
        for (int i = 0; ; i++) {
            //4.1向StringBuilder对象sb中拼接数组元素
            sb.append(array[i]);

            //4.2如果是最后一个元素,向StringBuilder对象sb中拼接"]",直接返回StringBuilder对应的String对象
            if (i == maxIndex) {
                return sb.append("]").toString();
            }
            //4.3说明不是最后一个元素
            sb.append(", ");
        }
    }
}
