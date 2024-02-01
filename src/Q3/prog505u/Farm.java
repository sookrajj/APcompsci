package Q3.prog505u;

import Q3.prog505u.Cow2;
import Q3.prog505u.Horse2;
import java.util.ArrayList;

public class Farm implements Ifarm2{
  private ArrayList<Cow2> cow;
  private ArrayList<Horse2> gay;
  private int myNumHaybales;
	private int myNumCorn;
	private double myHayCost;
	private double myCornCost;


  public Farm(ArrayList<Cow2> cow, ArrayList<Horse2> gay, int numHaybales, int numCorn, double HayCost, double CornCost) {
    this.cow = cow;
    this.gay = gay;
    myNumHaybales = numHaybales;
    myNumCorn = numCorn;
    myHayCost = HayCost;
    myCornCost = CornCost;
  }

  public boolean feedCows2() {
    int hay = 0;
    int corn = 0;
    for (Cow2 co : cow) {
      hay += co.getHay();
      corn += co.getCorn();
    }
    if (hay <= myNumHaybales && corn <= myNumCorn) return true;
    return false;
  }

  public boolean feedHorses2() {
    int hay = 0;
    int corn = 0;
    for (Horse2 ho : gay) {
      hay += ho.getHay();
      corn += ho.getCorn();
    }
    if (hay <= myNumHaybales && corn <= myNumCorn) return true;
    return false;
  }

  public boolean feedAllAnimals2() {
    int hay = 0;
    int corn = 0;
    for (Cow2 co : cow) {
      hay += co.getHay();
      corn += co.getCorn();
    }
    for (Horse2 ho : gay) {
      hay += ho.getHay();
      corn += ho.getCorn();
    }
    if (hay <= myNumHaybales && corn <= myNumCorn) {
      myNumCorn -= corn;
      myNumHaybales -= hay;
      return true;
    }
    return false;
  }

  public double cowIncome2(double perPound) {
    double milk = 0;
    for (Cow2 co : cow) {
      milk += co.getMilk() * perPound;
    }
    return milk;
  }

  public double horseIncome2() {
    double ride = 0;
    for (Horse2 ho : gay) {
      ride += ho.value();
    }
    return ride;
  }

  public double farmIncome2() {
    double milk = 0;
    for (Cow2 co : cow) {
      milk += co.getMilk() * .2;
    }
    double ride = 0;
    for (Horse2 ho : gay) {
      ride += ho.value();
    }
    return milk + ride;
  }

  public int getWeight() {
    int cowWeight = 0;
    for (Cow2 co : cow) {
      cowWeight += co.getWeight();
    }
    int horseWeight = 0;
    for (Horse2 ho : gay) {
      horseWeight += ho.getWeight();
    }
    return cowWeight + horseWeight;
  }

  public double getCost() {
    double milk = 0;
    for (Cow2 co : cow) {
      milk += co.getCost(myCornCost, myHayCost);
    }
    double ride = 0;
    for (Horse2 ho : gay) {
      ride += ho.getCost(myCornCost, myHayCost);
    }
    return milk + ride;
  }

  public int weightiestCow() {
    double weight = 0;
    int index = 0;
    for (int lcv = 0; lcv < cow.size(); lcv++) {
	if (weight < cow.get(lcv).getWeight()) {
		weight = cow.get(lcv).getWeight();
		index = lcv;
	}
    }

    return index;
  }

  public int weightiestHorse() {
    double weight = 0;
    int index = 0;
    for (int lcv = 0; lcv < gay.size(); lcv++) {
	if (weight < gay.get(lcv).getWeight()) {
		weight = gay.get(lcv).getWeight();
		index = lcv;
	}
    }

    return index;
  }

  

  public ArrayList<Cow2> getCows() {return cow;}
  public ArrayList<Horse2> getGay() {return gay;}
}
