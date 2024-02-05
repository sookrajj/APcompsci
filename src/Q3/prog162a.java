package Q3;

import java.util.Scanner;

public class prog162a {
    public static int factloop(int n) {

        int product = 1;
        for (int i = 1; i <=n; i++) {
            product *= i;
        }
        return product;
    }
    public static int backfact(int n) {
        int product = 1;
        for (int i = n; i >= 1; i--) {
            product *= i;
        }
        return product;
    }
    public static int recur(int n) {
        if (n <= 1) return 1;
        else return n * recur(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        while (num != 0) {

            int fact = recur(num);
            System.out.println(num + "! = " + fact);


            System.out.print("Enter a number: ");
            num = s.nextInt();
        }

    }
}
