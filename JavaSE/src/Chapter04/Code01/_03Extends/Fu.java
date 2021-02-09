package Chapter04.Code01._03Extends;

public class Fu extends Human {

  private String company;
  private String game;

  //无参构造
  public Fu() {
  }

  //有参构造
  public Fu(String company) {
    this.company = company;
  }

  @Override
  public void breathing() {
    System.out.println("要呼吸");
  }

  public void job() {
    System.out.println("去上班");
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}
