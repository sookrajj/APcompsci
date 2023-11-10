package Q2;

public class cllp3-14 {
  private int myany;
  private int mymny;
  private int myanj;
  private int mymnj;
  private int myac;
  private int mymc;
  private int antot;
  private int martot;
  private double peran;
  private double permar;
  private int tot;

  public cllp3-14(int any, int mny, int anj, int mnj, int ac, int mc) {
    myany = any;
    mymny = mny;
    myanj = anj;
    mymnj = mnj;
    myac = ac;
    mymc = mc;
    antot = any + anj + ac;
    martot = mny + mnj + mc;
    peran = 0.0;
    permar = 0.0;
    tot = antot + martot;
  }

  public void calc() {
    peran = Math.round(antot/tot * 100.0) / 100.0;
    permar = Math.round(martot/tot * 100.0) / 100.0;
  }

  public String toString() {
    return "Canidates\t\t Votes Percentage" +
           "Awbrey  \t\t" + antot + "\t" + peran + " %" +
           "Martinez\t\t" + martot + "\t" + permar + " %" +
           "TOTAL VOTES:\t " + tot;
  }
}
