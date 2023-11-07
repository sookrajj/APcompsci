package Q2.Prog214barray;

public class cl214b {
    private double mytax;
    private double myhrs;
    private double myrate;
    private double myshfac;
    private double mygpay;
    private double myfica;
    private double mynetwt;
    private double myytd;
    private double mynum;
    private int myemnum;

    public cl214b(double hrs, double rate, double shfac, double ytd, int emnum) {
        mygpay = 0.0;
        myhrs = hrs;
        myrate = rate;
        myshfac = shfac;
        mytax = 0.0;
        myfica = 0.0;
        mynetwt = 0.0;
        myytd = ytd;
        mynum = 17300;
        myemnum = emnum;
    }

    public void calc() {
        mygpay = myhrs * myrate * myshfac;
        if (mygpay < 100.00) mytax = 0.0;
        else if (mygpay < 150.00) mytax = mygpay * 0.08;
        else if (mygpay < 200.00) mytax = mygpay * 0.12;
        else if (mygpay < 300.00) mytax = mygpay * 0.15;
        else mytax = mygpay * 0.175;

        if (myytd > mynum) myfica = 0.0;
        else if (myytd + mygpay < mynum) myfica = mygpay * 0.0605;
        else myfica = 0.0605 * (Math.abs(mynum - myytd + mygpay));

        mynetwt = mygpay - mytax - myfica;
    }

    public String toString() {
        return "Employee number: " + myemnum + "\nHours " + myhrs + " Rate " + myrate + " Shift Factor " + myshfac + "\n\t\t Current \t Year-to date" +
                "\nGross Pay " + mygpay + "\t" + myytd + "\nWithholding " + mytax + "\nFica " + myfica + "\nNet Pay " + mynetwt;
    }
}
