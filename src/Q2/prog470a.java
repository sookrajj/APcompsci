package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog470a {
    public static void main(String[] args) {
        try {
          Scanner s = new Scanner(new File("Langdat/prog464a.dat"));
          int[][] mat = new int[6][5];

          for (int lcv = 0; lcv < mat.length-1; lcv++) {
            for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                mat[lcv][lcv2] = s.nextInt();
            }
          }

          for (int lcv = 0; lcv < mat[0].length; lcv++) {
            int tot = 0;
            for (int lcv2 = 0; lcv2 < mat.length-1; lcv2++) {
              tot += mat[lcv2][lcv];
            }
            mat[5][lcv] = tot;
          }
          for (int[] lcv : mat) {
            for (int num : lcv) {
              System.out.print(num + " ");
            }
            System.out.println();
          }


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//45 67 89 12 -3
//-3 -6 -7 -4 -9
//96 81 -8 52 12
//14 -7 72 29 -1
//19 43 28 63 87
//171 178 174 152 86