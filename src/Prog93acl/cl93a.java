package Prog93acl;

public class cl93a {
    private int kWatts; // kilowatts
    private double bRate; // base rate
    private double sCharge; // sur charge
    private double cTax; // city tax
    private double tcost;
    private double lcost;

    public cl93a(int kilowatts) {
        kWatts = kilowatts;
        bRate = 0.0;
        sCharge = 0.0;
        cTax = 0.0;
        tcost = 0.0;
        lcost = 0.0;
    }

    public double getter1() {return bRate;}
    public double getter2() {return sCharge;}
    public double getter3() {return cTax;}
    public double getter4() {return tcost;}
    public double getter5() {return lcost;}

    public void calc() {
        bRate = 0.0475 * kWatts;
        sCharge = bRate * 0.1;
        cTax = bRate * 0.03;
        tcost = bRate + sCharge + cTax;
        lcost = bRate + bRate * 0.04;
    }

    public String toString() {
        return "kilowatts per hour\t" + kWatts + "\n Base rate\t" + bRate + "\n surcharge\t" + sCharge + "\n City Tax\t" + cTax + "\n Total\t" + tcost + "After May 20th cost" + lcost;
         }
}
