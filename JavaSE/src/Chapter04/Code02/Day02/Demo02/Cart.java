package Chapter04.Code02.Day02.Demo02;

import java.util.ArrayList;

public class Cart {

  ArrayList<Commodity> goodsList = new ArrayList<>();


  /**
   * 添加商品
   */
  public void addGoods(Commodity commodity) {
    System.out.println("加入" + commodity.getName() + "成功");
    goodsList.add(commodity);
  }


  /**
   * 打印商品信息
   */
  public void printGoods() {
    System.out.println("您选购的商品为：");
    for (Commodity commodity : goodsList) {
      System.out.println(commodity.getId() + commodity.getName() + commodity.getPrice());
    }
  }

  /**
   * 计算商品总价
   */
  public void totalPrice() {
    double sum = 0.0;//原价
    double off = 0.0;//折后价
    for (int i = 0; i < goodsList.size(); i++) {
      Commodity commodity = goodsList.get(i);
      double price = commodity.getPrice();
      sum += price;
      if (commodity instanceof EGoods) {
        price *= 0.88;
      }
      off += price;
    }
    System.out.println("原价为：" + sum + "元");
    System.out.println("折扣价为：" + off + "元");

  }

}
