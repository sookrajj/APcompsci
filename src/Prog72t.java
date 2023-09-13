import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The first military time is: ");
        double f = input.nextInt();

        System.out.println("The second military time is: ");
        double s = input.nextInt();

        System.out.println("the time in coordinates is (" + f + "," + s + ")");

        if (f > s) {
            double m = f - s;
            double n = Math.floor(m / 60);
            double k = m - n;
            k = l;
        } else {
            double m = s - f;
            double n = Math.floor(m / 60);
            double k = m - n;
            k = l;
        }


        System.out.println("The difference in time is: " + n + "hours and " + k + "minutes");
    }
}
