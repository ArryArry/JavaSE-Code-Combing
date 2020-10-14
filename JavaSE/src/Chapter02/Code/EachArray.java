package Chapter02.Code;

/**
 * 数组遍历：
 * 就是将数组中的每个元素分别获取出来，就是遍历。遍历也是数组操作中的基石。
 * 数组遍历快捷键:
 * 数组名称.fori
 */
public class EachArray {
    public static void main(String[] args) {
        //定义int类型的数组,名称叫array,存储int数据 100,200,300
        int[] array = {100, 200, 300};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("------------");

        //以上代码重复,只有数字0,1,2是不同的
        for (int i = 0; i < 3; i++) {
            System.out.println("索引: " + i + ", 对应的元素值: " + array[i]);
        }
        System.out.println("------------");

        //以上代码数字3写死了,可以使用数组长度(数组名称.length)代替
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("------------");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
