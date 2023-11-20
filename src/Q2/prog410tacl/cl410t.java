package Q2.prog410tacl;

public class cl410t {
  private int[] myids;
  private int[] myincs;
  private int[] mymems;
  private String[] myho;
  private double tot;
  private int cnt;
  private int yes;
  private double no;
  private int bwpv;
  private double mypov;


  public setcl410t() {
    yes = 0;
    no = 0.0;
    cnt = 0;

    tot = 0.0;

    myids = new int[50];
    myincs[] = new int[50];
    mymems[] = new int[50];
    myho[] = new String[50]
    tot = 0.0;
    
    bwpv = 0;
    mypov = 0.0;

     }
  public cl410t(int ids, int incs, int mems) {
    myids[cnt] = ids;
    myincs[cnt] = incs;
    mymems[cnt] = mems;
    myho[cnt] = "";
    tot += incs;
    cnt++
    
  }

  public void calc() {
    for (int lcv = 0; lcv < cnt+1; lcv++) {
      tot += myincs[lcv];
    }
    tot /= 15;
    for (int lcv = 0; lcv < cnt+1; lcv++) {
      if (myincs[lcv] <= tot) {
        bwpv++;

        myho[lcv] = "";

      }

    }
    for (int lcv = 0; lcv < cnt+1; lcv++) {
      if (myincs[lcv] >= 3750.00 + 750.00 * (mymems[lcv]-2)) yes++;
      else no++;
    }
    mypov = no/(cnt+1);
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
