package Q2.prog410tacl;

public class cl410t {
  private int[] myids = new int[50];
  private int[] myincs = new int[50];
  private int[] mymems = new int[50];
  private int[] myho = new int[50];
  private double tot;
  private int cnt;
  private int yes;
  private double no;
  private double bwpv;
  private double mypov;

  public cl410t(int ids, int incs, int mems) {
     yes = 0;
     no = 0.0;
    cnt = 15;
    tot = 0.0;

    for (int lcv = 1; lcv <= cnt; lcv++) {
      myids[lcv-1] = ids;
      myincs[lcv-1] = incs;
      mymems[lcv-1] = mems;
      tot += incs;
    }


    bwpv = 0.0;
    mypov = 0.0;
    cnt++;
    for (int lcv = 0; lcv < 25; lcv++) myho[lcv] = 0;

  }

  public void calc() {
    tot = tot/cnt;
    for (int lcv = 0; lcv < cnt-1; lcv++) {
      if (myincs[lcv] >= tot) {
        for (int lcv2 = 1; lcv2 < lcv; lcv2++) {
          myho[lcv2-1] = myids[lcv] + myincs[lcv] + mymems[lcv];
        }
      }
      if (myincs[lcv] >= 3750.00 + 750.00 * (mymems[lcv]-2)) yes++;
      else no++;
      mypov = Math.round(no/(yes+no) *100.0) /100.0;
    }

  }
  public double getpov() {return mypov;}
  public double getTot() {return tot;}
  public int[] getHo() { return myho;}
  public String toString () {
    for (int lcv = 0; lcv < cnt; lcv++) {
      return myids[lcv] + "\t" + myincs[lcv] + "\t" + mymems[lcv];
    }
    return "";
  }

}
