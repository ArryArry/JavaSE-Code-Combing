package Chapter04.Code01._03Extends;

import org.junit.Test;

public class TestDemo {

  /**
   * 通过子类获取父类的属性和方法
   */
  @Test
  public void test01() {
    Fu fu = new Fu();
    fu.breathing();
    fu.job();
    fu.setCompany("公司名称");
    fu.getCompany();
    Zi01 zi01 = new Zi01();
    zi01.eat();
    zi01.sleep();
    zi01.playGame();
    Zi02 zi02 = new Zi02();
    zi02.breathing();
    zi02.goSchool();
    zi02.setCompany("公司名称");
    zi02.getCompany();
  }

  /**
   * 构造方法无法继承 私有成员可以继承,但是无法直接访问 私有成员我们可以间接访问(通过 get和set方法)
   */
  @Test
  public void test02() {
    Zi01 zi01 = new Zi01();
    Fu fu = new Fu("公司名称");
    //Zi01 zi00 = new Zi01("公司名称");//(报错)构造方法无法继承
    //zi01.company;//错误,无法直接访问
    fu.getCompany();
    zi01.setCompany("公司名称：哈哈");
    String name = zi01.getCompany();
    System.out.println("找到公司名称：" + name);

  }

  /**
   * 子父类成员变量不同名 子父类成员变量同名 就近原则,优先访问子类自己的成员变量 使用super访问父类的num
   */
  @Test
  public void test03() {

  }

}
