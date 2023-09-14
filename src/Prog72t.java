import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The first military time is: ");
        double f = input.nextInt();

        System.out.println("The second military time is: ");
        double s = input.nextInt();

        System.out.println("the time in coordinates is (" + f + "," + s + ")");

        double v = Math.abs(f - s);

        double n = Math.floor(v / 100);
        double k = v - n * 100;


        System.out.println("The difference in time is: " + n + "hours and " + k + "minutes");

    }
}
//The first military time is:
//900
//The second military time is:
//1730
//the time in coordinates is (900.0,1730.0)
//The difference in time is: 8.0hours and 30.0minutes

//the time in coordinates is (1730.0,900.0)
//The difference in time is: 8.0hours and 30.0minutes