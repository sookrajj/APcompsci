package Q3.GIGAFARM;

public class GIGAPig extends GIGAAnimals{

    private double  price;
    private int weight;
    public GIGAPig(int corn, int hay, int beans, int oats) {
        super(corn, hay, beans, oats);
        weight = (int) Math.round(Math.random() * 40) + 20;
        price = Math.round(Math.random() * 4 * 100)/100 + 6;
    }

    public double getIncome(double milkCost) {
        return price * weight;
    }
}
