package Q2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog464a {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] list = new int[5][6];

            for (int lcv = 0; lcv < list.length; lcv++) {
                for (int lcv2 = 0; lcv2 < list[0].length-1; lcv2++) {
                    list[lcv][lcv2] = s.nextInt();
                }
            }
            for (int lcv = 0; lcv < list.length; lcv++) {
                int temp = Integer.MIN_VALUE;
                for (int lcv2 = 0; lcv2 < list[0].length; lcv2++) {
                    if (list[lcv][lcv2] > temp) temp = list[lcv][lcv2];
                }
                list[lcv][5] = temp;
            }

            for (int[] row : list) {
                for (int num : row) {
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
