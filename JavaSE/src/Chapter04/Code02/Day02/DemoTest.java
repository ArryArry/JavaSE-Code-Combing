package Chapter04.Code02.Day02;

import Chapter04.Code02.Day02.Demo01.Company;
import Chapter04.Code02.Day02.Demo01.Manager;
import Chapter04.Code02.Day02.Demo01.Programmer;
import Chapter04.Code02.Day02.Demo02.Cart;
import Chapter04.Code02.Day02.Demo02.Commodity;
import Chapter04.Code02.Day02.Demo02.Fruit;
import Chapter04.Code02.Day02.Demo02.Laptop;
import Chapter04.Code02.Day02.Demo02.Phone;
import java.util.ArrayList;
import org.junit.Test;

public class DemoTest {

  @Test
  public void test01() {
    Company company = new Company(100000);
    Manager manager = new Manager("张小强", 9000);
    Programmer programmer = new Programmer("张小亮", 5000);
    company.pay(manager);
    company.pay(programmer);
  }

  @Test
  public void test02() {
    Laptop laptop = new Laptop("g10000", "笔记本", 10000.0);
    Phone phone = new Phone("g10001", "手机", 5000.0);
    Fruit fruit = new Fruit("g10002", "苹果", 50.0);
    Cart cart = new Cart();
    System.out.println("==========添加商品===========");
    cart.addGoods(laptop);
    cart.addGoods(phone);
    cart.addGoods(fruit);
    System.out.println("=========打印商品============");
    cart.printGoods();
    System.out.println("=============");
    cart.totalPrice();
  }

}
