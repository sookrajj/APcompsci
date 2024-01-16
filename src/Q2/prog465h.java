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
                int cnt = 0;
                if (nonzero * 3 < fir * sec) {
                    int[][] next = new int[nonzero][3];

                    for (int r = 0; r < nums.length; r++) {
                        for (int c = 0; c < nums[0].length; c++) {
                            if (nums[r][c] != 0) {
                                next[cnt][0] = r+1;
                                next[cnt][1] = c+1;
                                next[cnt][2] = nums[r][c];
                                cnt++;
                            }
                        }
                    }

                    for (int r = 0; r < next.length; r++) {
                        for (int c = 0; c < next[0].length; c++) {
                            System.out.print(next[r][c] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("The Original Matrix is Sparse");
                    System.out.println();
                } else if (nonzero * 3 == fir * sec) {
                    int[][] next = new int[nonzero][3];

                    for (int r = 0; r < nums.length; r++) {
                        for (int c = 0; c < nums[0].length; c++) {
                            if (nums[r][c] != 0) {
                                next[cnt][0] = r+1;
                                next[cnt][1] = c+1;
                                next[cnt][2] = nums[r][c];
                                cnt++;
                            }
                        }
                    }

                    for (int r = 0; r < next.length; r++) {
                        for (int c = 0; c < next[0].length; c++) {
                            System.out.print(next[r][c] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");
                    System.out.println();
                } else {
                    System.out.println("The Original Matrix is Abundant");
                    System.out.println();
                }
            }



        } catch (
                IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Sample Output (Program 465h) :
//Original Matrix
//0 0 7 0 0 0
//0 0 0 0 -8 0
//0 0 0 0 0 0
//2 0 0 0 0 0
//0 0 0 0 0 0
//1 3 7
//2 5 -8
//4 1 2
//The Original Matrix is Sparse
//
//Original Matrix
//0 2 0 3 0 1
//8 0 4 0 1 0
//0 3 0 1 0 -7
//5 0 9 0 6 0
//0 2 0 -1 0 7
//The Original Matrix is Abundant
//
//Original Matrix
//0 0 1 0 0 2
//3 0 0 4 0 0
//0 0 5 0 0 6
//7 0 0 8 0 0
//0 0 9 0 0 1
//1 3 1
//1 6 2
//2 1 3
//2 4 4
//3 3 5
//3 6 6
//4 1 7
//4 4 8
//5 3 9
//5 6 1
//The Original Matrix and the Sparse Matrix are Equally Efficient