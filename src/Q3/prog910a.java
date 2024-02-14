package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog910a {
    public static String deciToBin(int num) {
        if (num == 0) return "0";
        if (num == 1) return "1";

        return deciToBin(num/2) + num%2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to be converted to binary ");
        int num = s.nextInt();
        while (num != -1) {
            System.out.println(deciToBin(num));
            System.out.print("\nEnter a number to be converted to binary ");
            num = s.nextInt();
        }
    }
}
//Enter a number to be converted to binary 243
//11110011
//
//Enter a number to be converted to binary 62845
//1111010101111101