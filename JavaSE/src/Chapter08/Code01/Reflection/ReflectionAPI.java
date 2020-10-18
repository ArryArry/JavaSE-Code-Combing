package Chapter08.Code01.Reflection;

import java.lang.reflect.Method;
import org.junit.Test;

/**
 * 反射机制是什么
 *      反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
 *      对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
 *
 * 反射机制能做什么
 * 反射机制主要提供了以下功能：
 * 在运行时判断任意一个对象所属的类；
 * 在运行时构造任意一个类的对象；
 * 在运行时判断任意一个类所具有的成员变量和方法；
 * 在运行时调用任意一个对象的方法；
 * 生成动态代理。
 *
 * Class类提供了四个public方法，用于获取某个类的构造方法。
 *      Constructor getConstructor(Class[] params)     根据构造函数的参数，返回一个具体的具有public属性的构造函数
 *      Constructor getConstructors()     返回所有具有public属性的构造函数数组
 *      Constructor getDeclaredConstructor(Class[] params)     根据构造函数的参数，返回一个具体的构造函数（不分public和非public属性）
 *      Constructor getDeclaredConstructors()    返回该类中所有的构造函数数组（不分public和非public属性）
 * 四种获取成员方法的方法
 *      Method getMethod(String name, Class[] params)    根据方法名和参数，返回一个具体的具有public属性的方法
 *      Method[] getMethods()    返回所有具有public属性的方法数组
 *      Method getDeclaredMethod(String name, Class[] params)    根据方法名和参数，返回一个具体的方法（不分public和非public属性）
 *      Method[] getDeclaredMethods()    返回该类中的所有的方法数组（不分public和非public属性）
 * 四种获取成员属性的方法
 *      Field getField(String name)    根据变量名，返回一个具体的具有public属性的成员变量
 *      Field[] getFields()    返回具有public属性的成员变量的数组
 *      Field getDeclaredField(String name)    根据变量名，返回一个成员变量（不分public和非public属性）
 *      Field[] getDelcaredField()    返回所有成员变量组成的数组（不分public和非public属性）
 */
public class ReflectionAPI {

    /**
     * 获取类：3种方法
     * 第一种方法：forName
     * 第二张方法：class
     * 第三种方法：getClass
     */
    @Test
    public void test01() {
        //第一种方法：forName
        try {
            Class<?> class1 = Class.forName("Chapter08.Code01.Reflection.Person");
            System.out.println(class1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第二张方法：class
        Class<Person> class2 = Person.class;
        //第三种方法：getClass
        Person person = new Person();
        Class<? extends Person> class3 = person.getClass();
        System.out.println(class2);
        System.out.println(class3);
        //class Chapter08.Code01.Reflection.Person
        //class Chapter08.Code01.Reflection.Person
        //class Chapter08.Code01.Reflection.Person
    }

    /**
     * 获取所有的方法：getMethods( )
     * 包含：自定义方法 和 父类Object类方法
     */
    @Test
    public void test02() {
        try {
            //创建类
            Class<?> class1 = Class.forName("Chapter08.Code01.Reflection.Person");
            //获取所有的公共方法
            Method[] methods = class1.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取所有实现的接口：getInterfaces()
     * 获取父类：getSuperclass()
     * 获取所有的构造函数：getConstructors()
     * 获取所有的属性：getDeclaredFields()
     *
     * 注意：
     * getDeclaredFields()获得某个类的所有申明的字段，即包括public、private和proteced，但是不包括父类的申明字段。
     * getFields()获得某个类的所有的公共（public）的字段，包括父类。
     *
     * 当参数是 int 类型 和 Integer 类型，反射获取方法不一样
     * 当参数是 int 类型时，获取方法的时候需要用：int.class。不能使用 Integer.class. 会报错。
     * Method getTipMethod4 = class.getDeclaredMethod( "getTip" , int.class ) ;
     * 当参数是 Integer类型时，获取方法的时候需要用：Integer .class。不能使用 int.class. 会报错。
     * Method getTipMethod4 = class.getDeclaredMethod( "getTip" , Integer .class ) ;
     */
    @Test
    public void test03() {
        try {
            //创建类
            Class<?> class1 = Class.forName("Chapter08.Code01.Reflection.Person");
            //获取所有的公共方法
            Class<?>[] interfaces = class1.getInterfaces();
            for (Class<?> anInterface : interfaces) {
                System.out.println(anInterface);
                //interface Chapter08.Code01.Reflection.InterFace
            }

            Class<?> superclass = class1.getSuperclass();
            System.out.println(superclass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     *创建实例：newInstance()
     */
    @Test
    public void test04() {
        try {
            Class<?> class1 = Class.forName("Chapter08.Code01.Reflection.Person");
            //创建实例化：相当于 new 了一个对象
            Object object = class1.newInstance() ;
            //向下转型
            Person person = (Person) object ;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test05() {

    }
    @Test
    public void test06() {

    }

}
