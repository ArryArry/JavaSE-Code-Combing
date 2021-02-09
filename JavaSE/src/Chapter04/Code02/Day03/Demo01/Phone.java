package Chapter04.Code02.Day03.Demo01;

public class Phone extends EGoods implements Game {

  public Phone() {
  }

  @Override
  public void begin() {
    System.out.println("手机开机");
  }

  @Override
  public void close() {
    System.out.println("手机关机");
  }

  @Override
  public void game() {
    System.out.println("手机游戏");
  }
}
