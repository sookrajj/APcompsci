package Q2.cllp3_14;

public class cllp3_14 {
  private int myany;
  private int mymny;
  private int myanj;
  private int mymnj;
  private int myac;
  private int mymc;
  private double antot;
  private int martot;
  private double peran;
  private double permar;
  private double tot;

  public cllp3_14(int any, int mny, int anj, int mnj, int ac, int mc) {
    myany = any;
    mymny = mny;
    myanj = anj;
    mymnj = mnj;
    myac = ac;
    mymc = mc;
    antot = myany + myanj + myac;
    martot = mymny + mymnj + mymc;
    peran = 0.0;
    permar = 0.0;
    tot = antot + martot;
  }

  public void calc() {
    peran = (Math.round(antot/tot * 100.0 *100) /100.0);
    permar = Math.round(martot/tot * 100.0 *100) / 100.0;
  }

  public String toString() {
    return "Canidates\t\t Votes Percentage" +
           "\nAwbrey  \t\t" + antot + "\t" + peran + " %" +
           "\nMartinez\t\t" + martot + "\t" + permar + " %" +
           "\nTOTAL VOTES:\t " + tot;
  }
}
