package Chapter08.Code02.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;

/**
 * 实战1：通过反射，获取对象实例，并且操作对象的方法
 * 实战2：通过反射获取对象字段属性，并且赋值
 * 实战3：综合训练，反射操作属性和方法
 * 实战4：静态属性、静态方法调用
 */
public class Demo {
  /**
   * 实战1：通过反射，获取对象实例，并且操作对象的方法
   */
  @Test
  public void test01(){
    try {
      //创建类
      Class<?> aClass = Class.forName("Chapter08.Code02.Reflection.Person");
      //实例化一个对象
      Object instance = aClass.newInstance();
      //向下转型
      Person person = (Person) instance;
      person.setId("10");
      person.setName("jack");
      person.setAge("18");
      System.out.println( "id: " + person.getId() + " name: " + person.getName()  );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 实战2：通过反射获取对象字段属性，并且赋值
   */
  @Test
  public void test02(){
    try {
      //创建类
      Class<?> aClass = Class.forName("Chapter08.Code02.Reflection.Person");
      //实例化一个对象
      Object person = aClass.newInstance();
      //获得id 属性
      Field id = aClass.getDeclaredField("id");
      //给id 属性赋值
      //打破封装  实际上setAccessible是启用和禁用访问安全检查的开关,并不是为true就能访问为false就不能访问
      //由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
      id.setAccessible(true);
      id.set(person,"100");
      //打印 person 的属性值
      System.out.println(id.get(person));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 战3：综合训练，反射操作属性和方法
   */
  @Test
  public void test03(){
    try {
      //创建类
      Class<?> class1 = Class.forName("Chapter08.Code02.Reflection.Person");

      //创建实例
      Object person = class1.newInstance();

      //获得id 属性
      Field idField = class1.getDeclaredField( "id" ) ;

      //打破封装  实际上setAccessible是启用和禁用访问安全检查的开关,并不是为true就能访问为false就不能访问
      //由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
      idField.setAccessible( true );

      //给id 属性赋值
      idField.set(  person , "100") ;

      //获取 setName() 方法
      Method setName = class1.getDeclaredMethod( "setName", String.class ) ;
      //打破封装
      setName.setAccessible( true );

      //调用setName 方法。
      setName.invoke( person , "jack" ) ;

      //获取name 字段
      Field nameField = class1.getDeclaredField( "name" ) ;
      //打破封装
      nameField.setAccessible( true );

      //打印 person 的 id 属性值
      String id_ = (String) idField.get( person ) ;
      System.out.println( "id: " + id_ );

      //打印 person 的 name 属性值
      String name_ = ( String)nameField.get( person ) ;
      System.out.println( "name: " + name_ );

      //获取 getName 方法
      Method getName = class1.getDeclaredMethod( "getName" ) ;
      //打破封装
      getName.setAccessible( true );

      //执行getName方法，并且接收返回值
      String name_2 = (String) getName.invoke( person  ) ;
      System.out.println( "name2: " + name_2 );

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 实战4：静态属性、静态方法调用
   */
  @Test
  public void test04(){
    try {
      //创建类
      Class<?> class1 = Class.forName("Chapter08.Code02.Reflection.Util");

      //获取 nameField 属性
      Field nameField = class1.getDeclaredField( "name" ) ;
      //获取 nameField 的值
      String name_ = (String) nameField.get( nameField ) ;
      //输出值
      System.out.println( name_ );


      //没有返回值，没有参数
      Method getTipMethod1 = class1.getDeclaredMethod( "getTips"  ) ;
      getTipMethod1.invoke( null  ) ;

      //有返回值，没有参数
      Method getTipMethod2 = class1.getDeclaredMethod( "getTip"  ) ;
      String result_2 = (String) getTipMethod2.invoke( null  ) ;
      System.out.println( "返回值： "+ result_2 );

      //没有返回值，有参数
      Method getTipMethod3 = class1.getDeclaredMethod( "getTip" , String.class  ) ;
      String result_3 = (String) getTipMethod3.invoke( null , "第三个方法"  ) ;
      System.out.println( "返回值： "+ result_3 );

      //有返回值，有参数
      Method getTipMethod4 = class1.getDeclaredMethod( "getTip" , int.class ) ;
      String result_4 = (String) getTipMethod4.invoke( null  , 1 ) ;
      System.out.println( "返回值： "+ result_4 );

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
