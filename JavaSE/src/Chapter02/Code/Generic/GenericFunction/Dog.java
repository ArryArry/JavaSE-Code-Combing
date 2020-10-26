package Chapter02.Code.Generic.GenericFunction;

public class Dog {

  /**
   * 泛型方法
   */
  public <E> void show(E num) {
    System.out.println(num);
  }
}
