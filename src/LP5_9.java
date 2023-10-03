import java.util.*;

public class LP5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x^1  x^2  x^3  x^4  x^5")
        for (int lcv = 0; lcv < 6; lcv++) {
          double h = Math.pow(lcv, 2);
          double w = Math.pow(lcv, 3);
          double d = Math.pow(lcv, 4);
          double r = Math.pow(lcv, 5);
          System.out.println(lcv + "  " + h + "  " + w + "  " + d + "  " + r);
          

    }
}
//r
