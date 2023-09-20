import java.util.Scanner;

public class Prog122i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lcv = -26;
        double m = 1;
        double j = 3;
        double h = m / j;
        System.out.println("number      cube      Cube root");
        while (lcv < 25) {
            lcv += 1;
            double l = Math.pow(lcv, 3);
            double s = Math.abs(lcv);
            double p = Math.pow(lcv, 0.3333333333);
            if (lcv < 0) {
                double d = p * -1;
                System.out.println(lcv + "      " + l + "      " + d);

            }
            else {
                System.out.println(lcv + "      " + l + "      " + p);
            }
        }
    }
}
