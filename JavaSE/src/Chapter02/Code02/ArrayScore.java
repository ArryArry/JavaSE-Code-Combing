package Chapter02.Code02;

/**
 * 评委打分
 * 需求
 * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100(包含0和100)的整数分(键盘录入)。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
 * <p>
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

    }
}
