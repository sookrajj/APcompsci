import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The amount of pounds is: ");
        int n = input.nextInt();
        System.out.println("The amount of pences is: ");
        int p = input.nextInt();
        System.out.println("The amount of shillings is:");
        int s = input.nextInt();


        int y = n * 20 * 12;
        int d = p * 12;
        int w = y + d + s;

        double f = Math.floor(w / 100);
        double b = w - f * 100;

        System.out.println("amount = euro" + f + "." + b);
    }
}
