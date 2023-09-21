import java.util.*;

public class Prog166f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any positive integer above 1");
        int g = input.nextInt();
        int p = 0;
        p = g%2;
        if ( p == true) {
            int h = (g + 1) * 100;
            System.out.println(1 + "-" + g + " = " + h);
        }
        else {
            int d = (g + 1) * 100 + (g/2);
            System.out.println(1 + "-" + g + " = " + d);
        }
    }
}
