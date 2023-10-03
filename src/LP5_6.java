import java.util.*;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer over 100 below 1000: ");
        int y = input.nextInt();
        double r = Math.round(y / 100);
        double g = Math.round((y - (r * 100)) / 10);
        double h = Math.round((y - (r * 100)) - (g * 10));
        double t = r + g + h;
        System.out.println(t);
        

    }
}
//r
