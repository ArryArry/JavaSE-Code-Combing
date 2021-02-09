package Chapter04.Code01._03Extends;

public class Zi01 extends Fu {

  private String game;

  public void playGame() {
    super.sleep();
    System.out.println("玩游戏");
  }

  //重写父类的方法（必须要保证子类权限大于父类的权限）
  @Override
  public String getCompany() {
    return super.getCompany();
  }
}
