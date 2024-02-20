package Q3.farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();
            int numHay = s.nextInt();
            double hayCost = s.nextDouble();
            int numCorn = s.nextInt();
            double cornCost = s.nextDouble();
            int cowRows = s.nextInt();
            int cowPens = s.nextInt();
            for (int lcv = 0; lcv < cowRows; lcv++) {
                for (int lcv2 = 0; lcv2 < cowPens; lcv2++) {
                    String name = s.next();
                    int weight = s.nextInt();
                    int milk = s.nextInt();
                    int hayEaten = s.nextInt();
                    int cornEat = s.nextInt();
                    animals.add(new CowW(name, weight, milk, cornEat, hayEaten));
                    numHay -= hayEaten;
                    numCorn -= cornEat;
                }
            }
            int horRows = s.nextInt();
            int horPens = s.nextInt();
            for (int lcv = 0; lcv < horRows; lcv++) {
                for (int lcv2 = 0; lcv2 < horPens; lcv2++) {
                    String name = s.next();
                    int weight = s.nextInt();
                    int hayEaten = s.nextInt();
                    int cornEat = s.nextInt();
                    double rides = s.nextDouble();
                    double cost = s.nextDouble();
                    HorseW wow = new HorseW(name, weight, cornEat, hayEaten, rides, cost);
                    animals.add(wow);
                    numHay -= hayEaten;
                    numCorn -= cornEat;
                }
            }

            /*TODO: report income of day
            Todo: cumulative weight, enough food to feed
            Todo: cow makes most money
             */
            int mostmonindex = 0;
            double income = 0;
            int totWeight = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof CowW) {
                    if (animals.get(lcv).value(cornCost, hayCost) > animals.get(mostmonindex).value(cornCost, hayCost)) {
                        mostmonindex = lcv;
                    }

                }
                income += animals.get(lcv).value(cornCost, hayCost);
                totWeight += animals.get(lcv).getWeight();
            }

            System.out.println("Total income is " + income);
            System.out.println("The cow's name who makes the most money is " + animals.get(mostmonindex).getName());
            System.out.println("Total weight on the farm is " + totWeight);

            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof HorseW) {
                    HorseW horse = (HorseW)animals.get(lcv);

                    if (horse.value(cornCost, hayCost) < minHorseValue) {
                        minHorseValue = horse.value(cornCost, hayCost);
                        minHorseIndex = lcv;
                    }
                }
            }

            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
