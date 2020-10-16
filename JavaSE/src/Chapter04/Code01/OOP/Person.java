package Chapter04.Code01.OOP;

/*
    类: 用来描述现实生活中的事物的
        成员变量: 和以前定义变量相同,只是位置发生改变,在类中方法外
        成员方法: 和以前定义方法一样,但是要去掉static关键字

    对象: 类的具体体现,相当于根据模板生产的具体事物
        类名 对象名 = new 类名(...);

    使用(非private修饰):
        1.成员变量: 对象名.成员变量名
        2.成员方法: 对象名.成员方法名(...)

    私有: 保护类的成员
        private: 修饰成员变量,成员方法,构造方法
        特点: 只能在本类中直接使用
        为了让其他类可以使用本类的私有成员变量
        需要提供get和set方法

    this: 用来区分局部变量和成员变量同名的情况
        1.直接写变量名: 代表局部变量
        2.this.变量名: 代表成员变量
        this代表的是调用方法的具体的对象

    构造方法:
        1.作用: 使用new创建对象后,调用构造方法完成对象成员的初始化的
        2.格式:
            修饰符 类名(参数列表...) {
                方法体;
                return ;
            }
        3.特点:
            (1)没有static
            (2)没有返回值类型,连void都没有
            (3)方法名和类名必须一模一样
            (4)return ;可以省略

        4.注意:
            (1)自定义类时,一个构造方法都不写,编译器默认隐藏提供空参构造
            (2)构造方法也是方法,可以重载
            (3)自定义类时,只要自己定义一个构造方法,编译器不再提供空参构造

    构造方法和set方法的区别?
        1.set方法: 主要是对象创建完毕后,通过对象调用set方法,修改成员变量的值
        2.构造方法: 必须在创建对象的时候调用,
            所以只要调用构造,相当于创建了一个新的对象
 */
public class Person {
    //成员变量
    private String name;
    private int age;

    //空参构造
    public Person() {
        System.out.println("空参构造被调用了....");
    }
    //满参构造


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //只给name属性赋值
    public Person(String name) {
        this.name = name;
    }

    //成员方法
    public void show() {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }

    //get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

