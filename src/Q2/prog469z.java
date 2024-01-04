package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog469z {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog213v.dat"));
            int rows = s.nextInt();
            int[][] nums = new int[rows][rows];
            int[][] right = new int[rows][rows];
            int[] left = new int[rows];

            int[] all = new int[50];
            int cnt = 0;
            for (int lcv = 0; lcv < rows*rows; lcv++) {
              if (s.hasNext()) {
                all[cnt] = s.nextInt();
                cnt++;
              }
            }

            int temp = 0; // temp for row length
            int max = all[0]; // longest row
            for (int lcv = 0; lcv < all.length-1; lcv++) {
                all[lcv] = temp;

                if (max < temp) {
                    max = temp;
                }
                left[cnt] = all[lcv];
                lcv += temp;
            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
