package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog470b {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];
            System.out.println("Original Matrix");
            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    mat[lcv][lcv2] = s.nextInt();
                    System.out.print(mat[lcv][lcv2] + " ");
                }
                System.out.println();
            }


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
