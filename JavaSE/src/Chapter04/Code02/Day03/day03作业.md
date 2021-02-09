# 知识点

接口、抽象类、继承、多态

## 题目1（加强训练）

按照以下说明，编写代码：

定义类描述手机和电脑，二者都具有开机、关机和玩游戏的功能，并提供测试类测试玩游戏的东西；

### 训练目标

1、掌握接口的使用

2、掌握抽象类的使用

3、理解接口和抽象类的使用场景

4、掌握多态的用法

### 训练提示

1、手机和电脑都是电子产品，需要将共性内容抽取到父类中

2、子类的开机和关机行为均与父类的不同，因此父类需要定义为抽象类

3、开机和关机是所有电子产品公有的功能，但是玩游戏不是，所以需要定义接口，在接口中定义玩有戏的功能。

4、测试某产品是否可以玩游戏，可以使用多态

### 思路分析

1、根据需求，我们需要先创建两个类，分别表示手机和电脑；

2、 接下来，在两个类中书写函数，表示手机和电脑应该具有的功能；

3、 然后观察代码发现，手机和电脑中存在相同的功能，所以需要向上抽取；

4、 因为手机和电脑都是电子产品，而开机和关机是所有电子产品都应该具有的功能，

5、 但是不同的电子产品开机关机的具体实现不同，所以应该创建一个抽象的电子产品类，作为手机和电脑的父类；

6、 在电子产品类中应该提供抽象的开机和关机的功能；

7、 而玩游戏不属于电子产品都应该具有的功能（如电磁炉也是电子产品，就没有玩游戏的功能）， 所以手机和电脑都具有的玩游戏的功能，就不能抽取到电子产品类中，而是应该使用一个接口表示

8、需求中要求提供功能，测试玩游戏的东西；这是一个独立的功能，所以应该定义为一个函数，因为要测试的是可以玩游戏的东西，具体是什么不知道，只知道肯定应该具有玩游戏的功能， 所以这个函数的参数类型应该是Playable类型，表示任何可玩游戏的东西；实际接受的参数，是这个接口的实现类对象。

### 操作步骤

1、定义抽象类电子产品

2、创建手机类和电脑类继承电子产品抽象类

3、创建玩游戏接口

4、手机类和电脑类实现玩游戏接口

5、测试某个产品的玩游戏功能

### 参考答案

~~~java
abstract class ElectronicProduct{//抽象的电子产品类
	public abstract void open();
	public abstract void close();
}
interface Playable{//可玩游戏的接口
	public void playGame();
}
class Computer extends ElectronicProduct implements Playable{// 表示电脑
	// 开机的功能
	public void open() {
		System.out.println("连接电源，打开电脑");
	}
	// 关机的功能
	public void close() {
		System.out.println("关闭电脑，断开电源");
	}
	// 玩游戏的功能
	public void playGame() {
		System.out.println("玩电脑游戏");
	}
}
class Phone extends ElectronicProduct implements Playable{// 表示手机
	// 开机的功能
	public void open() {
		System.out.println("打开手机，使用电池供电");
	}
	// 关机的功能
	public void close() {
		System.out.println("关闭手机，不需要取出电池");
	}
	// 玩游戏的功能
	public void playGame() {
		System.out.println("玩手机游戏");
	}
}
public class Test {
	public static void testPlayGame(Playable p){
		p.playGame();
	}
	public static void main(String[] args) {
		//调用函数测试可玩游戏的东西;使用Phone类型的匿名对象传参，传参中发生了多态
		testPlayGame(new Phone());
	}
}
~~~

### 视频讲解

另附avi格式视频。



## 题目2（综合案例）

模拟公司给员工发工资，代码实现，效果如图所示：

![img](day02.assets/wps786F.tmp.jpg) 

### 训练目标

1、理解继承的思想

2、掌握接口的使用

### 训练提示

1、程序员和经理都属于员工，使用继承

2、员工作为父类，为其提供带参的构造函数，子类的有参构造需调用父类的有参构造

