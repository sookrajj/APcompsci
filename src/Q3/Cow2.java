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

  Public int getWeight() {return myweight;}

	//returns the value of the milk produced
	Public double value(double perpound) {return perPound * milk;}

	//returns the amount of corn eaten by this cow
	Public int getCorn() {return myCorn;}

	//returns the amount of hay eaten by this cow
	Public int getHay() {return myHaybales;}

	//calculates the amount of money it will take to feed the cows for the day
	Public double getCost(double corncost,double haycost) {return (corncost*mycorn) + (haycost * myHaybales);}
}
