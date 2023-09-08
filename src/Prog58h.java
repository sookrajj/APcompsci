import java.util.*;

public class Prog58h {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount of money put in =");
        double p = input.nextDouble();

        System.out.println("The interest rate is");
        double r = input.nextDouble();

        System.out.println("ttt");
        double n = input.nextDouble();

        System.out.println("The amount of days the money is in the account is");
        double t = input.nextDouble();

        double A = p * ((1 +((.01 * r)/ n) * (n * t)/ 365));





    }
}
