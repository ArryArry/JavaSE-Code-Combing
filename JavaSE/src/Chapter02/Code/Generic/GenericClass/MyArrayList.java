package Chapter02.Code.Generic.GenericClass;

//泛型类的定义
public class MyArrayList<E> {

  //就是把E当做某种数据类型使用
  private E ee;

  public E getEe() {
    return ee;
  }

  public void setEe(E ee) {
    this.ee = ee;
  }

}