3、公司类中定义总资金属性，通过总资金扣除员工的工资，得出发工资后工资剩余的总资金

![1568968329069](day02.assets/1568968329069.png)

### 参考方案

使用继承抽取程序员和经理的公有内容

在接口中定义支付工资的方法

### 操作步骤

1. 定义Employee类,包含属性：姓名，薪资

2. 定义经理Manager类继承Employee类 

3. 定义程序员Coder类继承Employee类 

4. 定义Money接口包含抽象的paySalary方法,参数为(Employee emp)

5. 定义Company类,实现Money接口,Company类包含公司总资金属性

6. 在Company类中重写paySalary方法.当给一个员工发工资的时候.公司总资金减去已发工资

7. 在main方法中创建Manager对象m 

8. 在main方法中创建Coder对象c 

9. 在main方法中创建Company对象

10. 在main方法中调用Company的paySalary方法,传入m和c对象

### 参考答案

```java
//1. 定义员工Employee类。包含属性：姓名，薪资
public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
//2. 定义经理Manager类继承Employee类
class  Manager extends  Employee{
    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }
}

//3. 定义程序员Coder类继承Employee类
class Coder extends  Employee{
    public Coder(String id, String name, double salary) {
        super(id, name, salary);
    }
}

//4. 定义Money接口包含抽象的paySalary方法,参数为(Employee emp)
interface Money{
    public abstract void paySalary(Employee emp);
}

//5. 定义Company类,实现Money接口,Company类包含公司总资金属性
class Company implements Money{

    private double totalMoney;

    //6. 在Company类中重写paySalary方法.当给一个员工发工资的时候.公司总资金减去已发工资
    @Override
    public void paySalary(Employee emp) {
    totalMoney -= emp.getSalary();
        System.out.println("给"+emp.getName()+"发工资"+emp.getSalary()+",公司还剩余:"+totalMoney+"元");
    }

    public Company() {
    }
    public Company(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}

public class Test {
    public static void main(String[] args) {
        //7. 在main方法中创建Manager对象m
        Manager m = new Manager("M001","张小强",9000);
        //8. 在main方法中创建Coder对象c
        Coder c = new Coder("C001","李晓亮",5000);
        //9. 在main方法中创建Company对象
        Company company = new Company(1000000);
        //10. 在main方法中调用Company的paySalary方法,传入m和c对象
        company.paySalary(m);
        company.paySalary(c);
    }
}
```

### 视频讲解

另附avi文件提供。

## 题目3（综合扩展）

模拟各种商品添加到购物车，电子商品打8.8折优惠，展示所有商品信息。

代码实现，效果如图所示：

![img](day02.assets/wpsEE23.tmp.jpg) 

### 训练目标

1、掌握继承的使用

2、了解ArrayList的使用

3、掌握集合的遍历

4、能从需求中分析出类的关系

### 训练提示

1.定义购物车类。

2.使用ArrayList作为成员变量，保存各种商品对象。

3.提供添加商品，移除商品，计算总价的方法。

4.定义商品类Goods，包含商品名称，id，价格等属性。

5.定义电子商品类EGoods继承Goods。

6.定义笔记本类Laptop继承电子商品EGoods类。

7.定义手机类继承继承电子商品EGoods类类。

8.定义水果类Fruit继承商品类。

### 操作步骤

![1568988734282](day02.assets/1568988734282.png)

1. 定义Goods商品类,包含商品编号id,商品名称name,商品价格price属性

2. 定义EGoods继承Goods类 

3. 定义Phone继承EGoods类 

4. 定义Laptop继承EGoods类 

5. 定义Fruit继承Goods类 

6. 定义购物车类GouWuChe

7. 在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品

8. 在购物车类GouWuChe中定义addGoods方法,参数为(Goods goods)。addGoods方法功能是将商品保存到ArrayList集合中

9. 在购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品信息并打印

10. 在购物车类GouWuChe中定义total方法.total方法功能是计算ArrayList集合中的所有商品的总价和折后价格,并输出

