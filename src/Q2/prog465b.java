package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465b {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] mat = new int[3][4];

            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    mat[lcv][lcv2] = s.nextInt();
                }
            }
            System.out.println("Row   Column");
            for (int lcv = 1; lcv < mat.length+1; lcv++ ) {
                for (int lcv2 = 1; lcv2 < mat[0].length+1; lcv2++) {
                    if (mat[lcv-1][lcv2-1] < 100) {
                        System.out.println(lcv + " " + lcv2);
                    }
                }
            }

        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Row   Column
//2 1
//2 4
//3 2