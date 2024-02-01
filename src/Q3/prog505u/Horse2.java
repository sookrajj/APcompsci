package Q3.prog505u;

public class Horse2 {
  private int myweight;
	private int mynumRides;
	private int mycorn;
	private int myHaybales;
  private double mycostRide;

  public Horse2(int weight, int corn, int HayEaten, int numRides, double rideCost) {
    myweight = weight;
    mycorn = corn;
    myHaybales = HayEaten;
    mynumRides = numRides;
    mycostRide = rideCost;
  }
  
    public void changeWeight(int weight) {myweight = weight;}
    public void changeCorn(int corn) {mycorn = corn;}
    public void changeHaybales(int haybales) {myHaybales = haybales;}
    public void changeRides(int numRides) {mynumRides = numRides;}
    private void changeCost(double rideCost) {mycostRide = rideCost;}
  public int getWeight() {return myweight;}

//returns the value of the milk produced
    public double value() {return mynumRides*mycostRide;}

//returns the amount of corn eaten by this cow
    public int getCorn() {return mycorn;}

//returns the amount of hay eaten by this cow
    public int getHay() {return myHaybales;}

//calculates the amount of money it will take to feed the cows for the day
    public double getCost(double corncost,double haycost) {return (corncost*mycorn) + (haycost * myHaybales);}
}
