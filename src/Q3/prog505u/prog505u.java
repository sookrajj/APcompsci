package Q3.prog505u;

import Q2.prog213vcl.Bank;
import Q2.prog213vcl.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog505u {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog505u.dat"));
            double perPound = .2;
            int numFarms = s.nextInt();
            int haybales = s.nextInt();
            double hayCost = s.nextDouble();
            int corn = s.nextInt();
            double cornCost = s.nextDouble();
            ArrayList<Cow2> farmcows = new ArrayList<>();
            ArrayList<Horse2> farmgay = new ArrayList<>();
            // ArrayList<Cow2> farm2cows = new ArrayList<>();
            // ArrayList<Horse2> farm2gay = new ArrayList<>();
            // ArrayList<Cow2> farm3cows = new ArrayList<>();
            // ArrayList<Horse2> farm3gay = new ArrayList<>();
            // ArrayList<Cow2> farm4cows = new ArrayList<>();
            // ArrayList<Horse2> farm4gay = new ArrayList<>();
            int[] numcows = new int[numFarms];
            int[] numHorses = new int[numFarms];
            int[][][] cowfarm = new int[numFarms][15][4];
            double[][][] horsefarm = new double[numFarms][15][5];
            int cnt = 0;
            for (int z = 0; z < numfarms; z++) {
                for (int y = 0; y < cowfarm[z].length; y++) {
                    numcows[cnt] = s.nextInt();
                    for (int x = 0; x < numCows[cnt]; x++) {
                        cowfarm[z][y][x] = s.nextInt();
                    }
                    numHorses[cnt] = s.nextInt();
                    for (int x = 0; x < numHorses[cnt]-1; x++) {
                        horsefarm[z][y][x] = (double) s.nextInt();
                    }
                    horsefarm[z][y][horsefarm[z][y].length] = s.nextDouble();
                    cnt++;
                }
            }

            for (int z = 0; z < cowfarm.length; z++) {
                for (int y = 0; y < cowfarm[z].length; y++) {
                    int weight = cowfarm[z][y][0];
                    int milk = cowfarm[z][y][1];
                    int hay = cowfarm[z][y][2];
                    int corn = cowfarm[z][y][3];
                    farmcows.add(new Cow2(weight, milk, hay, corn));
                    int weight = (int) horsefarm[z][y][0];
                    int hay = (int) horsefarm[z][y][1];
                    int corn = (int) horsefarm[z][y][2];
                    int ride = (int) horsefarm[z][y][3];
                    double cost = horsefarm[z][y][4];
                    farmhorses.add(new Horse2(weight, hay, corn, ride, cost));
                }
            }

            Farm farm = new Farm(farmcows, farmhorses, haybales, corn, haycost, corncost);

            if (farm.weightiestCow() > farm.weightiestHorse()) {
                System.out.println("The heaviest animal was a cow at " + farm.weightiestCow() + " lbs";
            } else {
                System.out.println("The heaviest animal was a horse at " + farm.weightiestHorse() + " lbs";
            }

            if (farm.lightiestCow() < farm.lightiestHorse()) {
                System.out.println("The lightest animal was a cow at " + farm.lightiestCow() + " lbs";
            } else {
                System.out.println("The lightest animal was a horse at " + farm.lightiestHorse() + " lbs";
            }
            // int numHorses = s.nextInt();
            // for (int lcv = 0; lcv < numHorses; lcv++){
            //   int weight = s.nextInt();
            //   int horseHay = s.nextInt();
            //   int horseCorn = s.nextInt();
            //   int numRides = s.nextInt();
            //   double rideCost = s.nextDouble();
            //   farm1gay.add(new Horse2(weight, horseHay, horseCorn, numRides, rideCost));
            // }

            // int farm2numCows = s.nextInt();
            // for (int lcv = 0; lcv < farm2numCows; lcv++) {
            //     int weight = s.nextInt();
            //     int milk = s.nextInt();
            //     int cowHay = s.nextInt();
            //     int cowCorn = s.nextInt();
            //     farm2cows.add(new Cow2(weight, milk, cowHay, cowCorn));
            // }

            // int farm2numHorses = s.nextInt();
            // for (int lcv = 0; lcv < farm2numHorses; lcv++){
            //     int weight = s.nextInt();
            //     int horseHay = s.nextInt();
            //     int horseCorn = s.nextInt();
            //     int numRides = s.nextInt();
            //     double rideCost = s.nextDouble();
            //     farm2gay.add(new Horse2(weight, horseHay, horseCorn, numRides, rideCost));
            // }

            // int farm3numCows = s.nextInt();
            // for (int lcv = 0; lcv < farm3numCows; lcv++) {
            //     int weight = s.nextInt();
            //     int milk = s.nextInt();
            //     int cowHay = s.nextInt();
            //     int cowCorn = s.nextInt();
            //     farm3cows.add(new Cow2(weight, milk, cowHay, cowCorn));
            // }

            // int farm3numHorses = s.nextInt();
            // for (int lcv = 0; lcv < farm3numHorses; lcv++){
            //     int weight = s.nextInt();
            //     int horseHay = s.nextInt();
            //     int horseCorn = s.nextInt();
            //     int numRides = s.nextInt();
            //     double rideCost = s.nextDouble();
            //     farm3gay.add(new Horse2(weight, horseHay, horseCorn, numRides, rideCost));
            // }


           

            


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
