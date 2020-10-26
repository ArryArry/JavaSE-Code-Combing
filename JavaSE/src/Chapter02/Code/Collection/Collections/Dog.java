package Chapter02.Code.Collection.Collections;

public class Dog {

  int age;
  String name;
  int legs;

  public Dog() {
  }

  public Dog(int age, String name, int legs) {
    this.age = age;
    this.name = name;
    this.legs = legs;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "age=" + age +
        ", name='" + name + '\'' +
        ", legs=" + legs +
        '}';
  }
}
