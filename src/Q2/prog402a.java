package Q2;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog402a.dat"));
            cl213farray[] list = new cl213farray[1000];
            int cnt = 0;
            double dif = 0.0;
            double mean = 0.0;
            int asc = 0;
            int[] alsc = new int[100];
          
            while (input.hasNext()) {
               int id = input.nextInt();
               int scores = input.nextInt();

               if(kwh != -999) {
                   cl402a yikes = new cl402a(id, scores);
                   list[cnt] = yikes;
                   alsc[cnt] = scores;
                   cnt++;
               }
              asc += scores;

            }
          mean = asc/cnt;
            
          System.out.println("Id\t\tScore\t\tDifference");
            for (int lcv =0; lcv < cnt; lcv++) {
              dif = alsc[lcv] - mean;
                System.out.println(list[lcv] + "\t\t" + dif);
            }
          System.out.println("Average score = " + mean);

        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
