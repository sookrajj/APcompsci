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

            int numFarms = s.nextInt();
            int haybales = s.nextInt();
            double hayCost = s.nextDouble();
            int corn = s.nextInt();
            double cornCost = s.nextDouble();
            ArrayList<Cow2> farm1cows = new ArrayList<>();
            ArrayList<Horse2> farm1gay = new ArrayList<>();
            ArrayList<Cow2> farm2cows = new ArrayList<>();
            ArrayList<Horse2> farm2gay = new ArrayList<>();
            ArrayList<Cow2> farm3cows = new ArrayList<>();
            ArrayList<Horse2> farm3gay = new ArrayList<>();
            ArrayList<Cow2> farm4cows = new ArrayList<>();
            ArrayList<Horse2> farm4gay = new ArrayList<>();
            int numCows = s.nextInt();
            int[][][] cowfarm = new int[numFarms][numCows][4];
            double[][][] horsefarm = new double[1][1][1];
            for (int z = 0; z < cowfarm.length; z++) {
                for (int y = 0; y < cowfarm[0].length; y++) {
                    for (int x = 0; x < cowfarm[0][0].length; x++) {
                        cowfarm[0][y][x] = s.nextInt();
                    }
                }
            }

            int numHorses = s.nextInt();
            for (int lcv = 0; lcv < numHorses; lcv++){
              int weight = s.nextInt();
              int horseHay = s.nextInt();
              int horseCorn = s.nextInt();
              int numRides = s.nextInt();
              double rideCost = s.nextDouble();
              farm1gay.add(new Horse2(weight, horseHay, horseCorn, numRides, rideCost));
            }

            int farm2numCows = s.nextInt();
            for (int lcv = 0; lcv < farm2numCows; lcv++) {
                int weight = s.nextInt();
                int milk = s.nextInt();
                int cowHay = s.nextInt();
                int cowCorn = s.nextInt();
                farm2cows.add(new Cow2(weight, milk, cowHay, cowCorn));
            }

            int farm2numHorses = s.nextInt();
            for (int lcv = 0; lcv < farm2numHorses; lcv++){
                int weight = s.nextInt();
                int horseHay = s.nextInt();
                int horseCorn = s.nextInt();
                int numRides = s.nextInt();
                double rideCost = s.nextDouble();
                farm2gay.add(new Horse2(weight, horseHay, horseCorn, numRides, rideCost));
            }

            int farm3numCows = s.nextInt();
            for (int lcv = 0; lcv < farm3numCows; lcv++) {
                int weight = s.nextInt();
                int milk = s.nextInt();
                int cowHay = s.nextInt();
                int cowCorn = s.nextInt();
                farm3cows.add(new Cow2(weight, milk, cowHay, cowCorn));
            }

            int farm3numHorses = s.nextInt();
            for (int lcv = 0; lcv < farm3numHorses; lcv++){
                int weight = s.nextInt();
                int horseHay = s.nextInt();
                int horseCorn = s.nextInt();
                int numRides = s.nextInt();
                double rideCost = s.nextDouble();
                farm3gay.add(new Horse2(weight, horseHay, horseCorn, numRides, rideCost));
            }


            double perPound = .2;

            


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
