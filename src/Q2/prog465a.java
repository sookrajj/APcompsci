package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465a {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog465a.dat"));
            int[][] mat = new int[4][4];
            int[][] hi = new int[4][4];

            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    mat[lcv][lcv2] = s.nextInt();
                }
            }

            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    hi[lcv][lcv2] = s.nextInt();
                }
            }
            int[][] high = new int[4][4];
            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    if (mat[lcv][lcv2] > hi[lcv][lcv2]) {
                        high[lcv][lcv2] = mat[lcv][lcv2];
                    } else {
                        high[lcv][lcv2] = hi[lcv][lcv2];
                    }
                }
            }
            System.out.println("Original 1");
            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    System.out.print(mat[lcv][lcv2] + " ");
                }
                System.out.println();
            }

            System.out.println("Original 2");
            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    System.out.print(hi[lcv][lcv2] + " ");
                }
                System.out.println();
            }

            System.out.println("highest of both arrays");
            for (int lcv = 0; lcv < mat.length; lcv++) {
                for (int lcv2 = 0; lcv2 < mat[0].length; lcv2++) {
                    System.out.print(high[lcv][lcv2] + " ");
                }
                System.out.println();
            }

        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Original 1
//2 7 6 4
//6 1 2 4
//9 7 2 6
//8 3 2 1
//Original 2
//4 1 3 7
//6 2 3 8
//7 2 2 4
//4 2 3 1
//highest of both arrays
//4 7 6 7
//6 2 3 8
//9 7 2 6
//8 3 3 1
//
//Process finished with exit code 0