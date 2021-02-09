package Chapter04.Code02.Day03;

import Chapter04.Code02.Day03.Demo01.Game;
import Chapter04.Code02.Day03.Demo01.Phone;
import org.junit.Test;

public class DemoTest {

  public static void testPlayGame(Game g) {
    g.game();
  }

  @Test
  public void test01() {
    testPlayGame(new Phone());
  }
}
