package Q2.prog410tacl;

public class cl410t {
  private int[] myids = new int[50];
  private int[] myincs = new int[50];
  private int[] mymems = new int[50];
  private String[] mylink = new String[50];
  private String[] myho = new String[27];
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
    mylink[cnt] = myids[cnt] + "\t" + myincs[cnt] + "\t" + mymems[cnt];
    tot = total;
    for (int lcv = 0; lcv < 27; lcv++) {
      if (myincs[lcv] >= 3750.00 + 750.00 * (mymems[lcv])) yes++;
      else no++;
    }


    cnt++;
  }

  public void calc() {

    tot /= 27;
    for (int lcv = 0; lcv < 27; lcv++) {
      if (myincs[bwpv] >= tot) {
        myho[bwpv] = mylink[cnt];
        bwpv++;
      } else {
        myho[bwpv] = "";
        bwpv++;
      }

    }

    mypov = no / (27);
    for (int lcv = 0; lcv < cnt - 1; lcv++) {
      for (int lcv2 = 0; lcv2 < cnt -lcv -1; lcv2++) {
        if (myids[lcv2] > myids[lcv2 + 1]) {
          String temp = mylink[lcv2];
          mylink[lcv2] = mylink[lcv2 + 1];
          mylink[lcv2 + 1] = temp;
        }
      }
    }

  }

    public double getpov () {
      return mypov;
    }

    public double getTot () {
      return tot;
    }
    public String[] getHo () {
      return myho;
    }
    public String toString () {
      for (int lcv = 0; lcv < cnt; lcv++) {
        return mylink[lcv];
      }
      return "";
    }



}