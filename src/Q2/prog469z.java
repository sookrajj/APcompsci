package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog469z {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog469z.txt"));
            int rows = s.nextInt(); // amount of rows in matrix we create
            int[][] nums = new int[rows][rows]; // going to be base
            double[][] right = new double[rows][rows+1]; // right side mean matrix
            double[][] down = new double[rows+1][rows]; // down mean matrix
            int[] left = new int[50];

            int[] all = new int[rows];
            int cnt = 0;
            int next = 0;

            while (s.hasNext()) {
                all[cnt] = s.nextInt(); // all the numbers in file except amount of rows
                for (int lcv = 0; lcv < all[cnt]; lcv++) {
                    left[next] = s.nextInt();
                    next++;
                }
                cnt++;
            }
            int extra = 0;
            for (int lcv = 0; lcv < all.length; lcv++) {
                for (int lcv2 = 0; lcv2 < all[lcv]; lcv2++) {
                    nums[lcv][lcv2] = left[extra];
                    extra++;
                }
            }
            System.out.println("Original Matrix");
            for (int[] hi : nums) {
                for (int num : hi) {
                    if (num != 0) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            }

            System.out.println("Row means");

            int mean = 0;
            int meancount = 0;

            for (int r = 0; r < all.length; r++) {
                for (int c = 0; c < all[r]; c++) {
                    if (nums[r][c] != 0) {
                        right[r][c] = nums[r][c];
                        mean += nums[r][c];
                        meancount++;
                    }
                }
                right[r][rows] = ((double) mean/meancount);
                mean = 0;
                meancount = 0;
            }

            for (double[] hi : right) {
                for (double num : hi) {
                    if (num != 0) {
                        if (num % 1 != 0) {
                            System.out.print(num + " ");
                        } else {
                            System.out.print((int) num + " ");
                        }
                    } else System.out.print("  ");
                }
                System.out.println();
            }

            System.out.println("column means");

            mean = 0;
            meancount = 0;
            for (int r = 0; r < nums[0].length; r++) {
                for (int c = 0; c < nums.length; c++) {
                    if (nums[c][r] != 0) {
                        down[c][r] = nums[c][r];
                        mean += nums[c][r];
                        meancount++;
                    }
                }
                down[rows][r] = ((double) mean/meancount);
                mean = 0;
                meancount = 0;
            }

            for (double[] hi : down) {
                for (double num : hi) {
                    if (num != 0) {
                        if (num % 1 != 0) {
                            System.out.print(num + " ");
                        } else {
                            System.out.print((int) num + " ");
                        }
                    } else System.out.print("  ");
                }
                System.out.println();
            }

//            Failed code
//            int cnt2 = 0;
//            int temp = 0; // temp for row length
//            int max = all[0]; // longest row
//            for (int lcv = 0; lcv < all.length-1; lcv++) {
//                all[lcv] = temp;
//
//                if (max < temp) {
//                    max = temp;
//                }
//                left[cnt2] = all[lcv];
//                cnt2++;
//                lcv += temp;
//            }





        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Original Matrix
//1 2
//1 2 3
//1 2 3 4
//3 3 3
//Row means
//1 2     1.5
//1 2 3   2
//1 2 3 4 2.5
//3 3 3   3
//column means
//1 2
//1 2 3
//1 2 3 4
//3 3 3
//1.5 2.25 3 4
