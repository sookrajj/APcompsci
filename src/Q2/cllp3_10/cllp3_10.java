package Q2.cllp3_10;

public class cllp3_10 {
  private int myburgs;
  private int myfres;
  private int mysods;
  private double mytot;
  private double tax;
  private double totwtax;

  public cllp3_10(int burgs, int fres, int sods) {
    myburgs = burgs;
    myfres = fres;
    mysods = sods;
    mytot = 0.0;
    tax = 0.0;
    totwtax = 0.0;
  }

  public void calc() {
    mytot = myburgs * 1.69 + myfres * 1.09 + mysods * 0.99;
    tax = Math.round((mytot * 0.065) * 100.0) / 100.0;
    totwtax = mytot + tax;
  }
  public double getTotwtax() {return totwtax;}
  public String toString() {
    return "Total before tax: " + mytot + "\nTax: " + tax + "\nFinal total" + totwtax;
  }
}
