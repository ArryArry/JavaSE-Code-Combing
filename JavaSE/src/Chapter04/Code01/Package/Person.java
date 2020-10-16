package Chapter04.Code01.Package;

public class Person {
    //成员变量
    String name;//姓名
    private int age;//年龄

    //成员方法
    public void show() {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }

    //set成员方法,给成员变量赋值
    public void setAge(int a) {
        if (a > 0 && a <= 100) {
            age = a;
        }
    }

    //get成员方法,获取age的值
    public int getAge() {
        return age;
    }
}
