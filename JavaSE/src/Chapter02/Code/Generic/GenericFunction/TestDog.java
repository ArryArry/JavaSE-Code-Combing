package Chapter02.Code.Generic.GenericFunction;

import org.junit.Test;

public class TestDog {

  /**
   *
   */
  @Test
  public void test() {
    //1.创建Dog对象
    Dog dd = new Dog();
    //2.调用方法
    dd.show("java");
    dd.show(10);
    //严格的方式
    dd.<String>show("java");
    dd.<Integer>show(10);
  }
}
