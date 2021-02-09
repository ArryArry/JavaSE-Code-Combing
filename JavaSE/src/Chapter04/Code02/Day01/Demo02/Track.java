package Chapter04.Code02.Day01.Demo02;

public class Track {

  private String name;
  private double multiple;
  private int mpConsume;

  public Track() {
  }

  public Track(String name, double multiple, int mpConsume) {
    this.name = name;
    this.multiple = multiple;
    this.mpConsume = mpConsume;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getMultiple() {
    return multiple;
  }

  public void setMultiple(double multiple) {
    this.multiple = multiple;
  }

  public int getMpConsume() {
    return mpConsume;
  }

  public void setMpConsume(int mpConsume) {
    this.mpConsume = mpConsume;
  }
}
