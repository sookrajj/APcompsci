

public horse {
  private int myWeight;
	private int myNumRides;
	private double  myCostPerRide;
	private int myCorn;
	private int myNumBales;

  public horse(int horseWeight, int numrides, double costperride, int horsecorn, int horsehay) {
    myWeight = horseWeight;
    myNumRides = numrides;
    myCostPerRide = costperride;
    myCorn = horsecorn;
    myNumBales = horsehay;
  }

  public int getWeight() {return myWeight;}

  public double value() {retunr myNumRides * myCostPerRide;}

  public int getCorn() {retun myCorn;}

  public int getHay() {return myNumBales;}

  public double getCost(int cornCost, int hayCost) {return (cornCost * myCorn) + (hayCost + myNumBales);}
}
