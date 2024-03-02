package Q3.GIGAFARM;

public class GIGAHorse extends GIGAAnimals{
    private String name;
    private double rideCost;
    private static int numRides;


    public GIGAHorse(int corn, int hay, int beans, int oats) {
        super(corn, hay, beans, oats);
        String Vowel = "aeiouy";
        String constant = "bcdfghjklmnpqrstvwxz";
        int fir = (int) Math.round(Math.random()*19 );
        int sec = (int) Math.round(Math.random()*19);
        int thir = (int) Math.round(Math.random()*5);
        int fou = (int) Math.round(Math.random()*19);
        name = constant.substring(fir, fir+1) + constant.substring(sec, sec+1) + Vowel.substring(thir, thir+1) + constant.substring(fou, fou+1);
        rideCost = Math.round(Math.random() * 3.5 * 100)/100 + 7;
//        int corn = (int) Math.round(Math.random() * 2) + 2;
//        int hay = (int) Math.round(Math.random() * 2) + 1;
//        int beans = (int) Math.round(Math.random() * 3) + 2;
//        int oats = (int) Math.round(Math.random() * 3) + 1;
        numRides = 0;
    }
    public void ridden() {numRides++;}

    public double getRideCost() {
        return rideCost;
    }

    public int getRides() {return numRides;}
    public String getName() {
        return name;
    }

    public double getIncome(double milkCost) {
        return rideCost;
    }
}
