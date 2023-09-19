import java.util.Scanner;

public class Prog122c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lcv = 0;
        while (lcv < 10) {
            lcv += 2;
            int m = lcv + 1;
            int l = lcv * 2;
            double d = Math.pow(lcv, 2);
            System.out.println(lcv + "      " + m + "      " + l + "      " + d);
        }
    }
}
//2      3      4      4.0
//4      5      8      16.0
//6      7      12      36.0
//8      9      16      64.0
//10      11      20      100.0