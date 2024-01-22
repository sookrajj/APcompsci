package Q3;

public class cows {
  private int myWeight;
	private int myPounds;
	private int myCorn;
	private int myNumBales;

  public cows(int cowWeight, int poundsOfMilk, int cowcorn, int cowhay) {
    myWeight = cowWeight;
    myPounds = poundsOfMilk;
    myCorn = cowcorn;
    myNumBales = cowhay;
  }

  public int getWeight() {return myWeight;}

  public double value(double perPound) {return myPounds * perPound;}

  public int getCorn() {return myCorn;}

  public int getHay() {return myNumBales;}

  public double getCost(double cornCost, double hayCost) {return (cornCost * myCorn) + (hayCost + myNumBales);}
}
