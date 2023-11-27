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


  public cl410t() {
    yes = 0;
    no = 0.0;
    cnt = 0;

    tot = 0.0;
    
    bwpv = 0;
    mypov = 0.0;

     }
  public cl410t(int ids, int incs, int mems, int ye) {
    myids[cnt] = ids;
    myincs[cnt] = incs;
    mymems[cnt] = mems;
    myho[cnt] = "";
    tot += incs;
    cnt = ye;
  }

  public void calc() {
    for (int lcv = 0; lcv < 13; lcv++) {
      tot += myincs[lcv];
    }
    tot /= 13;
    for (int lcv = 0; lcv < 13; lcv++) {
      if (myincs[lcv] <= tot) {
        bwpv++;

        myho[lcv] = "";

      }

    }
    for (int lcv = 0; lcv < 13; lcv++) {
      if (myincs[lcv] >= 3750.00 + 750.00 * (mymems[lcv]-2)) yes++;
      else no++;
    }
    mypov = no/(13);
  }
  public double getpov() {return mypov;}
  public int getYes() {return yes;}
  public double getTot() {return tot;}
  public String[] getHo() { return myho;}
  public String toString () {
    for (int lcv = 0; lcv < cnt; lcv++) {
      return myids[lcv] + "\t" + myincs[lcv] + "\t" + mymems[lcv];
    }
    return "";
  }


}
