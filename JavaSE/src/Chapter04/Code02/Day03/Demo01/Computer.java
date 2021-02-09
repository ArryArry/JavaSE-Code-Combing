package Chapter04.Code02.Day03.Demo01;

public class Computer extends EGoods implements Game {

  @Override
  public void begin() {
    System.out.println("电脑开机");
  }

  @Override
  public void close() {
    System.out.println("电脑关机");
  }

  @Override
  public void game() {
    System.out.println("电脑游戏");
  }
}
