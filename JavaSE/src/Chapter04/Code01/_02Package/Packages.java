package Chapter04.Code01._02Package;

/**
 * 发现问题:
 * 定义类时,规定了成员变量的含义,但是却无法保证成员变量的取值在一个合理有效的范围内;
 * 比如年龄age: 规定0到100之间
 * <p>
 * 如何解决呢?
 * 解决方案:
 * 使用private(私有)关键字,将需要保护的成员变量使用private修饰一把
 * <p>
 * private关键字的特点:
 * 1.被private修饰的成员(成员变量/方法),只能在所属的类中直接使用
 * 2.在其它类中无法直接使用(对象名.成员变量名)被private修饰的成员
 * <p>
 * 出现新的问题:
 * 其它类中不能直接访问被private修饰的成员,
 * 但是其它类中可以间接访问被private修饰的成员
 * <p>
 * 解决方案:
 * 需要为被private修饰的成员变量提供set和get方法
 * set方法: 给成员变量赋值
 * 三要素:
 * 1.方法名称: set + 成员变量名称(第一个字母大写)
 * 2.参数列表: 定义和成员变量相同类型的一个变量
 * 3.返回值类型: void
 * <p>
 * 注意:
 * 可以在set方法内部添加逻辑判断,控制成员变量的取值范围
 * <p>
 * get方法: 获取成员变量的值
 * 三要素:
 * 1.方法名称: get + 成员变量名称(第一个字母大写)
 * 2.参数列表: 没有参数
 * 3.返回值类型: 要获取值的成员变量的类型
 * <p>
 * 方法内部变量的访问规则
 * 就近原则,方法内部有直接使用方法内部自己的,方法内部没有,找成员问题
 * <p>
 * 局部变量和成员变量名称相同?
 * 1.直接写变量名: 代表的是方法内部的局部变量
 * 2.this.变量名:
 * 代表的是成员变量
 * <p>
 * this代表谁?
 * 哪个对象调用方法,该方法内部的this就代表那个调用方法的对象
 * 谁调用我,我就代表谁
 * <p>
 * 注意:
 * 使用对象调用方法时,每个方法内部隐藏一个this关键字,用来接收调用该方法的对象的地址值,
 * 如果需要使用this,你就直接用,不用就算了
 */
public class Packages {
    public static void main(String[] args) {
        //创建Person01类的对象
        Person p = new Person();
        System.out.println(p);//地址值
        //调用成员方法
        p.show();

        //给成员变量赋值
        p.name = "灭绝师太";
        //p.age = 18;//错误,age用private修饰,外部不能直接访问
        //调用setAge方法,给成员变量age赋值
        p.setAge(18);

        //调用成员方法
        p.show();

        //从新给age赋值
        //p.age = 8848;//错误,age用private修饰,外部不能直接访问
        //调用setAge方法,给成员变量age赋值
        p.setAge(8848);

        //调用成员方法
        p.show();

        //从新给age赋值
        //p.age = -99999;//错误,age用private修饰,外部不能直接访问
        //调用setAge方法,给成员变量age赋值
        p.setAge(-99999);

        //调用成员方法
        p.show();

        //调用成员方法getAge,获取age属性值
        int age = p.getAge();

        System.out.println("我的姓名: " + p.name + ", 年龄: " + age);
    }

    /**
     * 方法内部变量的访问规则
     */
    String name;//姓名

    //打招呼
    public void sayHello(String who) {
        System.out.println("你好: " + who + ", 我是 " + name);
    }

    //以上方法参数String who 不能做到见名知意
    //把String who改成String name
    //发现: 方法()中定义的局部变量和成员变量同名
    //问题: 不能直接访问到成员变量的
    public void sayHello2(String name) {
        System.out.println("你好: " + name + ", 我是 " + name);
    }

    //要在方法内部使用和局部变量同名的成员变量
    //this.name: 成员变量name
    public void sayHello3(String name) {
        System.out.println("sayHello3....this..." + this);
        System.out.println("你好: " + name + ", 我是 " + this.name);
    }
}
