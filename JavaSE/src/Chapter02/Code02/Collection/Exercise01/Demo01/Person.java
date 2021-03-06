package Chapter02.Code02.Collection.Exercise01.Demo01;

public class Person {

  private String name;
  private String sex;
  private Integer age;

  public Person() {
  }

  public Person(String name, String sex, Integer age) {
    this.name = name;
    this.sex = sex;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
