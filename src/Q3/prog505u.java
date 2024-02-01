package Q2;

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

            int haybales = s.nextInt();
            double hayCost = s.nextDouble();
            int corn = s.nextInt();
            double cornCost = s.nextDouble();
            ArrayList<Cow2> cows = new ArrayList<>();
            ArrayList<Horse2> gay = new ArrayList<>();
            int numCows = s.nextInt();
            for (int lcv = 0; lcv < numCows; lcv++) {
                int weight = s.nextInt();
                int milk = s.nextInt();
                int cowHay = s.nextInt();
                int cowCorn = s.nextInt();
                cows.add(new Cow2(weight, milk, cowHay, cowCorn));
            }

            int numHorses = s.nextInt();
            for (int lcv = 0; lcv < numHorses; lcv++){
              int weight = s.nextInt();
              int horseHay = s.nextInt();
              int horseCorn = s.nextInt();
              int numRides = s.nextInt();
              double rideCost = s.nextDouble();
              gay.add(new Horse2(weight, horseHay, horseCorn, numRides, rideCost));
            }

            double perPound = .2;

            


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
