package Q2.lp4_8cl;

import java.util.Scanner;

public class lp4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Seed number: ");
        int X0 = input.nextInt();
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter a number: ");
        int c = input.nextInt();
        System.out.println("Enter a number: ");
        int m = input.nextInt();
        cllp4_8 hi = new cllp4_8(a, c, m, X0);
        for (int lcv = 0; lcv < 9; lcv++) {
            String ho = hi.toString();
            System.out.println(ho);
        }
    }
}
//Enter Seed number:
//4876
//Enter a number:
//3948
//Enter a number:
//4059
//Enter a number:
//620
//(3948 * 4876 + 4059)  620 = 407
//(3948 * 407 + 4059)  620 = 135
//(3948 * 135 + 4059)  620 = 119
//(3948 * 119 + 4059)  620 = 191
//(3948 * 191 + 4059)  620 = 487
//(3948 * 487 + 4059)  620 = 395
//(3948 * 395 + 4059)  620 = 499
//(3948 * 499 + 4059)  620 = 31
//(3948 * 31 + 4059)  620 = 587