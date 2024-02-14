package Q3;

import java.util.Scanner;

public class prog910re {
    public static int deciToBin(String num) {
        if (num.length() == 0) return 0;
        if (num.substring(0,1).equals("1")) {
            return (int) Math.pow(2, num.length()-1) + deciToBin(num.substring(1));
        }

        return deciToBin(num.substring(1));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a binary code to be converted to a decimal ");
        String num = s.nextLine();
        while (!num.equals("no")) {
            System.out.println(deciToBin(num));
            System.out.println("\nEnter a binary code to be converted to a decimal (no to stop) ");
            num = s.nextLine();
        }
    }
}
//Enter a binary code to be converted to a decimal
//11110101011
//1963