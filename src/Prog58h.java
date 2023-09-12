import java.util.*;

public class Prog58h {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount of money put in =");
        double p = input.nextDouble();

        System.out.println("The interest rate is");
        double r = input.nextDouble();

        System.out.println("The amount of years money is in the account: ");
        double n = input.nextDouble();

        System.out.println("The amount of days the money is in the account is");
        double t = input.nextDouble();

        double m = (.01 * r) / n;
        double l = (n * t) / 365.0;
        double A = p * (Math.pow(1 + ((.01 * r) / n), l)) - 1;

        double earn = A - p;


        System.out.println("The interest earned is " + earn);
        System.out.println("The total amount in savings is now " + A);




    }
}
//The interest earned is 1637.9571470100136
//The total amount in savings is now 6637.957147010014