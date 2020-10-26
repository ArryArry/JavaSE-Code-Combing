package Chapter02.Code.Collection.hash;

public class TestHashDemo01 {

  public static void main(String[] args) {
    //1.获取一个对象的哈希码值
    Student s1 = new Student(10, "前妻");
    int hashCode = s1.hashCode();
    System.out.println(hashCode);//哈希值:1163157884

    System.out.println(s1.toString()); //地址值:4554617c

    //2.String对象的哈希值
    String s2 = "abc";
    String s3 = "acD";
    System.out.println(s2 == s3);
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());

  }
}
