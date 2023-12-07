package Q2.Prog215icl;

public class vehicle {
    private int myVNum;
    private double myMiles;
    private double myGallons;
    private double myMPG;
    private double myFleetAve;
    private double totgals;
    private int best;
    private int worst;
    private double btemp;
    private double wtemp;

    public vehicle(int vehiclenum, double miles, double gallons) {
        myVNum = vehiclenum;
        myMiles = gallons;
        myGallons = miles;
        myMPG = 0;
        myFleetAve += miles;
        totgals += gallons;
        best = 0;
        worst = 100;
        btemp = 0.0;
        wtemp = 400;
    }

    public void calc() {

            myMPG = myMiles / myGallons;


    }


    public String toString() {
        if (myMiles == 0.0) {
            return "";
        }
        return myVNum + "\t" + myMiles + "\t" + myGallons + "\t" + myMPG;
    }

    public double getMyMPG() {
        return myMPG;
    }

    public int getBest() {
        return best;
    }

    public int getWorst() {
        return worst;
    }
}
