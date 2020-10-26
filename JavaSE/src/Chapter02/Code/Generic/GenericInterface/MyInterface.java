package Chapter02.Code.Generic.GenericInterface;

/**
 * 泛型接口
 */
public interface MyInterface<MVP> {

  //在接口中就可以使用MVP
  public abstract void show(MVP mm);

  public abstract void eat(MVP mm);
}

//泛型接口的泛型,可以在以下两种情况中确定

//a.定义一个实现类 实现 该接口时,确定MVP的具体类型

class MyClass1 implements MyInterface<Integer> {

  //重写抽象方法
  @Override
  public void show(Integer mm) {

  }

  @Override
  public void eat(Integer mm) {

  }
}

//b.定义一个实现类 实现 该接口时,保留泛型
class MyClass2<MVP> implements MyInterface<MVP> {

  @Override
  public void show(MVP mm) {

  }

  @Override
  public void eat(MVP mm) {

  }
}
//此时实现类 其实就是一个泛型类,创建该类的对象时,可以确定泛型的具体类型
// MyClass2<String> mc = new MyClass2<String>();
// MyClass2<Integer> mc = new MyClass2<Integer>();

//c.也可以直接丢弃泛型,此时所有的泛型都会变成Object
class MyClass3 implements MyInterface {

  @Override
  public void show(Object mm) {

  }

  @Override
  public void eat(Object mm) {

  }
}
