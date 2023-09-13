import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount due is: ");
        double d = input.nextDouble();

        System.out.println("How much money you pay: ");
        double m = input.nextDouble();

        double t = m - d;
        System.out.println("The amount of change: " + t);
        double o = Math.floor(t/1);
        double h = t - o;
        double q = Math.floor(h/.25);
        double n = h - q * .25;
        double di = Math.floor(n/.1);
        double ci = n - di * .1;
        double ni = Math.floor(ci/.05);
        double oi = ci - ni * .05;
        double p = Math.floor(oi/.01);
        System.out.println("The amount of dollars is: " + o);
        System.out.println("The amount of quarters is: " + q);
        System.out.println("The amount of dimes is: " + di);
        System.out.println("The amount of nickels is: " + ni);
        System.out.println("The amount of pennies is: " + p);




    }
}
//The amount due is:
//125.32
//How much money you pay:
//140.00
//The amount of change: 14.680000000000007
//The amount of dollars is: 14.0
//The amount of quarters is: 2.0
//The amount of dimes is: 1.0
//The amount of nickels is: 1.0
//The amount of pennies is: 3.0