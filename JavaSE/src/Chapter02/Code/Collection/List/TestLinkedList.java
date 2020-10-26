package Chapter02.Code.Collection.List;

import java.util.LinkedList;

public class TestLinkedList {

  public static void main(String[] args) {
    //1.创建一个LinkedList
    LinkedList<String> list = new LinkedList<String>();
    //2.添加
    list.addLast("刘德华");
    list.addFirst("郭德纲");

    list.addLast("马蓉");
    list.addFirst("宋吉吉");

    list.addLast("王宝强");
    list.addFirst("刘若英");
    //["刘若英","宋吉吉","郭德纲","刘德华","马蓉","王宝强"]
    System.out.println(list);
    //3.删除
    String first = list.removeFirst();
    System.out.println(first + "被删除了");
    System.out.println(list);

    String last = list.removeLast();
    System.out.println(last + "被删除了");
    System.out.println(list);
    //[宋吉吉, 郭德纲, 刘德华, 马蓉]
    //4.获取
    String first1 = list.getFirst();
    System.out.println(first1);
    System.out.println(list);

    String last1 = list.getLast();
    System.out.println(last1);
    System.out.println(list);
    //5.pop删除 和 push添加
    //[宋吉吉, 郭德纲, 刘德华, 马蓉]
    System.out.println("=====");
    String pop = list.pop();
    System.out.println(pop);
    System.out.println(list);

    list.push("jack");
    System.out.println(list);
  }
}
