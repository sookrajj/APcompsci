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
  private int bwpv;
  private double mypov;
  private int cnt2;

  public cl410t(int ids, int incs, int mems) {
    yes = 0;
    no = 0.0;
    cnt = 0;

    tot = 0.0;
    cnt2 = 0;

    myids[cnt] = ids;
    myincs[cnt] = incs;
    mymems[cnt] = mems;

    cnt2++;
    cnt++;
    bwpv = 1;
    mypov = 0.0;

    for (int lcv = 0; lcv < myho.length; lcv++) myho[lcv] = "";

  }

  public void calc() {
    for (int lcv : myincs) tot += lcv;
    tot /= 15;
    for (int lcv = 0; lcv < cnt+1; lcv++) {
      if (myincs[lcv] >= tot) {
        bwpv++;
        for (int lcv2 = 1; lcv2 < bwpv; lcv2++) {
          myho[lcv2-1] = myids[lcv] + "\t" + myincs[lcv] + "\t" + mymems[lcv];
        }
      }

    }
    for (int lcv = 0; lcv < cnt+1; lcv++) {
      if (myincs[lcv] >= 3750.00 + 750.00 * (mymems[lcv]-2)) yes++;
      else no++;
    }
    mypov = no/cnt+1;
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
