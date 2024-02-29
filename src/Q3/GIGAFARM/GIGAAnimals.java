package Q3.GIGAFARM;

public abstract class GIGAAnimals {
    private int Corn;
    private int Hay;
    private int Beans;
    private int Oats;

    public GIGAAnimals(int corn, int hay, int beans, int oats) {
        Corn = corn;
        Hay = hay;
        Beans = beans;
        Oats = oats;
    }

    public int getCorn() {return Corn;}
    public int getHay() {return Hay;}
    public int getBeans() {return Beans;}
    public int getOats() {return Oats;}

    public double getCost(double cornCost, double hayCost, double beanCost, double oatCost) {
        return cornCost*Corn + hayCost*Hay + beanCost*Beans + oatCost*Oats;
    }
    public abstract double getIncome(double milkCost);

    public double getProfit(double milkCost, double cornCost, double hayCost, double beanCost, double oatCost) {
        return getIncome(milkCost) - getCost(cornCost, hayCost, beanCost, oatCost);
    }


}
