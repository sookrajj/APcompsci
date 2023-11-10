package Q2;

public class cllp3-9 {
  private int myby;
  private int mybm;
  private int mybd;
  private int mycy;
  private int mycm;
  private int mycd;
  private int alive;
  private int slpt;

  public cllp3-9(int by, int bm, int bd, int cy, int cm, int cd) {
    myby = by;
    mybm = bm;
    mybd = bd;
    mycy = cy;
    mycm = cm;
    mycd = cd;
    alive = 0;
    slpt = 0;
  }

public void calc() {
  alive = Math.abs(myby-mycy) * 365 + Math.abs(mybm-mycm) * 30 + Math.abs(mybd-mycd);
  slpt = (alive/2) * 8;
}

public String toString() {
  return "You have been alive for " + alive + "days\nYou have slept " + slpt + "hours";
}
}
