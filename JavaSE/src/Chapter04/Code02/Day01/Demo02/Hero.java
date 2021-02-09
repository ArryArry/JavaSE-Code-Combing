package Chapter04.Code02.Day01.Demo02;

public abstract class Hero {

  private String name;
  private int HP;
  private int MP;
  private int track;
  private int defence;

  public abstract void track01();

  public abstract void track02();

  public abstract void track03();

  public abstract void say();


  //发动技能具有共同的操作，抽取公共操作到方法中
  public void startAnility(Track ability) {
    //判断MP是否足够；如果不足，则技能发动失败；否则，成功发动技能攻击到目标，并减去相应MP
    int consume = ability.getMpConsume();
    if (this.MP < consume) {
      System.out.println("魔法不足，技能不能发动！");
    } else {
      this.MP -= consume;
      //计算伤害，等于攻击力乘以技能加成的倍数
      double sh = ability.getMultiple() * this.track;
      System.out.println(
          this.name + "发动技能" + ability.getName() + "，耗费" + consume + "点魔法，对敌人造成" + sh + "点攻击！");
    }
  }

  public Hero() {
  }

  public Hero(String name, int HP, int MP, int track, int defence) {
    this.name = name;
    this.HP = HP;
    this.MP = MP;
    this.track = track;
    this.defence = defence;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }

  public int getMP() {
    return MP;
  }

  public void setMP(int MP) {
    this.MP = MP;
  }

  public int getTrack() {
    return track;
  }

  public void setTrack(int track) {
    this.track = track;
  }

  public int getDefence() {
    return defence;
  }

  public void setDefence(int defence) {
    this.defence = defence;
  }
}
