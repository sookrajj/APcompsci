package Q3;

import Q2.prog213vcl.Bank;
import Q2.prog213vcl.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IFarmV2 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog505t.dat"));
            int haybales = s.nextInt();
            double haysales = s.nextDouble();
            int corn = s.nextInt();
            double cornsales = s.nextDouble();
            int numcows = s.nextInt();
            double perPound = 0.2;
            int cowpenrow = s.nextInt();
            int cowpencol = s.nextInt()
            cowsv2[][] allcows = new cowsv2[cowpenrow][cowpencol];
            for (int lcv = 0; lcv < allcows.length; lcv++) {
              for (int lcv2 = 0; lcv2 < allcows[0].length; lcv2++) {
              String cowname = s.next();
                int cowWeight = s.nextInt();
                int poundsOfMilk = s.nextInt();
                int cowcorn = s.nextInt();
                int cowhay = s.nextInt();
              allcows[lcv][lcv2] = new cowsv2(cowname, cowWeight, poundsOfMilk, cowcorn, cowhay);
              }
            }

            int horsepenrow = s.nextInt();
            int horsepencol = s.nextInt();
            horsev2[][] allhorses = new horsev2[horsepenrow][horsepencol];
            for (int lcv = 0; lcv < allhorses.length; lcv++) {
              for (int lcv2 = 0; lcv2 < allhorses[0].length; lcv2++) {
              allhorses[lcv][lcv2] = new horsev2(s.next(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextDouble());
              }
            }

            farmcheckv2 farm = new farmcheckv2();
            farm = new farmcheckv2(allcows, allhorses, numcows, numhorses, cornsales, haysales, haybales, corn);
            double income = farm.farmIncome(perPound);
            

            System.out.println("The income of the day is: $" + income);

            System.out.println("The cost of feeding the animals for a day is: $" + farm.getCost());
            System.out.println("The weight of all the animals is: " + farm.getWeight() + " Pounds");
            
           

            if (farm.feedAllAnimals() == true) {
                System.out.println("The animals have been fed. You have " + farm.gethaycnt() + " haybales and " + farm.getcorncnt() + " corn left.");
            } else {
                System.out.println("There's not enough food. We need " + farm.getMoreHay() + " haybales and " + farm.getMoreCorn() + " corn left.");
            }

            double mostmilk = 0;
                int index = -1;
                int col = -1;
                for (int c = 0; c < allcows.length; c++) {
                  for (int r = 0; r < allcows[0].length; r++) {
                    if (mostmilk < allcows[c][r].value(perPound)) {
                        mostmilk = allcows[c][r].value(perPound);
                        index = c;
                        col = r;
                    }
                  }
                }
              System.out.println("The cow who produces the most milk is located at " + (index+1) + " " + (col+1));
          
              double leastmon = 0;
              index = -1;
              col = -1;
                for (int c = 0; c < allhorses.length; c++) {
                  for (int r = 0; r < allhorses[0].length; r++) {
                    if (lowestmon > allhorses[c][r].value()) {
                        lowestmon = allhorses[c][r].value();
                        index = c;
                        col = r;
                    }
                  }
                }
              System.out.println("The horse who produces the least money is located at " + (index+1) + " " + (col+1));

            
          
        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
