package Q2.prog410tacl;

public class cl410t {
  private int[] myids;
  private int[] myincs;
  private int[] mymems;
  private int[] myho;
  private double tot;
  private int cnt;
  private int yes;
  private int no;
  private double bwpv;
  private double mypov;

  public cl410t(int ids, int incs, int mems) {
    int yes = 0;
    int no = 0;
    cnt = 0;
    cnt++;
    for (int lcv = 0; lcv < cnt; lcv++) {
    myids[lcv] = ids;
    myincs[lcv] = incs;
    mymems[lcv] = mems;
    }
    tot = 0.0;
    tot += incs;
    bwpv = 0.0;
    mypov = 0.0;
  }

  public void calc() {
    tot = tot/cnt;
    for (int lcv = 0; lcv < cnt; lcv++) {
      if (myincs[lcv] > tot) {
        myho[lcv] += myincs[lcv];
      }
      if (incs[lcv] > 3750.00 + 750.00 * (mymems[lcv]-2)) yes++;
      else no++;
    }
    mypov = no/(yes+no);
  }
  public double getpov() {return mypov;}
  public double getTot() {return tot;}
  public int[] getHo() { return myho[];}
  public String toString () {
    for (int lcv = 0; lcv < cnt; lcv++) {
      return myids[lcv] + "\t" + myincs[lcv] + "\t" + mymems[lcv];
    }
    return "";
  }

}
