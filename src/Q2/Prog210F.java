package Q2;

import java.util.*;

public class Prog210F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 21;
        boolean yes = true;
        while (yes == true) {
            matches = 21;
            System.out.println("Player  Computer   Pile");
            while (matches != 1) {
                System.out.print("How many (1-4) ");
                int num = input.nextInt();
                if (num < 1 || num > 4) {
                    System.out.println("Invalid -- Try Again");
                } else {
                    Prog210computer hi = new Prog210computer(num);
                    hi.calc();
                    int comp = hi.getComputer();

                    matches -= comp + num;
                    System.out.println("\t\t\t\t " + comp + "\t " + matches);

                }
            }
            matches = 0;

            System.out.println("\t\tComputer wins");
            System.out.print("Play again (y/n)? ");
            String hi = input.next();

            if (hi.equals("n")) {
                yes = false;
            }
        }
    }
}
