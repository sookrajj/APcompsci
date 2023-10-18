package Lang213fcl;

public class cl213f {
    private double perkf;
    private double perks;
    private double perkl;
    private int kilou;


    public cl213f(int kilosused) {
        kilou = kilosused;
        perkf = 0;
        perks = 0;
        perkl = 0;
    }

    public void calc() {
        if (kilou > 10000) {
            perkl = (kilou - 10000) * 0.04;
            perkf = 2000 * .07;
            perks = 8000 * 0.05;
        } else if (kilou > 2000) {
            perkl = 0;
            perkf = 2000 * .07;
            perks = (kilou - 2000) * 0.05;
        } else {
            perkl = 0;
            perkf = kilou * .07;
            perks = 0;
        }
    }
    public double getPerkf() {return perkf;}
    public double getPerks() {return perks;}
    public double getPerkl() {return perkl;}
}
