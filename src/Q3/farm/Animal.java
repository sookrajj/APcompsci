package Q3.farm;

public abstract class Animal extends Farm{
    private String myName;
    private int myWeight;
    private int mynumCorn;
    private int mynumHay;

    public Animal(String name, int weight, int corn, int hay) {
        super();
        myName = name;
        myWeight = weight;
        mynumCorn = corn;
        mynumHay = hay;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName()    {return myName;}
    public int    getWeight()  {return myWeight;}
    public int    getnumCorn() {return mynumCorn;}
    public int    getnumHay()  {return mynumHay;}


    public double getfeedCost(double cornCost, double hayCost) {
        return (cornCost*mynumCorn) + (hayCost*mynumHay);
    }


}
