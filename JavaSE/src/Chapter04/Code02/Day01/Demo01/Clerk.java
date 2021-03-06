package Chapter04.Code02.Day01.Demo01;

public class Clerk extends Employee {

  private String manager;

  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public Clerk(String manager) {
    this.manager = manager;
  }

  public Clerk(String name, String code, String dept, String manager) {
    super(name, code, dept);
    this.manager = manager;
  }

  @Override
  public void sendMsg() {
    System.out.println(("销售部的：" + this.getName() + "，" + "员工编号：" + this.getCode()));
    System.out.println("他的经理是：" + manager);
  }
}
