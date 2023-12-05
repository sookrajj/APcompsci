package Q2.prog214ccl;

public class prog214cl {
    private String myType;
    private double myGals;
    private double galmoney;
    private boolean myWash;
    private double tot;

    public prog214cl(String type, double gallons, boolean wash) {
        myType = type;
        myGals = gallons;
        myWash = wash;
        galmoney = 0.0;
        tot = 0.0;
    }

    public void calc() {
        if (myWash == true) {
            if (myGals <= 10) {
                tot += 2.00;
            } else if (myGals < 20) {
                tot += (2.00 - ((myGals-10) / 5));
            }
        }
        if (myType.equals("P")) {
            tot += myGals * 1.479;
            galmoney = myGals * 1.479;
        }
    }
}
