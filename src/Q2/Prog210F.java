package Q2;

import java.util.*;

public class Prog210F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 21;
        boolean yes = true;
        while (yes = true) {
            System.out.println("Player  Computer   Pile");
            while (matches != 0) {
                System.out.print("How many (1-4) ");
                int num = input.nextInt();
                if (num < 1 || num > 4) {
                    System.out.println("Invalid -- Try Again");
                } else {
                    Prog210computer hi = new Prog210computer(num);
                    hi.calc();
                    int comp = hi.getComputer();


                }
            }
        }
    }
}
