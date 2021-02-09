package Chapter04.Code01._02Package.JavaBean;

/*
    定义java类,描述现实中的事物
    要求:
        1.所有成员变量用private修饰
        2.提供对应的get和set方法

    快捷键:
        alt + insert --> getter and setter -->
            选定需要生成get和set方法的成员变量 --> ok
 */
public class StudentBean {
    //成员变量
    private String name;
    private int age;

    //展示信息方法
    public void show() {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }

    //提供成员方法getName: 获取name的值
    public String getName() {
        return name;
    }

    //提供成员方法setName: 设置name的值
    public void setName(String name) {
        this.name = name;
    }

    //提供成员方法getAge: 获取age的值
    public int getAge() {
        return age;
    }

    //提供成员方法setAge: 设置age的值
    public void setAge(int age) {
        this.age = age;
    }

    public StudentBean() {
    }

    public StudentBean(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
