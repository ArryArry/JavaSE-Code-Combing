package Chapter02.Code02.Collection.Exercise01.Demo01;

import java.util.LinkedList;

/**
 * 需求：创建一个类，提供一个功能，向LinkedList集合中添加自定义的Person类对象； 要求： Person应该具有姓名、性别和年龄三个属性；
 * 添加对象时，如果容器中已存在该对象，就不添加；（要求：不能使用集合提供的contains方法） 如果Person对象的姓名和性别相同，就认为是同一个人； 需求分析：
 * LinkedList集合要存储自定义类型的数据，重写hashCode()方法、equals()方法。 因为要求只要姓名和性别相同，就认为是同一个人，所以重写方法时只需要考虑姓名和性别两个属性
 */
public class Demo01 {

  public static void main(String[] args) {

  }

  public void add(Person person) {
    LinkedList<Person> linkedList = new LinkedList<>();
    linkedList.push(person);

  }
}
