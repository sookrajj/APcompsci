package Q2.prog214ccl;

public class prog214cl {
    private String myType;
    private double myGals;
    private double galmoney;
    private String myWash;
    private double myWMoney;
    private double tot;

    public prog214cl(String type, double gallons, String wash) {
        myType = type;
        myGals = gallons;
        myWash = wash;
        myWMoney = 2.00;
        galmoney = 0.0;
        tot = 0.0;
    }

    public void calc() {
        if (myWash.equals("Y")) {
            if (myGals <= 10) {
                tot += 2.00;
            } else if (myGals < 20) {
                tot += (2.00 - ((myGals - 10) / 5));
                myWMoney = (2.00 - ((myGals - 10) / 5));
            } else myWMoney = 0.00;
        } else myWMoney = 0.0;

        if (myType.equals("P")) {
            tot += myGals * 1.479;
            galmoney = myGals * 1.479;
        } else if (myType.equals("R")) {
            tot += myGals * 1.359;
            galmoney = myGals * 1.359;
        } else if (myType.equals("H")) {
            tot += myGals * 1.429;
            galmoney = myGals * 1.429;
        }

    }

    public String toString() {
        if (myType.equals("P")) {
            return "COMPSCI PETROLEUM COMPANY\n" +
                    "--------------------------------\n" +
                    "Premium" + "\t\t\t" + myGals + "gallons @ 1.479\n" +
                    "--------------------------------\n" +
                    "Gasoline\t\t\t" + galmoney + "\n" +
                    "Wash " + myWash + "\t\t\t\t" + myWMoney + "\n\n" +
                    "\t\t\t\t------\n\n" + "Total Due\t\t   " + tot + "\n" +
                    "--------------------------------\n\n\n";
        } else if (myType.equals("R")) {
            return "COMPSCI PETROLEUM COMPANY\n" +
                    "--------------------------------\n" +
                    "Regular" + "\t\t\t" + myGals + "gallons @ 1.359\n" +
                    "--------------------------------\n" +
                    "Gasoline\t\t\t" + galmoney + "\n" +
                    "Wash " + myWash + "\t\t\t\t" + myWMoney + "\n\n" +
                    "\t\t\t\t------\n\n" + "Total Due\t\t   " + tot + "\n" +
                    "--------------------------------\n\n\n";
        } else if (myType.equals("H")) {
            return "COMPSCI PETROLEUM COMPANY\n" +
                    "--------------------------------\n" +
                    "High Octane" + "\t\t\t" + myGals + "gallons @ 1.429\n" +
                    "--------------------------------\n" +
                    "Gasoline\t\t\t" + galmoney + "\n" +
                    "Wash " + myWash + "\t\t\t\t" + myWMoney + "\n\n" +
                    "\t\t\t\t------\n\n" + "Total Due\t\t   " + tot + "\n" +
                    "--------------------------------\n\n\n";
        }
        return "";
    }
}
