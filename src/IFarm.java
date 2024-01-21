package Q2;

import Q2.prog213vcl.Bank;
import Q2.prog213vcl.Transaction;

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
            ArrayList<Integer> allcows = new ArrayList<>();
            for (int lcv = 0; lcv < numcows; lcv++) {
              allcows.add(s.nextInt());
              allcows.add(s.nextInt());
              allcows.add(s.nextInt());
              allcows.add(s.nextInt());
            }

            int numhorses = 0;
            ArrayList<Double> allhorses = new ArrayList<>();
            for (int lcv = 0; lcv < numcows; lcv++) {
              allhorses.add(s.nextInt());
              allhorses.add(s.nextInt());
              allhorses.add(s.nextInt());
              allhorses.add(s.nextInt());
            }

            
          



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
