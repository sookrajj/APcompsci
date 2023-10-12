package Prog82acl;

public class cl82a {
  private int y;
  private int r;
  private int u;
  private int t;

  public cl82a(int speed, int limit) {
    y = speed;
    r = limit;
    u = 20;
    t = 5;
  }

  public void calc() {
    fine = u + (r - y) * t;
  }

  public int getFine() {return fine;}
}
