import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount of kilos you used was: ");
        double k = input.nextDouble();
        double f = k * .0475;
        double t = f * .1;
        double w = f * .03;
        double h = f * .04;
        double p = f + t + w;
        double s = p + h;

        System.out.println("   C O M P S C I Electric   " +
                "-----------------------------" +
                "Kilowatts Used             " + k +
                "-----------------------------" +
                "" +
                "Base Rate 993*.475 $ " + f +
                "Surcharge          $  " + t +
                "Citytax            $  " + w +
                "" +
                "                       ------" +
                "" +
                "Pay this amount    $ " + p +
                "" +
                "After May 20th Pay $ " + s);
    }
}