11. 在main方法中创建GouWuChe对象gouWuChe

12. 在main方法中创建商品Laptop,名称为:笔记本,id为:g10000,价格为:10000

13. 在main方法中创建商品Phone,名称为:手机,id为:g10001,价格为:5000

14. 在main方法中创建商品Fruit,名称为:苹果,id为:g20000,价格为:50

15. 调用购物车的addGoods方法将3个商品添加到购物车中

16. 调用购物车的showGoods方法,显示购物车中的商品信息

17. 调用购物车的total方法,显示购物车中所有商品的价格

### 参考答案

```java
//1. 定义Goods商品类,包含商品编号id,商品名称name,商品价格price属性
public class Goods {
    private String id;
    private String name;
    private double price;

    public Goods() { }
    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
//2. 定义EGoods继承Goods类
class EGoods extends Goods{
    public EGoods(String id, String name, double price) {
        super(id, name, price);
    }
}
//3. 定义Phone继承EGoods类
class Phone extends EGoods{
    public Phone(String id, String name, double price) {
        super(id, name, price);
    }
}
//4. 定义Laptop继承EGoods类
class Laptop extends EGoods{
    public Laptop(String id, String name, double price) {
        super(id, name, price);
    }
}
//5. 定义Fruit继承Goods类
class Fruit extends Goods{
    public Fruit(String id, String name, double price) {
        super(id, name, price);
    }
}

//6. 定义购物车类GouWuChe
class GouWuChe {
    public GouWuChe() {
    }
    //7. 在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品
    ArrayList<Goods> list = new ArrayList();
    //8. 在购物车类GouWuChe中定义addGoods方法,参数为(Goods goods).addGoods方法功能是将商品保存到ArrayList集合中
    public void addGoods(Goods goods) {
        System.out.println("加入 " + goods.getName() + " 成功");
        list.add(goods);
    }
    //9. 在购物车类GouWuChe中定义showGoods方法.showGoods方法功能是遍历ArrayList集合中的所有商品信息并打印
    public void showGoods() {
        System.out.println("您选购的商品为:");
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            System.out.println("\t" + goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }
    //10. 在购物车类GouWuChe中定义total方法.total方法功能是计算ArrayList集合中的所有商品的总价和折后价格,并输出
    public void total() {
        double off = 0; // 折扣价
        double sum = 0; // 原价
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            double price = goods.getPrice();
            sum += price;
            // 如果商品为电子产品,就打折计算
            if (goods instanceof EGoods) {
                price *= 0.88;
            }
            off += price;
        }
            System.out.println("------------------");
            System.out.println("原 价为:" + sum + " 元");
            System.out.println("折后价为:" + off + " 元");
    }
}

public class Test {
    public static void main(String[] args) {
        //11. 在main方法中创建GouWuChe对象gouWuChe
        GouWuChe gouWuChe = new GouWuChe();
        //12. 在main方法中创建商品Laptop,名称为:笔记本,id为:g10000,价格为:10000
        Goods g1 = new Laptop("笔记本", "g10000", 10000);
        //13. 在main方法中创建商品Phone,名称为:手机,id为:g10001,价格为:5000
        Goods g2 = new Phone("手机", "g10001", 5000);
        //14. 在main方法中创建商品Fruit,名称为:苹果,id为:g20000,价格为:50
        Goods g3 = new Fruit("苹果", "g20000", 50);

        System.out.println("============添加商品=================");
        //15. 调用购物车的addGoods方法将3个商品添加到购物车中
        gouWuChe.addGoods(g1);
        gouWuChe.addGoods(g2);
        gouWuChe.addGoods(g3);
        System.out.println("============打印商品=================");
        //16. 调用购物车的showGoods方法,显示购物车中的商品信息
        gouWuChe.showGoods();
        //17. 调用购物车的total方法,显示购物车中所有商品的价格
        gouWuChe.total();
    }
}
```

### 视频讲解

另附avi文件提供。

