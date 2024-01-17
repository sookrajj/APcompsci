package Q2;

import Q2.prog213vcl.Bank;
import Q2.prog213vcl.Transaction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("Langdat/prog477a.dat"));

            int[][] nums = new int[40][2];
            int cnt = 0;

            while (s.hasNext()) {
                nums[cnt][0] = s.nextInt();
                nums[cnt][1] = s.nextInt();
                cnt++;
            }

            int[][] dave = new int[6][3];
          for (int r = 0; r < dave.length; r++) {
            for (int c = 0; c < dave[0].length; c++) {
              dave[r][c] = 0;
            }
          }

            for (int r = 0; r < cnt; r++) {
              if (nums[r][0] == 1) {
                dave[5][0] += 1;
                if (nums[r][1] == 1) dave[0][0] += 1;
                else if (nums[r][1] == 2) dave[1][0] += 1;
                else if (nums[r][1] == 3) dave[2][0] += 1;
                else if (nums[r][1] == 4) dave[3][0] += 1;
                else if (nums[r][1] == 5) dave[4][0] += 1;
              } else {
                dave[5][1] += 1;
                if (nums[r][1] == 1) dave[0][1] += 1;
                else if (nums[r][1] == 2) dave[1][1] += 1;
                else if (nums[r][1] == 3) dave[2][1] += 1;
                else if (nums[r][1] == 4) dave[3][1] += 1;
                else if (nums[r][1] == 5) dave[4][1] += 1;
              }
            }

              for(int r = 0; r < dave.length; r++) {
                dave[r][2] = dave[r][0] + dave[r][1];
              }

              System.out.println("Grade\tMale\tFemale\tTotal\n\tA\t" + dave[0][0] + "\t\t" + dave[0][1] + "\t\t" + dave[0][2] +
                                 "\n\tB\t" + dave[1][0] + "\t\t" + dave[1][1] + "\t\t" + dave[1][2] +
                                 "\n\tC\t" + dave[2][0] + "\t\t" + dave[2][1] + "\t\t" + dave[2][2] +
                                 "\n\tD\t" + dave[3][0] + "\t\t" + dave[3][1] + "\t\t" + dave[3][2] +
                                 "\n\tF\t" + dave[4][0] + "\t\t" + dave[4][1] + "\t\t" + dave[4][2] +
                                 "\n-------------------------" +
                                 "\n Totals\t" + dave[5][0] + "\t\t" + dave[5][1] + "\t\t" + dave[5][2]);
                
        } catch (IOException e) {
            System.out.println("Can't find data file.");
        }
    }
}
//Grade	Male	Female	Total
//	A	2		4		6
//	B	4		4		8
//	C	4		7		11
//	D	2		3		5
//	F	3		0		3
//-------------------------
// Totals	15		18		33