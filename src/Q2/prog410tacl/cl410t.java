package Q2.prog410tacl;

public class cl410t {
  private int[] myids = new int[50];
  private int[] myincs = new int[50];
  private int[] mymems = new int[50];
  private String[] mylink = new String[50];
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

  public cl410t(int ids, int incs, int mems, int total) {
    myids[cnt] = ids;
    myincs[cnt] = incs;
    mymems[cnt] = mems;
    mylink[cnt] = ids + " " + incs + " " + mems;
    tot = total;
    if (myincs[cnt] >= 3750.00 + 750.00 * (mymems[cnt]-2)) yes++;
    else no += 1;
    cnt++;
  }

  public void calc() {

    tot /= 27;
    for (int lcv = 0; lcv < 27; lcv++) {
      if (myincs[lcv] >= tot) {


        myho[bwpv] = myids[lcv] + " " + myincs[lcv] + " " + mymems[lcv];
        bwpv++;
      }

    }
    for (int lcv = 0; lcv < 27; lcv++) {
      if (myincs[lcv] >= 3750.00 + 750.00 * (mymems[lcv]-2)) yes++;
      else no++;
    }
    mypov = no/(27);
    for (int lcv = 0; lcv < cnt; lcv++) {
      for(int lcv2 = 0; lcv2 < cnt-1; lcv2++) {
        if (myids[lcv2] > myids[lcv2+1]) {
          String temp = mylink[lcv2];
          mylink[lcv2] = mylink[lcv2+1];
          mylink[lcv2+1] = temp;
        }
      }
    }
  }
  public double getpov() {return mypov;}
  public int getYes() {return yes;}
  public double getTot() {return tot;}
  public String[] getHo() { return myho;}
  public String toString () {
    for (int lcv = 0; lcv < cnt; lcv++) {
      return mylink[lcv];
    }
    return "";
  }


}
