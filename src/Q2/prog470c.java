package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog470c {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] nums = new int[6][6];

            for (int lcv = 0; lcv < nums.length-1; lcv++) {
                for (int col = 0; col < nums[0].length-1; col++) {
                    nums[lcv][col] = s.nextInt();
                }
            }

            for (int r = 0; r < nums.length-1; r++) {
                for (int c = 0; c < nums[0].length-1; c++) {
                    System.out.print(nums[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println();
            for (int row = 0; row < nums.length-1; row++) {
                for (int col = 0; col < nums[0].length-1; col++) {
                    nums[row][5] += nums[row][col];
                    nums[5][col] += nums[row][col];
                    nums[5][5] +=  nums[row][col];
                }
            }

            for (int r = 0; r < nums.length; r++) {
                for (int c = 0; c < nums[0].length; c++) {
                    System.out.print(nums[r][c] + " ");
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
//
//
//45 67 89 12 -3 210
//-3 -6 -7 -4 -9 -29
//96 81 -8 52 12 233
//14 -7 72 29 -1 107
//19 43 28 63 87 240
//171 178 174 152 86 761