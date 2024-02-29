package Q3.GIGAFARM;

public class GIGACow extends GIGAAnimals{
    private int weight;
    private int ID;
    private int milk;

    public GIGACow(int corn, int hay, int beans, int oats) {
        super(corn, hay, beans, oats);

        weight = (int) Math.round(Math.random() * 500) + 1000;
        for (int lcv = 0; lcv < 4; lcv++) {
            ID += (int) Math.round(Math.random()*9) * Math.pow(10, lcv);
        }
        milk = (int) Math.round(Math.random() * 80) + 20;
    }
    public int getWeight() {return weight;}
    public int getId() {return ID;}
    public int getMilk() {return milk;}

    public double getIncome(double milkCost) {
        return milk * milkCost;
    }
}
