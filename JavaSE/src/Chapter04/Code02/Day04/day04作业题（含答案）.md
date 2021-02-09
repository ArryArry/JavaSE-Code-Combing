# 一、选择题

## 知识点

Object类

### 题目1（加强训练）

以下关于Object类,说法错误的是? （）

A:  任何类都间接或者直接继承Object类

B:  Object是所有类的根类(父类)

C:  任何一个类都可以使用Object类中的方法

D:  Object类中的方法不能被重写



答案：D

 

### 题目2（加强训练）

 下面说法错误的是：

A：Object类是Java中最高父类，其它所有类都直接或者间接的继承Object类；

B：Java中，如果一个类没有明确书写继承的类，则默认都继承Object类；

C：Object类型的变量，可以指向Java中任意一个对象；

D：Object类是一个抽象类，所有Java类都具有Object类中定义的方法；



答案：D

解析：Object类不是抽象类。



###  题目3（加强训练）

下面对于toString()方法和equals()方法描述正确的是? （）

A:  类重写toString()方法是为了打印对象的地址

B:  类重写equals()方法是为了比较对象的地址

C:  类重写toString()方法是打印对象中的属性,重写equals()是比较对象中的属性

D:  类只能重写Object中的toString()方法和equals()方法



答案：C



### 题目4（加强训练）

下面说法错误的是：（）

A：toString方法会返回一个字符串，在使用System.out.println()语句输出对象时就是输出的这个方法返回的数据；

B：String类已经重写了toString和equals方法；

C：一般开发中都需要重写toString方法和equals方法

D：equals方法底层使用的是 == 比较的，所以是用来比较两个对象是否是同一个对象的；



答案：D；

解析：equals方法的作用，是用来比较两个对象的各个属性值是否相等，而不是两个对象是否是同一个对象的；Object类中的equals方法默认是使用 == 比较的，但一般开发中都需要重写这个方法，比较两个对象的各个属性值。



## 知识点

日期类

###  题目1（加强训练）

观察下列代码.日期格式化为字符串是(时间忽略)?  （）

```java
public class SimpleDateFormatDemo {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
    }
}
```

A:  2018/04/11 22:01:30

B:  2018年04月11日 22:01:30

C:  2018.04.11 22:01:30

D:  2018-04-11 22时01分30秒



答案：B



###  题目2（加强训练）

 想得到"2018-04-11 22时12分10秒"(时间忽略),模式正确的是?：

```java
public class SimpleDateFormatDemo {

    public static void main(String[] args) throws ParseException {
        //此处代码应填写
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
    }
}
```

```java
A:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

B:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒");

C:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH时mm分ss秒");

D:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
```



答案:B



###  题目3（加强训练）

 阅读代码,横线位置应填写的内容是? （）

```java
public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {
        String str = "1998-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat(_____);
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
```

A:  "yyyy-MM-dd"

B:  "yyyy年MM月dd"

C:  "yyyy/MM/dd"

D:  "yyyy.MM.dd"



答案：A



### 题目4（加强训练）

下面说法错误的是：（）

A：Java中表示时间的类是util包中的Date类；

B：Date类的对象表示一个时间段；

C：Date类中从时间中获取年月日的方法过时了，开发中应该使用Calendar类的方法实现；

D：Date类中将时间格式化为字符串的方法过时了，开发中应该使用DateFormat或者SimpleDateFormat类；



答案：B；

解析：Date对象表示的是一个时间点，精确到毫秒。



### 题目5（加强训练）

下面说法错误的是：（）

A：Calendar类是日历类，通过getInstance方法获取的对象表示的是当前时间点的日历信息；

B：因为可以方便的自定义格式，所以开发中处理时间和字符串的转换时，一般使用SimpleDateFormat类，而非DateFormat类；

C：基本类型包装类在开发中一般用来将字符串转换为对应的基本类型数据；

D：要将字符串转换为基本类型数据，字符串的字面值必须表示的是这个基本类型数据的一个值，否则运行时就会出现异常；

答案：D；

如果要将字符串转换为int型数据，说法没错；

如果将字符串转为布尔型数据，就对字符串的字面值没有特殊要求，运行时也不会出现异常。



## 二、编程题

## 知识点

日期格式化

### 题目1（加强训练）

请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。

#### 训练目标

会使用SimpleDateFormat转换日期格式。

#### 训练提示

使用SimpleDateFormat进行日期格式转换

#### 操作步骤

1、获取当前日期

2、实例化SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

3、使用SimpleDateFormat的format方法转化日期为满足格式的字符串

#### 参考答案

```java
public class DateTest {
    public static void main(String[] args) {
        //获取当前日期对象 now;
        Date now = new Date();
        //创建SimpleDateFormat对象 df,并制定日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用df的format(Date  date) 方法,传入now; 接收返回的字符串
        String datestr = df.format(now);
        //打印这个字符串
        System.out.println(datestr);
    }
}
```

#### 视频讲解

另附avi文件提供。

### 题目2（加强训练）

需求：使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。 

#### 训练目标

会使用SimpleDateFormat转换日期格式

#### 训练提示

