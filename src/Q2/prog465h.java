package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465h {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog465h.dat"));
            System.out.println("Sample Output (Program 465h) : ");
            for (int lcv = 0; lcv < 3; lcv++) {

                int fir = s.nextInt();
                int sec = s.nextInt();
                int[][] nums = new int[fir][sec];
                for (int r = 0; r < nums.length; r++) {
                    for (int c = 0; c < nums[0].length; c++) {
                        nums[r][c] = s.nextInt();
                    }
                }
                int nonzero = 0;
                System.out.println("Original Matrix");
                for (int r = 0; r < nums.length; r++) {
                    for (int c = 0; c < nums[0].length; c++) {
                        System.out.print(nums[r][c] + " ");
                    }
                    System.out.println();
                }

                for (int r = 0; r < nums.length; r++) {
                    for (int c = 0; c < nums[0].length; c++) {
                        if(nums[r][c] != 0) {
                            nonzero++;
                        }
                    }
                }

                if (nonzero * 3 < fir * sec) {
                    int[][] next = new int[nonzero][3];

                    for (int r = 0; r < nums.length; r++) {
                        for (int c = 0; c < nums[0].length; c++) {
                            if (nums[r][c] != 0) {
                                next[r][0] = r+1;
                                next[r][1] = c+1;
                                next[r][2] = nums[r][c];
                            }
                        }
                    }

                    for (int r = 0; r < nums.length; r++) {
                        for (int c = 0; c < nums[0].length; c++) {
                            System.out.print(next[r][c] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("The Original Matrix is Sparse");
                } else if (nonzero * 3 == fir * sec) {
                    int[][] next = new int[nonzero][3];

                    for (int r = 0; r < nums.length; r++) {
                        for (int c = 0; c < nums[0].length; c++) {
                            if (nums[r][c] != 0) {
                                next[r][0] = r+1;
                                next[r][1] = c+1;
                                next[r][2] = nums[r][c];
                            }
                        }
                    }

                    for (int r = 0; r < nums.length; r++) {
                        for (int c = 0; c < nums[0].length; c++) {
                            System.out.print(next[r][c] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");
                } else {
                    System.out.println("The Original Matrix is Abundant");
                }
            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
