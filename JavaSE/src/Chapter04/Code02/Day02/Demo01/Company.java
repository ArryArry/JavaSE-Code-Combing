package Chapter04.Code02.Day02.Demo01;

public class Company implements Money {

  private double funds;

  @Override
  public void pay(Employee employee) {
    funds -= employee.getSalary();
    System.out
        .println("给" + employee.getName() + "发工资" + employee.getSalary() + "," + "公司还剩：" + funds);
  }

  public Company() {
  }

  public Company(double funds) {
    this.funds = funds;
  }

  public double getFunds() {
    return funds;
  }

  public void setFunds(double funds) {
    this.funds = funds;
  }
}
