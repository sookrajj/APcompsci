package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog470a {
    public static void main(String[] args) {
        try {
          Scanner s = new Scanner(new File("Langdat/prog464.dat"));
          int[][] mat = new int[6][5];

          for (int lcv = 0; lcv < mat.length-1; lcv++) {
            for (int lcv2 = 0; lcv2 < mat[0].length; lcv++) {
                mat[lcv][lcv2] = s.nextInt();
            }
          }

          for (int lcv = 0; lcv < mat.length-1; lcv++) {
            int tot = 0;
            for (int lcv2 = 0; lcv2 < mat[0].length; lcv++) {
              tot += mat[lcv][lcv2];
            }
            mat[lcv][5] = tot;
          }
          for (int[] lcv : mat) {
            for (int num : lcv) {
              System.out.print(num);
            }
            System.out.println();
          }


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
