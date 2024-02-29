package Q3.farm;

public class HorseW extends Animal{
    public double mynumRides;
    public double myRideCost;

    public HorseW(String name, int weight, int corn, int hay, double rides, double cost) {
        super(name, weight, corn, hay);
        mynumRides = rides;
        myRideCost = cost;
    }

    public double value(double cornCost, double hayCost) {
        return (mynumRides*myRideCost) - getfeedCost(cornCost, hayCost);
    }
    @Override
    public String getName() {return super.getName() + super.getName();}
    public double getNumRides() {return mynumRides;}
    public double getRideCost() {return myRideCost;}
}
