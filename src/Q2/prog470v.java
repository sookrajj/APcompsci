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
      boolean yay = false;
      for (int lcv = 0; lcv < card.length; lcv++) {
        for (int lcv2 = 0; lcv2 < card[0].length; lcv2++) {
          card[lcv][lcv2] = cnt;
          cnt++;
        }
      }
      System.out.println("Enter " + size + " different numbers");
      for (int lcv = 0; lcv < size; lcv++) {
        nums[lcv] = input.nextInt();
      }
      int hi = size;
      for (int lcv = 0; lcv < card.length; lcv++) {
        for (int right = 0; right < card[0].length; right++) {
          for (int num : nums) {
            if (num == card[lcv][right]) hi--;
          }
        }
        if (yay == false) {
          if (hi == 0) {
            System.out.println("You're a row winner!");
            yay = true;
          }
        }
        hi = size;
      }

      hi = size;
      for (int lcv = 0; lcv < card[0].length; lcv++) {
        for (int right = 0; right < card.length; right++) {
          for (int num : nums) {
            if (num == card[right][lcv]) hi--;
          }
        }
        if (yay == false) {
          if (hi == 0) {
            System.out.println("You're a column winner!");
            yay = true;
          }
        }
        hi = size;
      }
      hi = size;
      for (int lcv = 0; lcv < card.length; lcv++) {
        for (int right = 0; right < card[0].length; right++) {
          for (int num : nums) {
            if (lcv == right) {
              if (num == card[lcv][right]) hi--;
            }
            if (lcv + right == card.length - 1) {
              if (num == card[lcv][right]) hi--;
            }
          }
        }
        if (yay == false) {
          if (hi == 0) {
            System.out.println("You're a diagonal winner!");
            yay = true;
          }
        }
      }
      if (yay != true) System.out.println("You lose!");
    }
}
//  Enter your card size
//3
//Enter 3 different numbers
//10
//1
//4
//You lose!

//Enter your card size
//3
//Enter 3 different numbers
//6
//4
//5
//You're a row winner!

//Enter your card size
//3
//Enter 3 different numbers
//5
//3
//7
//You're a diagonal winner!

//Enter your card size
//4
//Enter 4 different numbers
//16
//1
//6
//11
//You're a diagonal winner!

//Enter your card size
//3
//Enter 3 different numbers
//4
//1
//7
//You're a column winner!