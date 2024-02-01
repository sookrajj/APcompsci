package Q3.prog505u;

public class Cow2 {
  private int myweight;
  private int mymilk;
  private int mycorn;
  private int myHaybales;

  public Cow2(int weight, int milk, int corn, int HayEaten) {
    myweight = weight;
    mymilk = milk;
    mycorn = corn;
    myHaybales = HayEaten;
  }

    public void changeWeight(int weight) {myweight = weight;}
    public void changeCorn(int corn) {mycorn = corn;}
    public void changeHaybales(int haybales) {myHaybales = haybales;}
    public void changeRides(int milk) {mymilk = milk;}
  public int getWeight() {return myweight;}
    public int getMilk() {return mymilk;}

	//returns the value of the milk produced
	public double value(double perPound) {return perPound * mymilk;}

	//returns the amount of corn eaten by this cow
	public int getCorn() {return mycorn;}

	//returns the amount of hay eaten by this cow
	public int getHay() {return myHaybales;}

	//calculates the amount of money it will take to feed the cows for the day
	public double getCost(double corncost,double haycost) {return (corncost*mycorn) + (haycost * myHaybales);}
}