1、使用SimpleDateFormat的parse方法将字符串转化成Date类型

2、使用SimpleDateFormat的format将date转化成格式化后的日期

#### 参考方案

灵活运用SimpleDateFormat的parse和format方法完成本题

#### 操作步骤

1、实例化SimpleDateFormat，指定日期格式为“yyyy-MM-dd”

2、调用parse方法，将字符创“2018-03-04”转化成日期格式

3、实例化SimpleDateFormat，指定日期格式为“yyyy年MM月dd日”

4、调用format方法，将第二步生成的日期，转化成满足条件的字符串数据

#### 参考答案

```java
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        //创建SimpleDateFormat对象df1,指定日期模式为yyyy-MM-dd
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        //调用df1的parse(String str)方法传入2018-03-04,得到对应日期类型
        Date date = df1.parse("2018-03-04");
        //创建日期格式化对象df2,在获取格式化对象时可以指定风格
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
        //调用df2的format(Date date) 传入刚才转换的日期
        String str = df2.format(date);
        System.out.println(str);
    }
}
```

#### 视频讲解

另附avi文件提供。

### 题目3（加强训练）

需求：用程序判断2018年2月14日是星期几。

#### 训练目标

掌握Calendar类的常用属性和方法

#### 训练提示

1、创建Calendar的实例

2、设置Calendar的年月日为2018年2月14日

3、调用Calendar的get(Calendar.DAY_OF_WEEK)方法获取当前是星期几

4、每周的第一天在国外是星期日，不是星期一

#### 参考方案

使用Calendar类的相关属性和方法

#### 操作步骤

1、创建Calendar的实例

2、设置Calendar的年月日为2018年2月14日

3、调用Calendar的c.get(Calendar.DAY_OF_WEEK)方法获取当前是星期几

4、将一周的七天存入数组中，根据第三步获取的结果，从数组中对应拿到具体是星期几

#### 参考答案

```java
public class CalendarTest01 {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar c = Calendar.getInstance();
        //将给定的日历字段设置到Calendar对象中
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, 1);
        c.set(Calendar.DATE, 14);
        //设置年
        int year = c.get(Calendar.YEAR);
        //设置月
        int month = c.get(Calendar.MONTH)+1;
        //设置日
        int date = c.get(Calendar.DATE);
        //设置星期
        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        //输出结果
        System.out.println(year+"年"+month+"月"+date+"日是星期"+week);
    }
    //定义方法，获取星期汉字
    public static char getWeek(int a){
        char[] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}
```

#### 视频讲解

另附avi文件提供。

### 题目4（加强训练）

需求：有2个字符串形式的日期数据，计算它们相距多少天？

 		"2014年09/28 23时13分01秒"

 		"2009-02月12日 12时02分01秒"

#### 训练目标

掌握SimpleDateFormat的使用

掌握Date的使用

#### 训练提示

1、通过Date的getTime方法可以得到一个日期的毫秒值

2、可以将需求中的两个字符串先转化成Date类型

3、计算两个Date类型数据之间相差多少毫秒

4、用相差的毫秒数除以每天的毫秒数，即可得到两个日期相差多少天

#### 参考方案

SimpleDateFormate相关方法：

```java
Date parse(String source) 从给定字符串的开始解析文本以生成日期。
String format(Date date) 将日期格式化成日期/时间字符串。 
```

#### 操作步骤

1、使用SimpleDateFormat将两个字符串转化成Date类型的数据

2、通过Date的getTime方法，获取两个Date数据的毫秒数

3、计算两个Date之间相差多少毫秒

4、用第三步得到的差值除以每天的毫秒数，得到的就是两个日期相差多少天

#### 参考答案

```java
public class Test01 {
    public static void main(String[] args) throws Exception {
        //解析字符串
        String s1 = "2014年09/28 23时13分01秒";
        DateFormat df = new SimpleDateFormat("yyyy年MM/dd HH时mm分ss秒");
        Date d1 = df.parse(s1);

        //解析字符串，获取一个时间对象
        String s2 = "2009-02月12日 12时02分01秒";
        df = new SimpleDateFormat("yyyy-MM月dd日 HH时mm分ss秒");
        Date d2 = df.parse(s2);

        //获取两个神机箭对象之间的毫秒值的差
        long time = Math.abs(d1.getTime() - d2.getTime());
        //除以每天的毫秒值，及计算一共相差多少天
        int dayTime =(int)  time / (60*60*24*1000);
        System.out.println(dayTime);
    }
}
```

#### 视频讲解

另附avi文件提供。

### 题目5（加强训练）

需求：代码计算500天后是几几年几月几日。

#### 训练目标

#### 训练提示

#### 参考方案

#### 操作步骤

#### 参考答案

```java
public class Test05 {
    public static void main(String[] args) {
        // a)获取当前日历对象
        Calendar c = Calendar.getInstance();
        // b)调用日期对象的add()方法,让当前日历向后移动500天
        c.add(Calendar.DATE, 500);
        // c)获取日历中的年,月,日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        // d)输出几几年几月几日.
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
```

#### 视频讲解

另附avi文件提供。




