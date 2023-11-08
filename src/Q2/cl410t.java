package Q2;

public class cl410t {
  private int[] myids;
  private int[] myincs;
  private int[] mymems;
  private double tot;
  private int cnt;
  private double bwpv;

  public cl410t(int ids, int incs, int mems) {
    cnt = 0;
    cnt++;
    for (int lcv = 0; lcv < cnt; lcv++) {
    myids[lcv] = ids;
    myincs[lcv] = incs;
    mymems[lcv] = mems;
    }
    tot = 0.0;
    tot += incs;
    bwpv = 0.0
  }

  public void calc() {
    tot = tot/cnt;
    
  }
  public double getTot() {return tot;}
  public String toString() {
    for (int lcv = 0; lcv < cnt; lcv++){
      return myids[lcv] + "\t" + myincs[lcv] + "\t" mymems[lcv];
  }
  }
}
