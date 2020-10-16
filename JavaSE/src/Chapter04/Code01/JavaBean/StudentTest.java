package Chapter04.Code01.JavaBean;

/*
    需求：
        定义标准学生类
        属性: 姓名,年龄
        行为: 展示信息方法show

    要求:
        分别使用空参和有参构造方法创建对象，
        空参创建的对象通过setXxx赋值，
        有参创建的对象直接赋值，并通过show方法展示数据。

    注意:
        1.set方法主要的目的: 修改对象中成员变量的值
        2.有参构造主要目的: 创建完毕对象后,立刻马上给对象的成员变量赋值
 */
public class StudentTest {
    public static void main(String[] args) {
        //空参构造创建Student06类的对象
        //对象中成员变量采用默认值
        StudentBean stu = new StudentBean();

        //set方法给成员变量赋值
        stu.setName("张三");
        stu.setAge(18);

        //调用成员方法
        stu.show();
        System.out.println("------------");

        //满参构造创建Student06类的对象,并完成成员变量的初始化
        StudentBean stu2 = new StudentBean("李四", 28);

        //调用成员方法
        stu2.show();

        //过了一年又一年,李四的年龄+2岁
        //虽然数据没错,不符合逻辑,又创建了一个新的对象
        //stu2 = new Student06("李四",30);

        //应该调用set方法,修改age的属性值
        //先获取原有的值
        int age = stu2.getAge();

        //把原有值+2进行重新赋值
        stu2.setAge(age + 2);

        //调用成员方法
        stu2.show();
    }
}
