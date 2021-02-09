package Chapter04.Code02.Day01;

import Chapter04.Code02.Day01.Demo01.Clerk;
import Chapter04.Code02.Day01.Demo01.Employee;
import Chapter04.Code02.Day01.Demo01.Manager;
import Chapter04.Code02.Day01.Demo02.HouYi;
import Chapter04.Code02.Day01.Demo02.LuBan;
import org.junit.Test;

public class DemoTest {

  @Test
  public void test01() {
    Clerk clerk = new Clerk("张小亮", "M001", "销售部", "李小亮");
    clerk.sendMsg();
    Manager manager = new Manager("李小亮", "C001", "销售部", "张小亮");
    manager.sendMsg();
  }

  @Test
  public void test02() {
    HouYi houYi = new HouYi();
    houYi.track01();
    houYi.track02();
    houYi.track03();
    houYi.say();
    LuBan luBan = new LuBan();
    luBan.track01();
    luBan.track02();
    luBan.track03();
    luBan.say();
  }

  @Test
  public void test03() {

  }

}
