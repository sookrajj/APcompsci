public class Horse2 {
  private int myweight;
	private int mynumRides;
	private int mycorn;
	private int myHaybales;
  private double mycostRide;

  public Cow2(int weight, int corn, int HayEaten, int numRides, double rideCost) {
    myweight = weight;
    mycorn = corn;
    myHaybales = HayEaten;
    mynumRides = numRides;
    mycostRide = rideCost;
  }

  Public int getWeight() {return myweight;}

	//returns the value of the milk produced
	Public double value() {return mynumRides*mycostRide;}

	//returns the amount of corn eaten by this cow
	Public int getCorn() {return myCorn;}

	//returns the amount of hay eaten by this cow
	Public int getHay() {return myHaybales;}

	//calculates the amount of money it will take to feed the cows for the day
	Public double getCost(double corncost,double haycost) {return (corncost*mycorn) + (haycost * myHaybales);}
}
