package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog470v {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your card size ");
      int size = input.nextInt();
      int cnt = 1;
      int[] nums = new int[size];
      int[][] card = new int[size][size];
      for (int lcv = 0; lcv < card.length; lcv++) {
        for (int lcv2 = 0; lcv2 < card[0].length; lcv2++) {
          card[lcv][lcv2] = cnt;
          cnt++;
        }
      }
      System.out.println("Enter " + size + " numbers");
      for (int lcv = 0; lcv < size; lcv++) {
        nums[lcv] = input.nextInt();
      }
      int hi = size;
      for (int lcv = 0; lcv < card.length; lcv++) {
        for (int right = 0; right < card[0].length; right++) {
          if (nums[right] == card[lcv][right]) hi--;
        }
        if (hi == 0) {
          System.out.println("You're a row winner!");
        }
      }

      hi = size;
      for (int lcv = 0; lcv < card[0].length; lcv++) {
        for (int right = 0; right < card.length; right++) {
          if (nums[right] == card[lcv][right]) hi--;
        }
        if (hi == 0) {
          System.out.println("You're a column winner!");
        }
      }
      hi = size;
      int bye = size;
      for (int lcv = 0; lcv < card.length; lcv++) {
        for (int right = 0; right < card[0].length; right++) {
          if (lcv == right) {
            if (nums[right] == card[lcv][right]) hi--;
          }
          if (lcv + right == card.length-1) {
            if (nums[right] == card[lcv][right]) hi--;
          }
        }
        if (hi == 0) {
          System.out.println("You're a row winner!");
        }
      }

    }
}
