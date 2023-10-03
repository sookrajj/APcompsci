import java.util.*;

public class LP5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dice 1  Dice 2  total");
        for (int lcv = 0; lcv < 5; lcv++) {
          double r = Math.round(Math.random() * 5 + 1);
          double t = Math.round(Math.random() * 5 + 1);
          double h = r + t;
          System.out.println(r + "  " + t + "  " + h);
        }
          

    }
}
//Dice 1  Dice 2  total
//2.0  3.0  5.0
//2.0  3.0  5.0
//4.0  6.0  10.0
//1.0  5.0  6.0
//4.0  5.0  9.0