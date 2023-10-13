package Prog76acl;

public class cl76a {
  private int y;
  private int r;
  private int u;
  private int number;

  public cl76a(int num) {
    y = num;
    r = 12345679;
    u = 9;
    number = 0;
  }

  public void calc() {
    int cool = y * u;
    number = cool * r;
  }

  public int getNumber() {return number;}
}
