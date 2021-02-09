package Chapter04.Code01._03Extends;

//抽象类
public abstract class Human {

  private String name;
  private int age;

  //抽象方法
  public abstract void breathing();

  //普通方法
  public void eat() {
    System.out.println("吃饭");
  }

  //普通方法
  public void sleep() {
    System.out.println("睡觉");
  }
}
