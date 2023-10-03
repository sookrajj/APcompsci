import java.util.*;

public class LP5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x^1  x^2  x^3  x^4  x^5");
        for (int lcv = 0; lcv < 6; lcv++) {
            double h = Math.pow(lcv, 2);
            double w = Math.pow(lcv, 3);
            double d = Math.pow(lcv, 4);
            double r = Math.pow(lcv, 5);
            System.out.println(lcv + "  " + h + "  " + w + "  " + d + "  " + r);
        }
    }
}
//x^1  x^2  x^3  x^4  x^5
//0  0.0  0.0  0.0  0.0
//1  1.0  1.0  1.0  1.0
//2  4.0  8.0  16.0  32.0
//3  9.0  27.0  81.0  243.0
//4  16.0  64.0  256.0  1024.0
//5  25.0  125.0  625.0  3125.0
