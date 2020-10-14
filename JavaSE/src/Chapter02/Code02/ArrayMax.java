package Chapter02.Code02;

/**
 * 获取数组元素的最大值
 * 实现步骤:
 * 1.定义长度为5的int数组,数组名array,存储5个int数据,分别代表颜值
 * 2.假设数组中索引为0的元素是最大的,把0索引元素值保存int变量max中
 * 3.使用for循环获取后面的(从1索引开始)所有元素
 * 4.使用if进行判断,如果数组当前元素值>假设的最大值(max中)
 * 把数组当前元素重新赋值给变量max
 * 5.打印max的值
 * 求最小值/和/平均值?
 * 有一个整数数组。
 * 请编写代码，让数组的最后一个元素代表个位，倒数第二个元素代表十位，以此类推。最终得到一个大的整数。
 * 原数组：{1,3,5,7,9}
 * 最终得到的结果：13579
 */
public class ArrayMax {
    public static void main(String[] args) {

        int[] array = {12, 34, 56, 65, 76};
        int max = array[0];
        int min = array[4];
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;

        System.out.println("min的值" + min);
        System.out.println("max的值" + max);
        System.out.println("avg的值" + avg);

        //原数组：{1,3,5,7,9}
        //最终得到的结果：13579
        int[] num = {1, 3, 5, 7, 9};
        for (int i = num.length - 1; i >= 0; i--) {
            double a = Math.pow(10, i);
            double nums = a * num[i];
            System.out.println(nums);
        }
        /*int[] arr ={1,3,5,7,9};
        arr[0] = arr[0]*10000;
        arr[1] = arr[1]*1000;
        arr[2] = arr[2]*100;
        arr[3] = arr[3]*10;
        int nums = 0;
        for (int i = 0; i < arr.length ; i++) {
            nums += arr[i];
        }
        System.out.print("最终的结果为："+ nums );*/
    }
}
