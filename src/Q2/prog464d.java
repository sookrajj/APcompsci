package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog464d {

    /**
     * Performs matrix transposition on a 2D array of integers.
     * @param mat 2D array to be transposed
     * @return The transposition of 'mat'
     */
    public static int[][] Transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                transposed[col][row] = mat[row][col];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];

            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = s.nextInt();
                }
            }

            int[][] mat_T = Transpose(mat);
            System.out.println("Original Matrix");
            for (int[] row : mat) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("Transposed Matrix");

            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    System.out.print(mat_T[row][col] + " ");
                }
                System.out.println();
            }

        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Original Matrix
//45 67 89 12 -3
//-3 -6 -7 -4 -9
//96 81 -8 52 12
//14 -7 72 29 -1
//19 43 28 63 87
//Transposed Matrix
//45 -3 96 14 19
//67 -6 81 -7 43
//89 -7 -8 72 28
//12 -4 52 29 63
//-3 -9 12 -1 87