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
  
public void changeWeight(int weight) {myweight = weight;}
public void changeCorn(int corn) {mycorn = corn;}
public void changeWeight(int haybales) {myHaybales = haybales;}
public void changeWeight(int numRides) {mynumRides = numRides;}
public void changeWeight(double rideCost) {myrideCost = rideCost;}
  public int getWeight() {return myweight;}

//returns the value of the milk produced
public double value() {return mynumRides*mycostRide;}

//returns the amount of corn eaten by this cow
public int getCorn() {return myCorn;}

//returns the amount of hay eaten by this cow
public int getHay() {return myHaybales;}

//calculates the amount of money it will take to feed the cows for the day
public double getCost(double corncost,double haycost) {return (corncost*mycorn) + (haycost * myHaybales);}
}
