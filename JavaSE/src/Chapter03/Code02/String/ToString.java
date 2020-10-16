package Chapter03.Code02.String;

/**
 * String类的练习-拼接字符串
 * 需求
 * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，
 * 调用该方法， 并在控制台输出结果。
 * 例如:
 * 数组为 int[] arr = {1,2,3}; ，
 * 执行方法后的输出结果为：[1, 2, 3]
 */
public class ToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //调用打印方法
        printArray(arr);
        //调用方法,获取int数组对应的字符串
        String str = myToString(arr);
        System.out.println(str);
    }

    /**
     * 定义一个方法，把 int 数组中的数据按照指定的格式拼接(+=)成一个字符串返回
     * 三要素:
     * 1.方法名称: myToString
     * 2.参数列表: int[] array
     * 3.返回值类型: String
     * 数组内容: {1,2,3}
     * 打印格式: [1, 2, 3]
     * <p>
     * 实现步骤:
     * 1.定义String变量str,用来拼接字符串,初始化值""
     * 2.拼接"["
     * 3.使用for遍历数组
     * 3.1拼接数组元素
     * 3.2如果不是最后一个元素,拼接", "
     * 4.拼接"]"
     * 5.返回str
     */
    public static String myToString(int[] arr) {
        String str = "";
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }

    /**
     * 定义方法打印int数组的内容
     * 数组内容: {1,2,3}
     * 打印格式: [1, 2, 3]
     */
    public static void printArray(int[] arr) {
        //1.打印"[",不换行
        System.out.print("[");
        //2.使用for遍历数组
        for (int i = 0; i < arr.length; i++) {
            //2.1打印数组元素,不换行
            System.out.print(arr[i]);
            //2.2如果不是最后一个元素,打印", "
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        //3.打印"]",换行
        System.out.println("]");
    }

}
