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
        perkf = 2000 * .07;
        perks = 8000 * 0.05;
        if (kilou > 10000) {
            perkl = (kilou-10000) * 0.04;
        }
    }
    public double getPerkf() {return perkf;}
    public double getPerks() {return perks;}
    public double getPerkl() {return perkl;}
}
