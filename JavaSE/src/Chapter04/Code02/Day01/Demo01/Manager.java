package Chapter04.Code02.Day01.Demo01;

public class Manager extends Employee {

  private String clerk;

  public Manager() {
    super.sendMsg();
    System.out.println("他的职员是：" + clerk);
  }

  public Manager(String name, String code, String dept, String clerk) {
    super(name, code, dept);
    this.clerk = clerk;
  }

  @Override
  public void sendMsg() {
    System.out.println(("销售部的：" + this.getName() + "，" + "员工编号：" + this.getCode()));
    System.out.println("他的职员是:" + clerk);
  }
}
