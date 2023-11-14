package Q2.prog410tacl;

public class cl410t {
  private int[] myids = new int[50];
  private int[] myincs = new int[50];
  private int[] mymems = new int[50];
  private String[] myho = new String[50];
  private double tot;
  private int cnt;
  private int yes;
  private double no;
  private double bwpv;
  private double mypov;
  private int cnt2;

  public cl410t(int ids, int incs, int mems) {
    yes = 0;
    no = 0.0;
    cnt = 0;
    cnt++;
    tot = 0.0;
    cnt2 = 0;

    for (int lcv = 0; lcv < cnt; lcv++) {
      myids[lcv] = ids;
      myincs[lcv] = incs;
      mymems[lcv] = mems;

      cnt2++;
    }


    bwpv = 0.0;
    mypov = 0.0;

    for (int lcv = 0; lcv < myho.length; lcv++) myho[lcv] = "";

  }

  public void calc() {
    for (int lcv : myincs) tot += lcv;
    tot = tot/15;
    for (int lcv = 0; lcv < cnt-1; lcv++) {
      if (myincs[lcv] >= tot) {
        for (int lcv2 = 1; lcv2 < lcv; lcv2++) {
          myho[lcv2-1] = myids[lcv] + "\t" + myincs[lcv] + "\t" + mymems[lcv];
        }
      }
      if (myincs[lcv] >= 3750.00 + 750.00 * (mymems[lcv]-2)) yes++;
      else no++;
      mypov = Math.round(no/(yes+no) *100.0) /100.0;
    }

  }
  public double getpov() {return mypov;}
  public double getTot() {return tot;}
  public String[] getHo() { return myho;}
  public String toString () {
    for (int lcv = 0; lcv < cnt; lcv++) {
      return myids[lcv] + "\t" + myincs[lcv] + "\t" + mymems[lcv];
    }
    return "";
  }

}
