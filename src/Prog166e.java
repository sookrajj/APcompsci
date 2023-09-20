import java.util.*;

public class Prog166e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = 1;
        int t = 2;
        double lcv = y / t;
        if (t < 16) {
            if (y == t) {
                double s = y / t;
                System.out.println(y + "/" + t + "      " + s);
                y = 1;
                t += 1;
            }
            double p = y / t;
            System.out.println(y + "/" + t + "      " + p);
            y += 1;
        }
    }
}
