import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The speed limit was: ");
        int n = input.nextInt();
        System.out.println("You were going: ");
        int h = input.nextInt();

        double p = 20.00 + ((h - n) * 5.00);

        System.out.println("Fine----------$" + p);
    }
}
