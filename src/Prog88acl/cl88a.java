package Prog88acl;

public class cl88a {
  private int y;
  private int t;
  private int r;
  private int h;
  private int g;
  private double f;
  private int d;
  private int s;

  public cl88a(int num1, int num2) {
    y = num1;
    t = num2;
    r = 0;
    h = 0;
    g = 0;
    f=0;
    d=0;
    s=0;
  }

  public void calc() {
    r = y + t;
    h = y - t;
    g = y * t;
    f = (y + t) / 2;
    d = Math.abs(h);
    if (y<t){
      s = t;
    } else s = y;
  }

  public int getSum() {return r;}
  public int getDif() {return h;}
  public int getPro() {return g;}
  public double getAve() {return f;}
  public int getAbs() {return d;}
  public int getMax() {return s;}
}
