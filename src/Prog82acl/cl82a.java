package Prog82acl;

public class cl82a {
  private int y;
  private int r;
  private int u;
  private int t;
  private int fine;

  public cl82a(int speed, int limit) {
    y = speed;
    r = limit;
    u = 20;
    t = 5;
    fine = 0;
  }

  public void calc() {fine = u + ((y - r) * t);}


  public int getFine() {return fine;}
}
