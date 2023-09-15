import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount of kilos you used was: ");
        double k = input.nextDouble();
        double f = k * .0475;
        double i = Math.round(f * 100) / 100.0;
        double t = i * .1;
        double v = Math.round(t * 100) / 100.0;
        double w = i * .03;
        double b = Math.round(w * 100) / 100.0;
        double h = i * .04;
        double m = Math.round(h * 100) / 100.0;
        double p = i + v + b;
        double s = p + m;

        System.out.println("   C O M P S C I Electric   ");
        System.out.println("-----------------------------");
        System.out.println("Kilowatts Used             " + k);
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Base Rate 993*.475     $ " + i);
        System.out.println("Surcharge             $  " + v);
        System.out.println("Citytax               $  " + b);
        System.out.println("");
        System.out.println("                       ------");
        System.out.println("");
        System.out.println("Pay this amount        $ " + p);
        System.out.println("");
        System.out.println("After May 20th Pay     $ " + s);

    }
}
