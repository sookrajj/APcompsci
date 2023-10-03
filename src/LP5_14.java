import java.util.*;

public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dice 1  Dice 2  total");
        for (int lcv = 0; lcv < 5; lcv++) {
          double r = Math.round(Math.random() * 6);
          double t = Math.round(Math.random() * 6);
          double h = r + t;
          System.out.println(r + "  " + t + "  " + h);
        }
          

    }
}
