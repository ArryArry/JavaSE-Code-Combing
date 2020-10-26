package Chapter02.Code.Collection.variableArguments;

/**
 * a.什么可变参数 是指方法参数的个数可以任意,可变参数是JDK1.5的新特性 b.可变参数的格式 public static int getSum(int... a){
 *
 * } c.可变参数的本质其实就是一个数组
 *
 * 可变参数的注意事项: a.一个方法中最最最多只能有一个可变参数 b.一个方法中如果既有正常参数,又有可变参数,那么可变参数必须必须必须写在最后面
 */
public class TestVariableArguments01 {

  public static void main(String[] args) {
    //调用方法
    System.out.println(getSum());
    System.out.println(getSum(1));
    System.out.println(getSum(1, 2));
    System.out.println(getSum(1, 2, 3, 4, 5));

  }

  //定义方法,求任意个整数的和
  public static int getSum(int... a) {
    //求数组的元素之和
    int sum = 0;
    for (int i : a) {
      sum += i;
    }
    return sum;
  }
}
