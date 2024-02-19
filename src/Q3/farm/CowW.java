package Q3.farm;

public class CowW extends Animal{
    private static final double MILKPRICE = 0.20;
    private double myMilk;

    public CowW(String name, int weight,  double milk, int corn, int hay) {
        super(name, weight, corn, hay);
        myMilk = milk;
    }

    public double value(double cornCost, double hayCost) {
        return ((myMilk*MILKPRICE) - getfeedCost(cornCost, hayCost));
    }

    public double getMilk()      {return myMilk;}
    public double getMilkprice() {return MILKPRICE;}
}
