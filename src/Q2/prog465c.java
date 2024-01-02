package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465c {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog465c.txt"));
            int row = s.nextInt();
            int col = s.nextInt();
            int[][] mat = new int[row][col];
            System.out.println("Original Table");
            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    mat[lcv][lcv2] = s.nextInt();
                    System.out.print(mat[lcv][lcv2] + " ");
                }
                System.out.println();
            }
            int tot = 0;
            for (int[] lcv : mat) {
                for (int num : lcv) {
                    tot += num;
                }
            }
            tot -= mat[1][1];
            tot -= mat[1][2];
            System.out.println("The total of the edges is " + tot);


        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Original Table
//100 195 182 225
//83 125 235 67
//129 42 100 750
//The total of the edges is 1873