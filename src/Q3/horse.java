package Q3;

public class horse {
  private int myWeight;
	private int myNumRides;
	private double  myCostPerRide;
	private int myCorn;
	private int myNumBales;

  public horse(int horseWeight, int horsecorn, int horsehay, int numrides, double costperride) {
    myWeight = horseWeight;
    myNumRides = numrides;
    myCostPerRide = costperride;
    myCorn = horsecorn;
    myNumBales = horsehay;
  }

  public int getWeight() {return myWeight;}

  public double value() {return myNumRides * myCostPerRide;}

  public int getCorn() {return myCorn;}

  public int getHay() {return myNumBales;}

  public double getCost(double cornCost, double hayCost) {return (cornCost * myCorn) + (hayCost + myNumBales);}
}
