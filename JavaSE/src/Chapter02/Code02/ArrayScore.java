package Chapter02.Code02;

import java.util.Scanner;
/**
 * @author: ArryArry
 * @description: 评委打分
 * @data: 2020-10-14 20:06
 **/

/**
 * 评委打分
 * 需求
 * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100(包含0和100)的整数分(键盘录入)。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
 *
 * 实现步骤:
 * 1.创建长度为6的int数组array
 * 2.创建键盘录入Scanner对象
 * 3.通过键盘录入数据给数组array中6个元素赋值
 * 4.定义求int数组array元素和的方法getSum
 * 5.定义求int数组array元素最大值的方法getMax
 * 6.定义求int数组array元素最小值的方法getMin
 * 7.调用求数组元素和的方法getSum,获取求和结果,保存到int变量sum中
 * 8.调用求数组元素最大值的方法getMax,获取最大值结果,保存到int变量max中
 * 9.调用求数组元素最小值的方法getMin,获取最小值结果,保存到int变量min中
 * 10.计算平均分: (sum - max - min)/(array.length-2)
 * 11.打印平均分
 */
public class ArrayScore {
    public static void main(String[] args) {
        //调用方法,获取int数组
        int[] array = getArray();
        //调用方法,获取平均值
        int avg = getAvg(array);
        //打印平均分
        System.out.println("数组内容: ");
        printArray(array);
        System.out.println("按照规则计算出来的平均分: " + avg);
    }

    /**
     * 定义getArray方法,返回一个int数组
     *
     * @return
     */
    public static int[] getArray() {
        //1.创建长度为6的int数组array
        int[] array = new int[6];
        System.out.println("请分别输入6个分数：");
        //2.创建键盘录入Scanner对象
        Scanner scanner = new Scanner(System.in);
        //3.通过键盘录入数据给数组array中6个元素赋值
        for (int i = 0; i < 6; i++) {
            System.out.println("输入第" + (i + 1) + "个分数:");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /**
     * 定义求int数组array元素和的方法getSum
     *
     * @param array 传递过来的数组
     * @return
     */
    public static int getSum(int[] array) {
        //1.定义int类型求和变量sum,初始值0
        int sum = 0;
        //2.for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            //3.把当前元素累加到求和变量sum中
            sum += array[i];
        }
        //4.返回求和变量sum
        return sum;
    }

    /**
     * 定义求int数组array元素最大值的方法getMax
     *
     * @param array 传递过来的数组
     * @return
     */
    public static int getMax(int[] array) {
        //1.假设索引0对应的元素是最大的,保存到int变量max中
        int max = array[0];
        //2.for循环遍历数组(从索引1开始)
        for (int i = 1; i < array.length; i++) {
            //3.如果当前元素>max
            if (array[i] > max) {
                //4.把当前元素赋值给max
                max = array[i];
            }
        }
        //5.返回max
        return max;
    }

    /**
     * 定义求int数组array元素最小值的方法getMin
     *
     * @param array
     * @return
     */
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * 定义getAvg方法,获取方法参数int数组的平均值
     *
     * @param array
     * @return
     */
    public static int getAvg(int[] array) {
        //1.调用求数组元素和的方法getSum,获取求和结果,保存到int变量sum中
        int sum = getSum(array);

        //2.调用求数组元素最大值的方法getMax,获取最大值结果,保存到int变量max中
        int max = getMax(array);

        //3.调用求数组元素最小值的方法getMin,获取最小值结果,保存到int变量min中
        int min = getMin(array);

        //4.计算平均分: (sum - max - min)/(array.length-2)
        int avg = (sum - max - min) / (array.length - 2);

        //5.返回平均值
        return avg;
    }

    /**
     * 打印数组
     *
     * @param array
     */
    public static void printArray(int[] array) {
        //1.打印"[",不换行
        System.out.print("[");
        //2.使用for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            //2.1打印元素
            System.out.print(array[i]);
            //2.2如果不是最后一个元素,打印", ",不换行
            if (i != array.length - 1) {
                System.out.print(", ");
            }

        }
        //3.打印"]",换行
        System.out.println("]");
    }
}
