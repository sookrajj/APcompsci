package Q3.farm;

import java.util.ArrayList;

public interface IFarrm {
    public interface IFarm {
        /** Feeds all cows where farm has enough food */
        private boolean feedCows() { return false; }

        /** Feeds all horses where farm has enough food */
        private boolean feedHorses()  { return false; }

        /** Feeds all cows and horses where farm has enough food  */
        public boolean feedAllAnimals();

        /** Calculates the value of the milk produced by the
         *  cows price for each cow's milk is the same per pound */
        private double cowIncome(double perPound)  { return 0; }

        /** Calculates the value of the rides given by the horses
         *  ride value of each horse changes based on the horse */
        private double horseIncome() { return 0; }

        /** Calculates the daily income of the farm */
        public double farmIncome();

        /** Calculates the total weight of all the farm animals */
        public int getWeight();

        /** Calculates the amount of money it will
         *  take to feed the animals for the day */
        public double getCost();

        /** Returns the cows in an ArrayList */
        public ArrayList<CowW> getCows();

        /** Returns the horses in an ArrayList */
        public ArrayList<HorseW> getHorses();
    }

}
