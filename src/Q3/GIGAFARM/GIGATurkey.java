package Q3.GIGAFARM;

public class GIGATurkey extends GIGAAnimals{
    private int ID;
    private int weight;
    private double worth;

    public GIGATurkey(int corn, int hay, int beans, int oats) {
        super(corn, hay, beans, oats);
        for (int lcv = 0; lcv < 3; lcv++) {
            ID += (int) Math.round(Math.random()*9) * Math.pow(10, lcv);
        }
        weight = (int) Math.round(Math.random() * 10) + 25;
        worth = Math.round(weight * Math.round(Math.random() * 24 * 100))/100;
        worth = worth;
    }
    public int getWeight() {return weight;}
    public int getId() {return ID;}
    public double getWorth() {return worth;}

    public double getIncome(double milkCost) {
        return Math.round(weight * worth * 100) / 100;
    }
}
