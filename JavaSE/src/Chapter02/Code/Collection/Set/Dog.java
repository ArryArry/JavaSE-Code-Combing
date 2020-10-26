package Chapter02.Code.Collection.Set;

import java.util.Objects;

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

  //为了保证哈希表中元素的唯一性,我们需要重写hashCode和equals方法

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dog dog = (Dog) o;
    return age == dog.age &&
        legs == dog.legs &&
        Objects.equals(name, dog.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(age, name, legs);
  }
}
