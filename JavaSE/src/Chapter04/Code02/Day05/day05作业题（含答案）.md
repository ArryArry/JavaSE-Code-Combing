# 一、选择题

## 知识点

包装类

###  题目1（加强训练）

 读代码,控制台输出的结果为? （）

```java
public class IntegerDemo {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + 10);
        int i = Integer.parseInt(str);
        System.out.println(i + 10);
    }
}
```

A:  12310,133

B:  133,13310

C:  12310,13310

D:  133,133



答案：A



###  题目2（加强训练）

阅读代码,控制台输出的结果为? （）

```java
public class IntegerDemo {
    public static void main(String[] args) {
        String str = "1a3";
        Integer it = new Integer(str);
        int i = it.intValue();
        System.out.println(i);
    }
}
```

A:  1a3

B:  13

C:  运行报错,字符串内容必须是数字字符

D:  1



答案：C



###  题目3（加强训练）

阅读代码,控制台要打印110横线需要填写什么? （）

```java
public class IntegerDemo {
    public static void main(String[] args) {
        int i = 1;
        Integer it = new Integer(i);
        String s = ___;
        System.out.println(s + 10);
    }
}
```

A:  it

B:  it.toString();

C:  i

D:  110



答案：B



###  题目4（加强训练）

阅读代码,控制台打印的结果为? （）

```java
public class IntegerDemo {
    public static void main(String[] args) {
        int i = 10;
        String str = i + "";
        System.out.println(str.equals("10"));
    }
}
```

A:  false

B:  true

C:  运行报错

D:  0



答案：B



### 题目5（综合练习）

下面说法错误的是：（）

A：System类提供了数组复制的方法；开发中如果遇到数组复制的需求，使用它更高效；

B：Math类主要提供各种常见的数学运算的方法，而且全部都是静态的方法；

C：自动装箱和自动拆箱是JDK5出现的新技术，主要用来简化包装类对象和基本类型数据之间的转换的；

D：正则表达式是Java中独有的用来匹配字符串的技术;



答案：D；

解析：正则表达式不是Java中独有的技术。

#  二、编程题

### 题目1（加强训练）

有一个String[]数组如下：

String[] nums = {“3.22”,”8.1”,”7”,”2.5”,”3.1”,”7.77”,”8.0”,”9.21”};

请编程计算它们的平均值，结果精确到小数点后两位。

#### 训练目标

BigDecimal的使用

#### 训练提示

1、BigDecimal.add方法实现BigDecimal的加法

2、BigDecimal.divide方法可以用来求平均值

#### 操作步骤

1、遍历nums数组，将所有值累加求和

2、用累加得到和除以数据个数，求平均值，结果四舍五入

#### 参考答案

```java
public class Test {
    public static void main(String[] args) {
        String[] nums = {"3.22","8.1","7","2.5","3.1","7.77","8.0","9.21"};
        BigDecimal result = new BigDecimal("0");//存储结果的BigDecimal
        for (String num : nums) {//遍历数组
            BigDecimal bd = new BigDecimal(num);//将数组的每个元素构造一个BigDecimal对象
            result = result.add(bd);//累加到result中
        }
        //result / 数组长度，结果取2位小数，并且四舍五入
        BigDecimal avg = result.divide(new BigDecimal(nums.length), 2, RoundingMode.HALF_UP);
        System.out.println("平均值：" + avg.doubleValue());//打印结果
    }
}
```

#### 视频讲解

另附avi文件提供。






