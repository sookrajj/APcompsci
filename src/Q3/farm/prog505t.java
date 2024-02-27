package Q3.farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog505t {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog505w.dat"));
            ArrayList<CowW> cow = new ArrayList<>();
            ArrayList<HorseW> horse = new ArrayList<>();
            int numHay = s.nextInt();
            double hayCost = s.nextDouble();
            int numCorn = s.nextInt();
            double cornCost = s.nextDouble();
            int numCow = s.nextInt();
            for (int lcv = 0; lcv < numCow; lcv++) {
                    String name = s.next();
                    int weight = s.nextInt();
                    int milk = s.nextInt();
                    int hayEaten = s.nextInt();
                    int cornEat = s.nextInt();
                    cow.add(new CowW(name, weight, milk, cornEat, hayEaten));
                    numHay -= hayEaten;
                    numCorn -= cornEat;

            }
            int numHorse = s.nextInt();
            for (int lcv = 0; lcv < numHorse; lcv++) {
                    String name = s.next();
                    int weight = s.nextInt();
                    int hayEaten = s.nextInt();
                    int cornEat = s.nextInt();
                    double rides = s.nextDouble();
                    double cost = s.nextDouble();
                    HorseW wow = new HorseW(name, weight, cornEat, hayEaten, rides, cost);
                    horse.add(wow);
                    numHay -= hayEaten;
                    numCorn -= cornEat;

            }
            Farm farm = new Farm(cow, horse, numCow, numHorse, cornCost, hayCost, numHay, numCorn);

            /*TODO: report income of day
            Todo: cumulative weight, enough food to feed
            Todo: cow makes most money
             */
            int mostmonindex = 0;
            double income = farm.value();
            int totWeight = farm.getweight();
            double dayscost = farm.feed();
            int Cornfood= 0;

//            for (int lcv = 0; lcv < farm.getcows().size(); lcv++) {
//                    if (farm.getcows().get(lcv).value(cornCost, hayCost) > farm.getcows().get(mostmonindex).value(cornCost, hayCost)) {
//                        mostmonindex = lcv;
//                    }
//
//
//
//                income += animals.get(lcv).value(cornCost, hayCost);
//                totWeight += animals.get(lcv).getWeight();
//                Cornfood += animals.get(lcv).getnumCorn();
//                Hayfood += animals.get(lcv).getnumHay();
//            }

            System.out.println("Total income is " + income);
            System.out.println("The cost for one day is " + dayscost);
            System.out.println("Total weight on the farm is " + totWeight);
//            if (numCorn-Cornfood >= 0 && numHay-Hayfood >= 0) {
//                if (numCorn/Cornfood > numHay/Hayfood) {
//                    System.out.println("You have enough food for " + numHay/Hayfood + " days");
//                } else {
//                    System.out.println("You have enough food for " + numCorn/numHay + " days");
//                }
//            } else {
//                System.out.println("Your animals will die");
//            }




        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
