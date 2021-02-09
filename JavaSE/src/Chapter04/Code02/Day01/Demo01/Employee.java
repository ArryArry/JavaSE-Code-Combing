package Chapter04.Code02.Day01.Demo01;

public class Employee {

  private String name;
  private String code;
  private String dept;

  public void sendMsg() {
    System.out.println(("销售部的：" + this.getName() + "，" + "员工编号：" + this.getCode()));
  }

  public Employee() {
  }

  public Employee(String name, String code, String dept) {
    this.name = name;
    this.code = code;
    this.dept = dept;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }
}
