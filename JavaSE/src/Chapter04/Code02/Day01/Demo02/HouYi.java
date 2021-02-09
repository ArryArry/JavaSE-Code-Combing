package Chapter04.Code02.Day01.Demo02;

public class HouYi extends Hero {

  public HouYi() {
    super("后羿", 3500, 2600, 160, 210);
  }

  public void say() {
    System.out.println(this.getName() + "说：周日，被我射熄火了，所以今天是周一！");
  }

  //表示后羿发动一技能
  public void track01() {
    startAnility(new Track("炙热之风", 1.5, 10));
  }

  //表示后羿发动二技能
  public void track02() {
    startAnility(new Track("燎原箭雨", 2, 20));
  }

  //表示后羿发动三技能
  public void track03() {
    startAnility(new Track("惩戒射击", 3, 30));
  }
}
