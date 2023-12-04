package Q2.Prog602bcl;

public class InternetCustomer {
    private int myAccount;
    private double myHours;
    private int myCode;
    private double myCharge;

    public InternetCustomer(int acc, double hours, int code) {
        myAccount = acc;
        myHours = hours;
        myCode = code;
        myCharge =0;
    }

    public void setCharge() {
        double surcharge = 0;
        if (myCode == 1) surcharge = 50;
        else if (myCode == 2) surcharge = 150;

        if (myHours >= 15.01) {
            myCharge = 550 + (30 * (myHours - 15));
        }
        else if (myHours >= 5.01) myCharge = 200 + (50 * (myHours - 5));
        else myCharge = 200;
        myCharge += surcharge;
    }

    public int getAcc() {return myAccount;}
    public double getHours() {return myHours;}
    public int getCode() {return myCode;}
    public double getCharge() {return myCharge;}

}
