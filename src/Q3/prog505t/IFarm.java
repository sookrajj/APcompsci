package Q3.prog505t;

import Q3.prog505t.cows;
import Q3.prog505t.farmcheck;
import Q3.prog505t.horse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IFarm {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog505t.dat"));
            int haybales = s.nextInt();
            double haysales = s.nextDouble();
            int corn = s.nextInt();
            double cornsales = s.nextDouble();
            int numcows = s.nextInt();
            double perPound = 0.2;
            ArrayList<cows> allcows = new ArrayList<cows>();
            for (int lcv = 0; lcv < numcows; lcv++) {
                int cowWeight = s.nextInt();
                int poundsOfMilk = s.nextInt();
                int cowcorn = s.nextInt();
                int cowhay = s.nextInt();
              allcows.add(new cows(cowWeight, poundsOfMilk, cowcorn, cowhay));
            }

            int numhorses = s.nextInt();
            ArrayList<horse> allhorses = new ArrayList<>();
            for (int lcv = 0; lcv < numhorses; lcv++) {
              allhorses.add(new horse(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextDouble()));
            }

            farmcheck farm = new farmcheck();
            farm = new farmcheck(allcows, allhorses, numcows, numhorses, cornsales, haysales, haybales, corn);
            double income = farm.farmIncome(perPound);
            

            System.out.println("The income of the day is: $" + income);

            System.out.println("The cost of feeding the animals for a day is: $" + farm.getCost());
            System.out.println("The weight of all the animals is: " + farm.getWeight() + " Pounds");

            if (farm.feedAllAnimals()) {
                System.out.println("The animals have been fed. You have " + farm.gethaycnt() + " haybales and " + farm.getcorncnt() + " corn left.");
            } else {
                System.out.println("There's not enough food. We need " + farm.getMoreHay() + " haybales and " + farm.getMoreCorn() + " corn left.");
            }

            for (int lcv = 0; lcv < 3; lcv++) {
                double lowestmilk = 1000;
                int index = -1;
                for (int c = 0; c < numcows; c++) {
                    if (lowestmilk > allcows.get(lcv).value(perPound)) {
                        lowestmilk = allcows.get(lcv).value(perPound);
                        index = c;
                    }
                }
                allcows.remove(index);
                numcows--;
            }

            for (int lcv = 0; lcv < 2; lcv++) {
                double lowestmilk = 1000;
                int index = -1;
                for (int c = 0; c < numhorses; c++) {
                    if (lowestmilk > allhorses.get(lcv).value()) {
                        lowestmilk = allhorses.get(lcv).value();
                        index = c;
                    }
                }
                allhorses.remove(index);
                numhorses--;
            }

            allcows.set(0, new cows(1250, 80, 4, 3));

            System.out.println("Total number of cows and horses on the farm " + (numcows+numhorses));

            
          



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
