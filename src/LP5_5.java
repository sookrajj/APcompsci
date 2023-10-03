import java.util.*;

public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer over 100 below 1000: ");
        int y = input.nextInt();
        double r = Math.round(y / 100);
        double g = Math.round((y - (r * 100)-5) / 10);
        double h = Math.round((y - (r * 100)) - (g * 10));
        System.out.println(r);
        System.out.println(g);
        System.out.println(h);

    }
}
//Enter a positive integer over 100 below 1000:
//546
//5.0
//4.0
//6.0
