package Q3.farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prog505t {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog505t.dat"));
            ArrayList<CowW> cow = new ArrayList<>();
            ArrayList<HorseW> horse = new ArrayList<>();
            int numHay = s.nextInt();
            double hayCost = s.nextDouble();
            int numCorn = s.nextInt();
            double cornCost = s.nextDouble();
            int numCow = s.nextInt();
            String name = "";
            for (int lcv = 0; lcv < numCow; lcv++) {
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
            System.out.printf("Total income is $%.2f\n",  income);
            System.out.println("The days cost is $" + dayscost);
            System.out.println("Total weight on the farm is " + totWeight);
            if (farm.feedAllAnimals()) {
                System.out.println("Your have enough food to feed all the animals");
                System.out.println("Corn left " + numCorn + " Hay left " + numHay);
            } else {
                System.out.println("We need more food! Corn needed " + farm.getMoreCorn() + " Hay needed " + farm.getMoreHay());
            }

            cow.remove(farm.cowIncome());
            numCow--;

            farm.changeCows(cow, numCow);
            cow.remove(farm.cowIncome());
            numCow--;

            farm.changeCows(cow, numCow);
            cow.remove(farm.cowIncome());
            numCow--;
            farm.changeCows(cow, numCow);
            horse.remove(farm.horseIncome());
            numHorse--;
            farm.changeHorse(horse, numHorse);
            horse.remove(farm.horseIncome());
            numHorse--;
            farm.changeHorse(horse, numHorse);
            cow.set(0, new CowW(cow.get(0).getName(), 1250, 80, 4, 3));
            farm.changeCows(cow, numCow);
            System.out.println("Number of animals on the farm " + farm.getsize());

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
//Total income is $78.90
//The days cost is $180.5
//Total weight on the farm is 42835
//Your have enough food to feed all the animals
//Corn left 2420 Hay left 939
//Number of animals on the farm 20