package Chapter04.Code02.Day01.Demo02;

public class LuBan extends Hero {//表示鲁班七号

  public LuBan() {
    super("鲁班七号", 3000, 2000, 150, 200);
  }

  public void say() {
    System.out.println(this.getName() + "说：借你们肉体实验新发明的威力！");
  }

  //表示鲁班发动一技能
  public void track01() {
    startAnility(new Track("河豚手雷", 1.5, 10));
  }

  //表示鲁班发动二技能
  public void track02() {
    startAnility(new Track("无敌鲨鱼炮", 2.5, 25));
  }

  //表示鲁班发动三技能
  public void track03() {
    startAnility(new Track("空中支援", 3, 40));
  }
}