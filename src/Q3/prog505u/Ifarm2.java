package Q3.prog505u;

import java.util.ArrayList;

public interface Ifarm2 {
    /** Feeds all cows where farm has enough food */
    private boolean feedCows2() { return false; }

    /** Feeds all horses where farm has enough food */
    private boolean feedHorses2()  { return false; }

    /** Feeds all cows and horses where farm has enough food  */
    public boolean feedAllAnimals2();

    /** Calculates the value of the milk produced by the
     *  cows price for each cow's milk is the same per pound */
    private double cowIncome2(double perPound) {return 0;}

    /** Calculates the value of the rides given by the horses
     *  ride value of each horse changes based on the horse */
    private double horseIncome2() { return 0; }

    /** Calculates the daily income of the farm */
    public double farmIncome2();

    /** Calculates the total weight of all the farm animals */
    public int getWeight();

    /** Calculates the amount of money it will
 	*  take to feed the animals for the day */
    public double getCost();

    /** Returns the cows in an ArrayList */
    public ArrayList<Cow2> getCows();

    /** Returns the horses in an ArrayList */
    public ArrayList<Horse2> getGay();
}
